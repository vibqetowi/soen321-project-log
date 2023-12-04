package io.grpc.netty.shaded.io.netty.handler.ssl;

import io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator;
import io.grpc.netty.shaded.io.netty.buffer.UnpooledByteBufAllocator;
import io.grpc.netty.shaded.io.netty.internal.tcnative.SSL;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLException;
import javax.net.ssl.X509KeyManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class OpenSslKeyMaterialProvider {
    private final X509KeyManager keyManager;
    private final String password;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void destroy() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OpenSslKeyMaterialProvider(X509KeyManager x509KeyManager, String str) {
        this.keyManager = x509KeyManager;
        this.password = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void validateKeyMaterialSupported(X509Certificate[] x509CertificateArr, PrivateKey privateKey, String str) throws SSLException {
        validateSupported(x509CertificateArr);
        validateSupported(privateKey, str);
    }

    private static void validateSupported(PrivateKey privateKey, String str) throws SSLException {
        long bio;
        if (privateKey == null) {
            return;
        }
        long j = 0;
        try {
            try {
                bio = ReferenceCountedOpenSslContext.toBIO(UnpooledByteBufAllocator.DEFAULT, privateKey);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            long parsePrivateKey = SSL.parsePrivateKey(bio, str);
            SSL.freeBIO(bio);
            if (parsePrivateKey != 0) {
                SSL.freePrivateKey(parsePrivateKey);
            }
        } catch (Exception e2) {
            e = e2;
            throw new SSLException("PrivateKey type not supported " + privateKey.getFormat(), e);
        } catch (Throwable th2) {
            th = th2;
            j = bio;
            SSL.freeBIO(j);
            throw th;
        }
    }

    private static void validateSupported(X509Certificate[] x509CertificateArr) throws SSLException {
        long bio;
        if (x509CertificateArr == null || x509CertificateArr.length == 0) {
            return;
        }
        long j = 0;
        PemEncoded pemEncoded = null;
        try {
            try {
                pemEncoded = PemX509Certificate.toPEM(UnpooledByteBufAllocator.DEFAULT, true, x509CertificateArr);
                bio = ReferenceCountedOpenSslContext.toBIO(UnpooledByteBufAllocator.DEFAULT, pemEncoded.retain());
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            long parseX509Chain = SSL.parseX509Chain(bio);
            SSL.freeBIO(bio);
            if (parseX509Chain != 0) {
                SSL.freeX509Chain(parseX509Chain);
            }
            if (pemEncoded != null) {
                pemEncoded.release();
            }
        } catch (Exception e2) {
            e = e2;
            throw new SSLException("Certificate type not supported", e);
        } catch (Throwable th2) {
            th = th2;
            j = bio;
            SSL.freeBIO(j);
            if (pemEncoded != null) {
                pemEncoded.release();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public X509KeyManager keyManager() {
        return this.keyManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OpenSslKeyMaterial chooseKeyMaterial(ByteBufAllocator byteBufAllocator, String str) throws Exception {
        long j;
        long j2;
        long j3;
        long j4;
        OpenSslKeyMaterial defaultOpenSslKeyMaterial;
        X509Certificate[] certificateChain = this.keyManager.getCertificateChain(str);
        if (certificateChain == null || certificateChain.length == 0) {
            return null;
        }
        PrivateKey privateKey = this.keyManager.getPrivateKey(str);
        PemEncoded pem = PemX509Certificate.toPEM(byteBufAllocator, true, certificateChain);
        long j5 = 0;
        try {
            j2 = ReferenceCountedOpenSslContext.toBIO(byteBufAllocator, pem.retain());
            try {
                j3 = SSL.parseX509Chain(j2);
                try {
                    if (privateKey instanceof OpenSslPrivateKey) {
                        defaultOpenSslKeyMaterial = ((OpenSslPrivateKey) privateKey).newKeyMaterial(j3, certificateChain);
                    } else {
                        j = ReferenceCountedOpenSslContext.toBIO(byteBufAllocator, privateKey);
                        if (privateKey == null) {
                            j4 = 0;
                        } else {
                            try {
                                j4 = SSL.parsePrivateKey(j, this.password);
                            } catch (Throwable th) {
                                th = th;
                                j4 = 0;
                                SSL.freeBIO(j2);
                                SSL.freeBIO(j);
                                if (j3 != 0) {
                                }
                                if (j4 != 0) {
                                }
                                pem.release();
                                throw th;
                            }
                        }
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            defaultOpenSslKeyMaterial = new DefaultOpenSslKeyMaterial(j3, j4, certificateChain);
                            j5 = j;
                        } catch (Throwable th3) {
                            th = th3;
                            j = j;
                            SSL.freeBIO(j2);
                            SSL.freeBIO(j);
                            if (j3 != 0) {
                            }
                            if (j4 != 0) {
                            }
                            pem.release();
                            throw th;
                        }
                    }
                    SSL.freeBIO(j2);
                    SSL.freeBIO(j5);
                    pem.release();
                    return defaultOpenSslKeyMaterial;
                } catch (Throwable th4) {
                    th = th4;
                    j = 0;
                    j4 = 0;
                }
            } catch (Throwable th5) {
                th = th5;
                j = 0;
                j3 = 0;
                j4 = j3;
                SSL.freeBIO(j2);
                SSL.freeBIO(j);
                if (j3 != 0) {
                    SSL.freeX509Chain(j3);
                }
                if (j4 != 0) {
                    SSL.freePrivateKey(j4);
                }
                pem.release();
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            j = 0;
            j2 = 0;
            j3 = 0;
        }
    }
}
