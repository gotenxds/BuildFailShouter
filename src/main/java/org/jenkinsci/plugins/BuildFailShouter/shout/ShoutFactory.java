package org.jenkinsci.plugins.BuildFailShouter.shout;

import java.applet.AudioClip;

public class ShoutFactory
{
    private final AudioClip audioClip;

    public ShoutFactory(AudioClip audioClip)
    {
        this.audioClip = audioClip;
    }

}
