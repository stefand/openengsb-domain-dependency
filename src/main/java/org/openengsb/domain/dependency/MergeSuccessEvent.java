package org.openengsb.domain.dependency;

import org.openengsb.core.api.Event;
import org.openengsb.core.api.model.OpenEngSBFileModel;

public class MergeSuccessEvent extends Event {

    private String output;
    private OpenEngSBFileModel path;

    public MergeSuccessEvent(long processId, OpenEngSBFileModel path) {
        super(processId);
        this.path = path;
    }

    public MergeSuccessEvent(long processId, OpenEngSBFileModel path, String output) {
        super(processId);
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
