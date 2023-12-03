package gu;

import gu.a;
import gu.n;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
/* compiled from: AbstractParser.java */
/* loaded from: classes2.dex */
public abstract class b<MessageType extends n> implements p<MessageType> {
    static {
        int i6 = e.f16848b;
    }

    public static void b(n nVar) {
        UninitializedMessageException uninitializedMessageException;
        if (nVar != null && !nVar.d()) {
            if (nVar instanceof a) {
                a aVar = (a) nVar;
                uninitializedMessageException = new UninitializedMessageException();
            } else {
                uninitializedMessageException = new UninitializedMessageException();
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(uninitializedMessageException.getMessage());
            invalidProtocolBufferException.f23476u = nVar;
            throw invalidProtocolBufferException;
        }
    }

    public final n c(ByteArrayInputStream byteArrayInputStream, e eVar) {
        n nVar;
        try {
            int read = byteArrayInputStream.read();
            if (read == -1) {
                nVar = null;
            } else {
                if ((read & 128) != 0) {
                    read &= 127;
                    int i6 = 7;
                    while (true) {
                        if (i6 < 32) {
                            int read2 = byteArrayInputStream.read();
                            if (read2 != -1) {
                                read |= (read2 & 127) << i6;
                                if ((read2 & 128) == 0) {
                                    break;
                                }
                                i6 += 7;
                            } else {
                                throw InvalidProtocolBufferException.b();
                            }
                        } else {
                            while (i6 < 64) {
                                int read3 = byteArrayInputStream.read();
                                if (read3 != -1) {
                                    if ((read3 & 128) != 0) {
                                        i6 += 7;
                                    }
                                } else {
                                    throw InvalidProtocolBufferException.b();
                                }
                            }
                            throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
                        }
                    }
                }
                d dVar = new d(new a.AbstractC0262a.C0263a(byteArrayInputStream, read));
                n nVar2 = (n) a(dVar, eVar);
                try {
                    dVar.a(0);
                    nVar = nVar2;
                } catch (InvalidProtocolBufferException e10) {
                    e10.f23476u = nVar2;
                    throw e10;
                }
            }
            b(nVar);
            return nVar;
        } catch (IOException e11) {
            throw new InvalidProtocolBufferException(e11.getMessage());
        }
    }
}
