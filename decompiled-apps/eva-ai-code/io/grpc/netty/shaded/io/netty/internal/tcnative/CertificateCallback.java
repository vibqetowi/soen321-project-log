package io.grpc.netty.shaded.io.netty.internal.tcnative;
/* loaded from: classes4.dex */
public interface CertificateCallback {
    public static final byte TLS_CT_DSS_FIXED_DH = 4;
    public static final byte TLS_CT_DSS_SIGN = 2;
    public static final byte TLS_CT_ECDSA_FIXED_ECDH = 66;
    public static final byte TLS_CT_ECDSA_SIGN = 64;
    public static final byte TLS_CT_RSA_FIXED_DH = 3;
    public static final byte TLS_CT_RSA_FIXED_ECDH = 65;
    public static final byte TLS_CT_RSA_SIGN = 1;

    void handle(long j, byte[] bArr, byte[][] bArr2) throws Exception;
}
