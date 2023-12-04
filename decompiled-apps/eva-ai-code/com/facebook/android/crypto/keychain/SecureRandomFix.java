package com.facebook.android.crypto.keychain;

import android.os.Build;
import android.os.Process;
import androidx.exifinterface.media.ExifInterface;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.Provider;
import java.security.SecureRandomSpi;
/* loaded from: classes2.dex */
public class SecureRandomFix {
    private static final String DEV_URANDOM = "/dev/urandom";
    private static final int VERSION_CODE_JELLY_BEAN = 17;
    private static final int VERSION_CODE_JELLY_BEAN_MR2 = 18;
    private static boolean sFixApplied;

    private static void tryApplyOpenSSLFix() {
    }

    private static void tryInstallLinuxPRNGSecureRandom() throws SecurityException {
    }

    /* loaded from: classes2.dex */
    public static class FixException extends RuntimeException {
        public FixException(Throwable th) {
            super("Error fixing the Android's SecureRandom", th);
        }
    }

    public static synchronized void tryApplyFixes() throws FixException {
        synchronized (SecureRandomFix.class) {
            if (sFixApplied) {
                return;
            }
            tryApplyOpenSSLFix();
            tryInstallLinuxPRNGSecureRandom();
            sFixApplied = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] generateSeed() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeLong(System.currentTimeMillis());
            dataOutputStream.writeLong(System.nanoTime());
            dataOutputStream.writeInt(Process.myPid());
            dataOutputStream.writeInt(Process.myUid());
            dataOutputStream.write(getBuildFingerprintAndDeviceSerial());
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new SecurityException("Failed to generate seed", e);
        }
    }

    private static byte[] getBuildFingerprintAndDeviceSerial() {
        StringBuilder sb = new StringBuilder();
        String str = Build.FINGERPRINT;
        if (str != null) {
            sb.append(str);
        }
        String deviceSerialNumber = getDeviceSerialNumber();
        if (deviceSerialNumber != null) {
            sb.append(deviceSerialNumber);
        }
        try {
            return sb.toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 encoding not supported");
        }
    }

    private static String getDeviceSerialNumber() {
        try {
            return (String) Build.class.getField("SERIAL").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* loaded from: classes2.dex */
    private static class LinuxPRNGSecureRandomProvider extends Provider {
        public LinuxPRNGSecureRandomProvider() {
            super("LinuxPRNG", 1.0d, "A Linux-specific random number provider that uses /dev/urandom");
            put("SecureRandom.SHA1PRNG", LinuxPRNGSecureRandom.class.getName());
            put("SecureRandom.SHA1PRNG ImplementedIn", ExifInterface.TAG_SOFTWARE);
        }
    }

    /* loaded from: classes2.dex */
    public static class LinuxPRNGSecureRandom extends SecureRandomSpi {
        private static final File URANDOM_FILE = new File(SecureRandomFix.DEV_URANDOM);
        private static final Object sLock = new Object();
        private static DataInputStream sUrandomIn;
        private static OutputStream sUrandomOut;
        private boolean mSeedAttempted;

        @Override // java.security.SecureRandomSpi
        protected void engineSetSeed(byte[] bArr) {
            OutputStream urandomOutputStream;
            try {
                synchronized (sLock) {
                    urandomOutputStream = getUrandomOutputStream();
                }
                urandomOutputStream.write(bArr);
                urandomOutputStream.flush();
            } catch (Throwable unused) {
            }
            this.mSeedAttempted = true;
        }

        @Override // java.security.SecureRandomSpi
        protected void engineNextBytes(byte[] bArr) {
            DataInputStream urandomInputStream;
            if (!this.mSeedAttempted) {
                engineSetSeed(SecureRandomFix.generateSeed());
            }
            try {
                synchronized (sLock) {
                    urandomInputStream = getUrandomInputStream();
                }
                synchronized (urandomInputStream) {
                    urandomInputStream.readFully(bArr);
                }
            } catch (IOException e) {
                throw new SecurityException("Failed to read from " + URANDOM_FILE, e);
            }
        }

        @Override // java.security.SecureRandomSpi
        protected byte[] engineGenerateSeed(int i) {
            byte[] bArr = new byte[i];
            engineNextBytes(bArr);
            return bArr;
        }

        private DataInputStream getUrandomInputStream() {
            DataInputStream dataInputStream;
            synchronized (sLock) {
                if (sUrandomIn == null) {
                    try {
                        sUrandomIn = new DataInputStream(new FileInputStream(URANDOM_FILE));
                    } catch (IOException e) {
                        throw new SecurityException("Failed to open " + URANDOM_FILE + " for reading", e);
                    }
                }
                dataInputStream = sUrandomIn;
            }
            return dataInputStream;
        }

        private OutputStream getUrandomOutputStream() {
            OutputStream outputStream;
            synchronized (sLock) {
                if (sUrandomOut == null) {
                    try {
                        sUrandomOut = new FileOutputStream(URANDOM_FILE);
                    } catch (IOException e) {
                        throw new SecurityException("Failed to open " + URANDOM_FILE + " for writing", e);
                    }
                }
                outputStream = sUrandomOut;
            }
            return outputStream;
        }
    }
}
