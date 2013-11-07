package org.jenkinsci.plugins.BuildFailShouter.buildListeners;

import hudson.console.ConsoleNote;
import hudson.model.BuildListener;
import hudson.model.Cause;
import hudson.model.Result;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;

public abstract class BuildAdapter implements BuildListener
{
    public void started(List<Cause> causes){}

    public void finished(Result result){}

    public void annotate(ConsoleNote ann) throws IOException{}

    public void hyperlink(String url, String text) throws IOException{}

    public PrintStream getLogger()
    {
        throw new UnsupportedOperationException();
    }

    public PrintWriter error(String msg)
    {
        throw new UnsupportedOperationException();
    }

    public PrintWriter error(String format, Object... args)
    {
        throw new UnsupportedOperationException();
    }

    public PrintWriter fatalError(String msg)
    {
        throw new UnsupportedOperationException();
    }

    public PrintWriter fatalError(String format, Object... args)
    {
        throw new UnsupportedOperationException();
    }
}
