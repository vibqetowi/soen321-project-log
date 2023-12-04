package io.grpc.netty.shaded.io.netty.handler.ssl.util;

import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.buffer.Unpooled;
import io.grpc.netty.shaded.io.netty.handler.codec.base64.Base64;
import io.grpc.netty.shaded.io.netty.util.CharsetUtil;
import io.grpc.netty.shaded.io.netty.util.internal.SystemPropertyUtil;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLogger;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLoggerFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Date;
/* loaded from: classes4.dex */
public final class SelfSignedCertificate {
    private final X509Certificate cert;
    private final File certificate;
    private final PrivateKey key;
    private final File privateKey;
    private static final InternalLogger logger = InternalLoggerFactory.getInstance(SelfSignedCertificate.class);
    private static final Date DEFAULT_NOT_BEFORE = new Date(SystemPropertyUtil.getLong("io.grpc.netty.shaded.io.netty.selfSignedCertificate.defaultNotBefore", System.currentTimeMillis() - 31536000000L));
    private static final Date DEFAULT_NOT_AFTER = new Date(SystemPropertyUtil.getLong("io.grpc.netty.shaded.io.netty.selfSignedCertificate.defaultNotAfter", 253402300799000L));
    private static final int DEFAULT_KEY_LENGTH_BITS = SystemPropertyUtil.getInt("io.grpc.netty.shaded.io.netty.handler.ssl.util.selfSignedKeyStrength", 2048);

    public SelfSignedCertificate() throws CertificateException {
        this(DEFAULT_NOT_BEFORE, DEFAULT_NOT_AFTER, CipherStorageKeystoreRsaEcb.ALGORITHM_RSA, DEFAULT_KEY_LENGTH_BITS);
    }

    public SelfSignedCertificate(Date date, Date date2) throws CertificateException {
        this("localhost", date, date2, CipherStorageKeystoreRsaEcb.ALGORITHM_RSA, DEFAULT_KEY_LENGTH_BITS);
    }

    public SelfSignedCertificate(Date date, Date date2, String str, int i) throws CertificateException {
        this("localhost", date, date2, str, i);
    }

    public SelfSignedCertificate(String str) throws CertificateException {
        this(str, DEFAULT_NOT_BEFORE, DEFAULT_NOT_AFTER, CipherStorageKeystoreRsaEcb.ALGORITHM_RSA, DEFAULT_KEY_LENGTH_BITS);
    }

    public SelfSignedCertificate(String str, String str2, int i) throws CertificateException {
        this(str, DEFAULT_NOT_BEFORE, DEFAULT_NOT_AFTER, str2, i);
    }

    public SelfSignedCertificate(String str, Date date, Date date2) throws CertificateException {
        this(str, ThreadLocalInsecureRandom.current(), DEFAULT_KEY_LENGTH_BITS, date, date2, CipherStorageKeystoreRsaEcb.ALGORITHM_RSA);
    }

    public SelfSignedCertificate(String str, Date date, Date date2, String str2, int i) throws CertificateException {
        this(str, ThreadLocalInsecureRandom.current(), i, date, date2, str2);
    }

    public SelfSignedCertificate(String str, SecureRandom secureRandom, int i) throws CertificateException {
        this(str, secureRandom, i, DEFAULT_NOT_BEFORE, DEFAULT_NOT_AFTER, CipherStorageKeystoreRsaEcb.ALGORITHM_RSA);
    }

    public SelfSignedCertificate(String str, SecureRandom secureRandom, String str2, int i) throws CertificateException {
        this(str, secureRandom, i, DEFAULT_NOT_BEFORE, DEFAULT_NOT_AFTER, str2);
    }

    public SelfSignedCertificate(String str, SecureRandom secureRandom, int i, Date date, Date date2) throws CertificateException {
        this(str, secureRandom, i, date, date2, CipherStorageKeystoreRsaEcb.ALGORITHM_RSA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.security.KeyPair] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.io.FileInputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SelfSignedCertificate(String str, SecureRandom secureRandom, int i, Date date, Date date2, String str2) throws CertificateException {
        CertificateException certificateException;
        String[] generate;
        File file;
        Throwable th;
        Exception e;
        if (!str2.equalsIgnoreCase("EC") && !str2.equalsIgnoreCase(CipherStorageKeystoreRsaEcb.ALGORITHM_RSA)) {
            throw new IllegalArgumentException("Algorithm not valid: " + str2);
        }
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(str2);
            keyPairGenerator.initialize(i, secureRandom);
            ?? generateKeyPair = keyPairGenerator.generateKeyPair();
            try {
                generate = OpenJdkSelfSignedCertGenerator.generate(str, generateKeyPair, secureRandom, date, date2, str2);
            } finally {
                try {
                    file = new File(generate[0]);
                    this.certificate = file;
                    this.privateKey = new File(generate[1]);
                    this.key = generateKeyPair.getPrivate();
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            this.cert = (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(fileInputStream);
                            try {
                                fileInputStream.close();
                            } catch (IOException e2) {
                                if (logger.isWarnEnabled()) {
                                    logger.warn("Failed to close a file: " + this.certificate, (Throwable) e2);
                                    return;
                                }
                                return;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            throw new CertificateEncodingException(e);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (generateKeyPair != 0) {
                            try {
                                generateKeyPair.close();
                            } catch (IOException e4) {
                                if (logger.isWarnEnabled()) {
                                    logger.warn("Failed to close a file: " + this.certificate, (Throwable) e4);
                                }
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                }
            }
            file = new File(generate[0]);
            this.certificate = file;
            this.privateKey = new File(generate[1]);
            this.key = generateKeyPair.getPrivate();
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                this.cert = (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(fileInputStream2);
                fileInputStream2.close();
            } catch (Exception e5) {
                e = e5;
            } catch (Throwable th4) {
                generateKeyPair = 0;
                th = th4;
                if (generateKeyPair != 0) {
                }
                throw th;
            }
        } catch (NoSuchAlgorithmException e6) {
            throw new Error(e6);
        }
    }

    public File certificate() {
        return this.certificate;
    }

    public File privateKey() {
        return this.privateKey;
    }

    public X509Certificate cert() {
        return this.cert;
    }

    public PrivateKey key() {
        return this.key;
    }

    public void delete() {
        safeDelete(this.certificate);
        safeDelete(this.privateKey);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String[] newSelfSignedCertificate(String str, PrivateKey privateKey, X509Certificate x509Certificate) throws IOException, CertificateEncodingException {
        ByteBuf encode;
        ByteBuf encode2;
        ByteBuf wrappedBuffer = Unpooled.wrappedBuffer(privateKey.getEncoded());
        try {
            String str2 = "-----BEGIN PRIVATE KEY-----\n" + encode.toString(CharsetUtil.US_ASCII) + "\n-----END PRIVATE KEY-----\n";
            Base64.encode(wrappedBuffer, true).release();
            wrappedBuffer.release();
            File createTempFile = File.createTempFile("keyutil_" + str + '_', ".key");
            createTempFile.deleteOnExit();
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            try {
                fileOutputStream.write(str2.getBytes(CharsetUtil.US_ASCII));
                fileOutputStream.close();
                wrappedBuffer = Unpooled.wrappedBuffer(x509Certificate.getEncoded());
                try {
                    String str3 = "-----BEGIN CERTIFICATE-----\n" + encode2.toString(CharsetUtil.US_ASCII) + "\n-----END CERTIFICATE-----\n";
                    Base64.encode(wrappedBuffer, true).release();
                    wrappedBuffer.release();
                    File createTempFile2 = File.createTempFile("keyutil_" + str + '_', ".crt");
                    createTempFile2.deleteOnExit();
                    FileOutputStream fileOutputStream2 = new FileOutputStream(createTempFile2);
                    try {
                        fileOutputStream2.write(str3.getBytes(CharsetUtil.US_ASCII));
                        fileOutputStream2.close();
                        return new String[]{createTempFile2.getPath(), createTempFile.getPath()};
                    } catch (Throwable th) {
                        safeClose(createTempFile2, fileOutputStream2);
                        safeDelete(createTempFile2);
                        safeDelete(createTempFile);
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th2) {
                safeClose(createTempFile, fileOutputStream);
                safeDelete(createTempFile);
                throw th2;
            }
        } finally {
        }
    }

    private static void safeDelete(File file) {
        if (file.delete()) {
            return;
        }
        InternalLogger internalLogger = logger;
        if (internalLogger.isWarnEnabled()) {
            internalLogger.warn("Failed to delete a file: " + file);
        }
    }

    private static void safeClose(File file, OutputStream outputStream) {
        try {
            outputStream.close();
        } catch (IOException e) {
            if (logger.isWarnEnabled()) {
                InternalLogger internalLogger = logger;
                internalLogger.warn("Failed to close a file: " + file, (Throwable) e);
            }
        }
    }
}
