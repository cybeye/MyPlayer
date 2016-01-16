package tv.danmaku.ijk.media.widget;

/**
 * Created by billyyoyo on 16-1-15.
 */
public class Settings {

    public static final int PV_PLAYER__Auto = 0;
    public static final int PV_PLAYER__AndroidMediaPlayer = 1;
    public static final int PV_PLAYER__IjkMediaPlayer = 2;

    private int playerType;
    private boolean surfaceViewAvailable;
    private boolean textureViewAvailable;
    private boolean noViewAvailable;
    private boolean usingMediaCodecAvailable;
    private boolean usingMediaCodecAutoRotateAvailable;
    private boolean usingOpenSLESAvailable;
    private boolean detachedSurfaceTextureViewAvailable;
    private String pixelFormat;

    public int getPlayerType() {
        return playerType;
    }

    public boolean getEnableSurfaceView() {
        return surfaceViewAvailable;
    }

    public boolean getEnableTextureView() {
        return textureViewAvailable;
    }

    public boolean getEnableNoView() {
        return noViewAvailable;
    }

    public boolean getUsingMediaCodec() {
        return usingMediaCodecAvailable;
    }

    public boolean getUsingMediaCodecAutoRotate() {
        return usingMediaCodecAutoRotateAvailable;
    }

    public boolean getUsingOpenSLES() {
        return usingOpenSLESAvailable;
    }

    public boolean getEnableDetachedSurfaceTextureView() {
        return detachedSurfaceTextureViewAvailable;
    }

    public String getPixelFormat() {
        return pixelFormat;
    }

    public static Settings getDefaultSettings(){
        Settings settings = new Settings();
        settings.playerType = PV_PLAYER__IjkMediaPlayer;
        settings.surfaceViewAvailable = true;
        settings.textureViewAvailable = false;
        settings.noViewAvailable = false;
        settings.usingMediaCodecAvailable = true;
        settings.usingMediaCodecAutoRotateAvailable = false;
        settings.usingOpenSLESAvailable = true;
        settings.detachedSurfaceTextureViewAvailable = false;
        settings.pixelFormat = "";
        return settings;
    }

}
