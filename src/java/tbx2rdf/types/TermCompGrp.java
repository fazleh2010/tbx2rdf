package tbx2rdf.types;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.Resource;
import java.util.ArrayList;
import java.util.List;
import tbx2rdf.Mappings;
import tbx2rdf.vocab.ONTOLEX;

/**
 *
 * @author John McCrae
 */
public class TermCompGrp extends NoteLinkInfo {
    public final TermComp termComp;
    public final List<TermNoteGrp> termNoteGrps = new ArrayList<TermNoteGrp>();

    public TermCompGrp(TermComp termComp, String language, Mappings mappings) {
        super(language, mappings);
        this.termComp = termComp;
    }

    @Override
    public void toRDF(Model model, Resource parent) {
        final Resource component = (id == null ? termComp.getRes(model) : getRes(model));
        parent.addProperty(ONTOLEX.constituent, component);
        termComp.toRDF(model, component);
        for(TermNoteGrp termNoteGrp : termNoteGrps) {
            termNoteGrp.toRDF(model, component);
        }
        super.toRDF(model, component);
    }
}
