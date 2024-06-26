from flask import Flask, jsonify
from unidecode import unidecode
import requests

app = Flask(__name__)

def obter_cidades_por_estado(estado):
    url = f'https://servicodados.ibge.gov.br/api/v1/localidades/estados/{estado}/municipios'
    response = requests.get(url)
    if response.status_code == 200:
        cidades = sorted(response.json(), key=lambda x: unidecode(x['nome']).lower())
        return cidades
    else:
        print(f"Erro ao obter os municípios do estado {estado}.")
        return []

def obter_cidades_brasil():
    url = 'https://servicodados.ibge.gov.br/api/v1/localidades/municipios'
    response = requests.get(url)
    if response.status_code == 200:
        cidades = sorted(response.json(), key=lambda x: unidecode(x['nome']).lower())
        return cidades
    else:
        print("Erro ao obter as cidades do Brasil.")
        return []

@app.route('/cidades/<estado>')
def cidades_por_estado(estado):
    cidades_estado = obter_cidades_por_estado(estado)
    return jsonify(cidades_estado)

@app.route('/cidades-brasil')
def todas_cidades_brasil():
    cidades_brasil = obter_cidades_brasil()
    return jsonify(cidades_brasil)

if __name__ == '__main__':
    app.run(debug=True)
