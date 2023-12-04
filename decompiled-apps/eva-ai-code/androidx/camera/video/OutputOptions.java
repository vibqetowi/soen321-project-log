package androidx.camera.video;
/* loaded from: classes.dex */
public abstract class OutputOptions {
    public static final int FILE_SIZE_UNLIMITED = 0;

    /* loaded from: classes.dex */
    interface Builder<T extends OutputOptions, B> {
        T build();

        B setFileSizeLimit(long j);
    }

    public abstract long getFileSizeLimit();
}
