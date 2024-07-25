// package DAO;

// import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.util.LinkedList;

// import Model.Funcionario;


// public class FuncionarioDAO {
    
//      private ConexaoDB conexao;

//      public FuncionarioDAO(){
//           this.conexao = new ConexaoDB();
//      }

//      public void inserir (Funcionario funcionario){
//           String sql = "INSERT INTO Funcionario(idFuncionario, nome, cargo, departamento) VALUES(?, ?, ?, ?)";
//         try {
//             PreparedStatement pst = conexao.getConexaoDB().prepareStatement(sql);
//             pst.setInt(1, funcionario.getIdFuncionario(0));
//             pst.setString(2, funcionario.getNomeFuncionario(sql));
//             pst.setString(3, funcionario.getCargo(sql));
//             pst.setString(4, funcionario.getDepartamento(sql));
//             pst.execute();

//             System.out.println("Inserção ok: " + funcionario);
//         }catch (Exception e){
//             System.out.println("Falha na inserção: " + e.getMessage());
//         } 
//     } 

    // public static String listarFuncionarios(){
    //  String sql = "SELECT * FROM Funcionario";
    //  return sql;
    // }

//     public Funcionario atualizarFuncionarios (int idFuncionario){
//         Funcionario obj = null;
//         String sql = "SELECT * FROM Funcionario WHERE idFuncionario = ?";
//         try {
//             PreparedStatement pst = conexao.getConexaoDB().prepareStatement(sql);
//             pst.setInt(1, idFuncionario);
//             ResultSet resultados = pst.executeQuery();
//             if (resultados.next()){
//                 int idFuncionario = resultados.getInt("idFuncionario");
//                 String nome = resultados.getString("nome");
//                 String cargo = resultados.getString("cargo");
//                 String departamento = resultados.getString("departamento");
                
//                 obj.getIdFuncionario(idFuncionario);
//                 obj.setNomeFuncionario(nome);
//                 obj.setCargo(cargo);
//                 obj.setDepartamento(departamento);
//             } else {
//                 System.out.println("Funcionario não encontrado.");
//             }
//         }catch (SQLException e){
//             System.out.println("Falha na consulta: " + e.getMessage());
//         } 
//         return obj;
//     }

//     public void removerFuncionarios(int idFuncionario){
//         String sql = "DELETE FROM Funcionario WHERE idFuncionario = ?";
//         try{
//             PreparedStatement pst = conexao.getConexaoDB().prepareStatement(sql);
//             pst.setInt(1, id);
//             pst.executeUpdate();
//             System.out.println("Funcionario excluído.");
//         } catch (SQLException e) {
//             System.out.println("Falha na exclusão: " + e.getMessage());
//         } 
//     }

//     public void atualizarFuncionarios (Funcionario funcionario){
//         String sql = "UPDATE Funcionario SET id = ?, nome = ? WHERE idFuncionario = ?";
//         try {
//             PreparedStatement pst = conexao.getConexaoDB().prepareStatement(sql);
//             pst.setInt(1, funcionario.getIdFuncionario(0));
//             pst.setString(2, funcionario.nomeFuncionario());
//             pst.setString(3, funcionario.getCargo(sql));
//             pst.setString(4, funcionario.getDepartamento(sql));

//             int resultado = pst.executeUpdate();
//             if (resultado > 0){
//                 System.out.println("Funcionário atualizado com sucesso: " + funcionario);
//             }
//             else {
//                 System.out.println("Funcionário não encontrado.");
//             }
//         } catch (SQLException e) {
//             System.out.println("Falha na atualização: " + e.getMessage());
//         } 
//     }
// }
     

