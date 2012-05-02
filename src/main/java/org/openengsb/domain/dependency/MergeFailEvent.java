package org.openengsb.domain.dependency;

import org.openengsb.core.api.Event;

public class MergeFailEvent extends Event {

    private String output;

    public MergeFailEvent() {
    }

    public MergeFailEvent(long processId, String output) {
        super(processId);
        this.output = output;
    }

    public String getOutput() {
        return output;
    }
}
