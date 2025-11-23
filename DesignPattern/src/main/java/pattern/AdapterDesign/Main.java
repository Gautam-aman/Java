package pattern.AdapterDesign;

// This is object Adapter
// We also have class Adapter

interface Report{
    public void getReport();
}


class XMLReport{
    public void getReportInXML(){
        System.out.println("Report in Xml");
    }
}

class XMLtoStringAdapter implements Report{
    XMLReport xmlReport;
    public XMLtoStringAdapter(XMLReport xmlReport){
        this.xmlReport = xmlReport;
    }
    @Override
    public void getReport() {
        System.out.println("Report in string");
        xmlReport.getReportInXML();
    }
}

class Client{

    void getReport(XMLtoStringAdapter xmltoStringAdapter){
        xmltoStringAdapter.getReport();
    }
}



public class Main {
    public static void main(String[] args) {
        XMLReport xmlReport = new XMLReport();
        XMLtoStringAdapter xmltoStringAdapter = new XMLtoStringAdapter(xmlReport);
        Client client = new Client();
        client.getReport(xmltoStringAdapter);
    }
}
