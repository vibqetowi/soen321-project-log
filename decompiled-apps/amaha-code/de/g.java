package de;

import com.google.firebase.encoders.EncodingException;
/* compiled from: ProtobufValueEncoderContext.java */
/* loaded from: classes.dex */
public final class g implements ae.f {

    /* renamed from: a  reason: collision with root package name */
    public boolean f12831a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12832b = false;

    /* renamed from: c  reason: collision with root package name */
    public ae.b f12833c;

    /* renamed from: d  reason: collision with root package name */
    public final e f12834d;

    public g(e eVar) {
        this.f12834d = eVar;
    }

    @Override // ae.f
    public final ae.f c(String str) {
        if (!this.f12831a) {
            this.f12831a = true;
            this.f12834d.c(this.f12833c, str, this.f12832b);
            return this;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override // ae.f
    public final ae.f d(boolean z10) {
        if (!this.f12831a) {
            this.f12831a = true;
            this.f12834d.d(this.f12833c, z10 ? 1 : 0, this.f12832b);
            return this;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }
}
