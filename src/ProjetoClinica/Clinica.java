package ProjetoClinica;

public class Clinica {
      public static  void  main(String args[]){
      Paciente paciente = new Paciente();
      paciente.nome = "fulano";
      paciente.endereco = "jurunas";
      paciente.numeroCartao = 232312;

      Medico medico = new Medico();
      medico.nome = "pedro";
      medico.endereco = "Umarizal";
      medico.crm = 12312;
      medico.especialidade = "cardiologista";

      AtendimentoMedico atendimento = new AtendimentoMedico();
      atendimento.dataConsulta= "20/04/2015";
      atendimento.paciente=paciente;
      atendimento.medico=medico;
      }
}
