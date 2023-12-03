package com.appsflyer;

import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import com.appsflyer.internal.AFb1wSDK;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;
/* loaded from: classes.dex */
public class AFKeystoreWrapper {
    private Context AFInAppEventType;
    public KeyStore valueOf;
    public final Object AFKeystoreWrapper = new Object();
    public String values = "";
    public int AFInAppEventParameterName = 0;

    public AFKeystoreWrapper(Context context) {
        this.AFInAppEventType = context;
        AFLogger.afInfoLog("Initialising KeyStore..");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.valueOf = keyStore;
            keyStore.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e10) {
            AFLogger.afErrorLog("Couldn't load keystore instance of type: AndroidKeyStore", e10);
        }
    }

    private static boolean AFKeystoreWrapper(String str) {
        return str.startsWith("com.appsflyer");
    }

    public final void AFInAppEventParameterName(String str) {
        AlgorithmParameterSpec build;
        AFLogger.afInfoLog("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 5);
            synchronized (this.AFKeystoreWrapper) {
                if (!this.valueOf.containsAlias(str)) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        build = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
                    } else {
                        build = !AFb1wSDK.AFKeystoreWrapper() ? new KeyPairGeneratorSpec.Builder(this.AFInAppEventType).setAlias(str).setSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setSerialNumber(BigInteger.ONE).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build() : null;
                    }
                    KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                    keyPairGenerator.initialize(build);
                    keyPairGenerator.generateKeyPair();
                } else {
                    AFLogger.afInfoLog("Alias already exists: ".concat(String.valueOf(str)));
                }
            }
        } catch (Throwable th2) {
            StringBuilder sb2 = new StringBuilder("Exception ");
            sb2.append(th2.getMessage());
            sb2.append(" occurred");
            AFLogger.afErrorLog(sb2.toString(), th2);
        }
    }

    public final String AFInAppEventType() {
        String str;
        synchronized (this.AFKeystoreWrapper) {
            str = this.values;
        }
        return str;
    }

    public final boolean valueOf() {
        boolean z10;
        synchronized (this.AFKeystoreWrapper) {
            KeyStore keyStore = this.valueOf;
            z10 = false;
            if (keyStore != null) {
                Enumeration<String> aliases = keyStore.aliases();
                while (true) {
                    if (!aliases.hasMoreElements()) {
                        break;
                    }
                    String nextElement = aliases.nextElement();
                    if (nextElement != null && AFKeystoreWrapper(nextElement)) {
                        String[] split = nextElement.split(",");
                        if (split.length == 3) {
                            AFLogger.afInfoLog("Found a matching AF key with alias:\n".concat(nextElement));
                            z10 = true;
                            String[] split2 = split[1].trim().split("=");
                            String[] split3 = split[2].trim().split("=");
                            if (split2.length == 2 && split3.length == 2) {
                                this.values = split2[1].trim();
                                this.AFInAppEventParameterName = Integer.parseInt(split3[1].trim());
                            }
                        }
                    }
                }
            }
        }
        return z10;
    }

    public final int values() {
        int i6;
        synchronized (this.AFKeystoreWrapper) {
            i6 = this.AFInAppEventParameterName;
        }
        return i6;
    }

    public final String AFInAppEventParameterName() {
        StringBuilder sb2 = new StringBuilder("com.appsflyer,KSAppsFlyerId=");
        synchronized (this.AFKeystoreWrapper) {
            sb2.append(this.values);
            sb2.append(",KSAppsFlyerRICounter=");
            sb2.append(this.AFInAppEventParameterName);
        }
        return sb2.toString();
    }
}
