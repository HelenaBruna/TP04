public class TestarData {
    public static void main(String[] args) {

        Data date = new Data();

        System.out.println("DATA: " + date.mostra1());
        System.out.println("DATA: " + date.mostra2());
        System.out.println("DIAS CORRIDOS: " + date.diasTranscorridos());
        System.out.println("DIA: " + date.retDia());
        System.out.println("MES: " + date.retMes());
        System.out.println("ANO: " + date.retAno());

        System.out.println("--------------------------------------");

        date.entraDia();
        date.entraMes();
        date.entraAno();

        System.out.println("DATE: " + date.mostra1());
        System.out.println("DATA: " + date.mostra2());
        System.out.println("DIAS CORRIDOS: " + date.diasTranscorridos());
        System.out.println("DIA: " + date.retDia());
        System.out.println("MES: " + date.retMes());
        System.out.println("ANO: " + date.retAno());

    }
}
