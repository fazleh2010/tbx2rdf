package tbx2rdf.vocab;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.vocabulary.DCTerms;

/**
 * Class with some common static terms 
 * @author vroddon
 */
public class TBX {
    private static Model defaultModel = ModelFactory.createDefaultModel();
     public static Resource SkosConcept = defaultModel.createResource("http://www.w3.org/2004/02/skos/core#Concept");
     public static Resource Context = defaultModel.createResource("http://lider-project.eu/tbx#Context");
     public static Resource Descrip = defaultModel.createResource("http://lider-project.eu/tbx#Descrip");
     public static Resource MartifHeader = defaultModel.createResource("http://lider-project.eu/tbx#MartifHeader");
     public static Resource Admin = defaultModel.createResource("http://lider-project.eu/tbx#Admin");
     public static Resource TermNote = defaultModel.createResource("http://lider-project.eu/tbx#TermNote");
     public static Resource Transaction = defaultModel.createResource("http://lider-project.eu/tbx#transaction");
     
     
     public static Property subjectField = defaultModel.createProperty("http://lider-project.eu/tbx#subjectField");
     public static Property description = defaultModel.createProperty("http://lider-project.eu/tbx#description");
     public static Property target = defaultModel.createProperty("http://lider-project.eu/tbx#target");
     public static Property type = defaultModel.createProperty("http://lider-project.eu/tbx#type");
     public static Property context = defaultModel.createProperty("http://lider-project.eu/tbx#context");
     public static Property value = defaultModel.createProperty("http://lider-project.eu/tbx#value");
     public static Property status = defaultModel.createProperty("http://lider-project.eu/tbx#status");
     public static Property definition = defaultModel.createProperty("http://lider-project.eu/tbx#definition");
     public static Property source = defaultModel.createProperty("http://lider-project.eu/tbx#source");
     public static Property xref = defaultModel.createProperty("http://lider-project.eu/tbx#xreference");
     public static Property datatype = defaultModel.createProperty("http://lider-project.eu/tbx#datatype");
     public static Property language = defaultModel.createProperty("http://lider-project.eu/tbx#language");
     public static Property note = defaultModel.createProperty("http://lider-project.eu/tbx#note");
     public static Property encodingDesc = defaultModel.createProperty("http://lider-project.eu/tbx#encodingDesc");
     public static Property revisionDesc = defaultModel.createProperty("http://lider-project.eu/tbx#revisionDesc");
     public static Property publicationStmt = defaultModel.createProperty("http://lider-project.eu/tbx#publicationStmt");
     public static Property sourceDesc = defaultModel.createProperty("http://lider-project.eu/tbx#sourceDesc");
     public static Property admin = defaultModel.createProperty("http://lider-project.eu/tbx#admin");
     public static Property termNote = defaultModel.createProperty("http://lider-project.eu/tbx#termNote");
     public static Property transaction = defaultModel.createProperty("http://lider-project.eu/tbx#transaction");
    
    
    /**
     * Adds the most common prefixes to the generated model
     * 
     */
    public static void addPrefixesToModel(Model model)
    {
        model.setNsPrefix("tbx", "http://lider-project.eu/tbx#");
        model.setNsPrefix("ontolex", "http://www.w3.org/ns/ontolex#");
        model.setNsPrefix("skos", "http://www.w3.org/2004/02/skos/core#");
        model.setNsPrefix("odrl", "http://www.w3.org/ns/odrl/2/"); //http://w3.org/ns/odrl/2/
        model.setNsPrefix("dct", "http://purl.org/dc/terms/");
        model.setNsPrefix("rdf", "http://www.w3.org/1999/02/22-rdf-syntax-ns#");
        model.setNsPrefix("rdfs", "http://www.w3.org/2000/01/rdf-schema#");
        model.setNsPrefix("cc", "http://creativecommons.org/ns#");
        model.setNsPrefix("ldr", "http://purl.oclc.org/NET/ldr/ns#");
        model.setNsPrefix("void", "http://rdfs.org/ns/void#");
        model.setNsPrefix("dcat", "http://www.w3.org/ns/dcat#");
        model.setNsPrefix("gr", "http://purl.org/goodrelations/");
        model.setNsPrefix("prov", "http://www.w3.org/ns/prov#");
    }    
     
}
