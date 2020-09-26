package hr.documents;

/*
Common interface used in application when there is
a need for document exports
 */
public interface ExportableDocument {
    byte[] toPdf();

    String toJson();

    String toTxt();
}


//this is a large interface which violate the interface segregation principle so that we are going to split this
//interface to smaller interface that align with ISP principle.It doesn't harm previous code as we can implements
//all the interfaces to the rehired classes
