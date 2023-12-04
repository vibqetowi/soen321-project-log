package com.appsflyer;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import com.ifriend.keychain.cipherStorage.CipherStorageBase;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Calendar;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;
/* loaded from: classes2.dex */
public class AFKeystoreWrapper {
    private Context AFKeystoreWrapper;
    public KeyStore valueOf;
    public final Object AFInAppEventParameterName = new Object();
    public String values = "";
    public int AFInAppEventType = 0;

    public AFKeystoreWrapper(Context context) {
        this.AFKeystoreWrapper = context;
        AFLogger.values("Initialising KeyStore..");
        try {
            KeyStore keyStore = KeyStore.getInstance(CipherStorageBase.KEYSTORE_TYPE);
            this.valueOf = keyStore;
            keyStore.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.valueOf("Couldn't load keystore instance of type: AndroidKeyStore", e);
        }
    }

    public final boolean AFKeystoreWrapper() {
        boolean z;
        synchronized (this.AFInAppEventParameterName) {
            KeyStore keyStore = this.valueOf;
            z = false;
            if (keyStore != null) {
                Enumeration<String> aliases = keyStore.aliases();
                while (true) {
                    if (!aliases.hasMoreElements()) {
                        break;
                    }
                    String nextElement = aliases.nextElement();
                    if (nextElement != null && valueOf(nextElement)) {
                        String[] split = nextElement.split(",");
                        if (split.length == 3) {
                            AFLogger.values("Found a matching AF key with alias:\n".concat(String.valueOf(nextElement)));
                            z = true;
                            String[] split2 = split[1].trim().split("=");
                            String[] split3 = split[2].trim().split("=");
                            if (split2.length == 2 && split3.length == 2) {
                                this.values = split2[1].trim();
                                this.AFInAppEventType = Integer.parseInt(split3[1].trim());
                            }
                        }
                    }
                }
            }
        }
        return z;
    }

    public final void AFKeystoreWrapper(String str) {
        AFLogger.values("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 5);
            synchronized (this.AFInAppEventParameterName) {
                if (!this.valueOf.containsAlias(str)) {
                    KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
                    KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(CipherStorageKeystoreRsaEcb.ALGORITHM_RSA, CipherStorageBase.KEYSTORE_TYPE);
                    keyPairGenerator.initialize(build);
                    keyPairGenerator.generateKeyPair();
                } else {
                    AFLogger.values("Alias already exists: ".concat(String.valueOf(str)));
                }
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Exception ");
            sb.append(th.getMessage());
            sb.append(" occurred");
            AFLogger.valueOf(sb.toString(), th);
        }
    }

    private static boolean valueOf(String str) {
        return str.startsWith("com.appsflyer");
    }

    public final String valueOf() {
        StringBuilder sb = new StringBuilder("com.appsflyer,KSAppsFlyerId=");
        synchronized (this.AFInAppEventParameterName) {
            sb.append(this.values);
            sb.append(",KSAppsFlyerRICounter=");
            sb.append(this.AFInAppEventType);
        }
        return sb.toString();
    }

    public final String values() {
        String str;
        synchronized (this.AFInAppEventParameterName) {
            str = this.values;
        }
        return str;
    }

    public final int AFInAppEventType() {
        int i;
        synchronized (this.AFInAppEventParameterName) {
            i = this.AFInAppEventType;
        }
        return i;
    }
}
