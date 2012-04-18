package org.openengsb.domain.dependency;

import org.openengsb.core.api.Event;
import org.openengsb.core.api.model.OpenEngSBFileModel;

public class MergeSuccessEvent extends Event {

    private String output;
    private OpenEngSBFileModel path;

    public MergeSuccessEvent(OpenEngSBFileModel path) {
        this.path = path;
    }

    public MergeSuccessEvent(OpenEngSBFileModel path, String output) {
        this.path = path;
        this.output = output;
    }

    public String getOutput() {
        return output;
    }

    public OpenEngSBFileModel getPath() {
        return path;
    }
}
