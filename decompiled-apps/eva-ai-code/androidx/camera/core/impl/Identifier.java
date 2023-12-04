package androidx.camera.core.impl;
/* loaded from: classes.dex */
public abstract class Identifier {
    public abstract Object getValue();

    public static Identifier create(Object obj) {
        return new AutoValue_Identifier(obj);
    }
}
