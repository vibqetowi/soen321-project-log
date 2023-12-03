package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import u7.v;
/* loaded from: classes.dex */
public abstract class TagPayloadReader {

    /* renamed from: a  reason: collision with root package name */
    public final v f6477a;

    /* loaded from: classes.dex */
    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, null, false, 1);
        }
    }

    public TagPayloadReader(v vVar) {
        this.f6477a = vVar;
    }
}
