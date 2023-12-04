package io.grpc.alts.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* loaded from: classes4.dex */
interface AeadCrypter {
    void decrypt(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, byte[] bArr) throws GeneralSecurityException;

    void decrypt(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, byte[] bArr) throws GeneralSecurityException;

    void encrypt(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, byte[] bArr) throws GeneralSecurityException;

    void encrypt(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, byte[] bArr) throws GeneralSecurityException;
}
