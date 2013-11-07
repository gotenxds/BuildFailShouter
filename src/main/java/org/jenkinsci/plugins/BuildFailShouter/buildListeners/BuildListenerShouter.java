package org.jenkinsci.plugins.BuildFailShouter.buildListeners;

import hudson.model.Cause;
import hudson.model.Result;


import java.util.List;

public class BuildListenerShouter extends BuildAdapter
{

    public void started(List<Cause> causes)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void finished(Result result)
    {
        if (result.equals(Result.FAILURE))
        {

        }
    }
}
