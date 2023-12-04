package org.conscrypt;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertPath;
import java.security.cert.CertPathChecker;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateParsingException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXParameters;
import java.security.cert.PKIXRevocationChecker;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509ExtendedTrustManager;
import org.conscrypt.ct.CTLogStore;
import org.conscrypt.ct.CTPolicy;
import org.conscrypt.ct.CTVerifier;
import retrofit2.Platform$$ExternalSyntheticApiModelOutline0;
/* loaded from: classes5.dex */
public final class TrustManagerImpl extends X509ExtendedTrustManager {
    private static ConscryptHostnameVerifier defaultHostnameVerifier;
    private final X509Certificate[] acceptedIssuers;
    private final CertBlocklist blocklist;
    private boolean ctEnabledOverride;
    private CTPolicy ctPolicy;
    private CTVerifier ctVerifier;
    private final Exception err;
    private final CertificateFactory factory;
    private ConscryptHostnameVerifier hostnameVerifier;
    private final TrustedCertificateIndex intermediateIndex;
    private CertPinManager pinManager;
    private final KeyStore rootKeyStore;
    private final TrustedCertificateIndex trustedCertificateIndex;
    private final ConscryptCertStore trustedCertificateStore;
    private final CertPathValidator validator;
    private static final Logger logger = Logger.getLogger(TrustManagerImpl.class.getName());
    private static final TrustAnchorComparator TRUST_ANCHOR_COMPARATOR = new TrustAnchorComparator();

    public TrustManagerImpl(KeyStore keyStore) {
        this(keyStore, null);
    }

    public TrustManagerImpl(KeyStore keyStore, CertPinManager certPinManager) {
        this(keyStore, certPinManager, null);
    }

    public TrustManagerImpl(KeyStore keyStore, CertPinManager certPinManager, ConscryptCertStore conscryptCertStore) {
        this(keyStore, certPinManager, conscryptCertStore, null);
    }

    public TrustManagerImpl(KeyStore keyStore, CertPinManager certPinManager, ConscryptCertStore conscryptCertStore, CertBlocklist certBlocklist) {
        this(keyStore, certPinManager, conscryptCertStore, certBlocklist, null, null, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(6:2|3|4|5|7|8)|(2:10|(10:(2:13|14)|29|30|31|32|(1:21)|(1:23)|(1:25)|26|27))|37|38|40|41|42|32|(0)|(0)|(0)|26|27|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
        r3 = r2;
        r2 = r1;
        r1 = r0;
        r0 = r8;
        r8 = r6;
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
        r6 = null;
        r3 = r2;
        r2 = r1;
        r1 = r0;
        r0 = r8;
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TrustManagerImpl(KeyStore keyStore, CertPinManager certPinManager, ConscryptCertStore conscryptCertStore, CertBlocklist certBlocklist, CTLogStore cTLogStore, CTVerifier cTVerifier, CTPolicy cTPolicy) {
        X509Certificate[] x509CertificateArr;
        X509Certificate[] x509CertificateArr2;
        CertPathValidator certPathValidator;
        Exception exc;
        CertificateFactory certificateFactory;
        ConscryptCertStore conscryptCertStore2;
        CertificateFactory certificateFactory2;
        CertPathValidator certPathValidator2;
        TrustedCertificateIndex trustedCertificateIndex;
        TrustedCertificateIndex trustedCertificateIndex2 = null;
        try {
            certPathValidator2 = CertPathValidator.getInstance("PKIX");
            try {
                certificateFactory2 = CertificateFactory.getInstance("X509");
                try {
                } catch (Exception e) {
                    e = e;
                    keyStore = null;
                    x509CertificateArr = null;
                }
            } catch (Exception e2) {
                keyStore = null;
                x509CertificateArr = null;
                certPathValidator = certPathValidator2;
                exc = e2;
                x509CertificateArr2 = null;
                certificateFactory = null;
            }
        } catch (Exception e3) {
            keyStore = null;
            x509CertificateArr = null;
            x509CertificateArr2 = null;
            certPathValidator = null;
            exc = e3;
            certificateFactory = null;
        }
        if ("AndroidCAStore".equals(keyStore.getType())) {
            if (Platform.supportsConscryptCertStore()) {
                if (conscryptCertStore == null) {
                    try {
                        conscryptCertStore = Platform.newDefaultCertStore();
                    } catch (Exception e4) {
                        e = e4;
                        x509CertificateArr = null;
                        exc = e;
                        certificateFactory = certificateFactory2;
                        certPathValidator = certPathValidator2;
                        x509CertificateArr2 = x509CertificateArr;
                        CertificateFactory certificateFactory3 = certificateFactory;
                        conscryptCertStore2 = x509CertificateArr2;
                        certPathValidator2 = certPathValidator;
                        certificateFactory2 = certificateFactory3;
                        if (certBlocklist == null) {
                        }
                        if (cTLogStore == null) {
                        }
                        if (cTPolicy == null) {
                        }
                        this.pinManager = certPinManager;
                        this.rootKeyStore = keyStore;
                        this.trustedCertificateStore = conscryptCertStore2;
                        this.validator = certPathValidator2;
                        this.factory = certificateFactory2;
                        this.trustedCertificateIndex = trustedCertificateIndex2;
                        this.intermediateIndex = new TrustedCertificateIndex();
                        this.acceptedIssuers = x509CertificateArr;
                        this.err = exc;
                        this.blocklist = certBlocklist;
                        this.ctVerifier = new CTVerifier(cTLogStore);
                        this.ctPolicy = cTPolicy;
                    }
                }
                try {
                    trustedCertificateIndex = new TrustedCertificateIndex();
                    conscryptCertStore2 = conscryptCertStore;
                    x509CertificateArr = null;
                    TrustedCertificateIndex trustedCertificateIndex3 = trustedCertificateIndex;
                    exc = null;
                    trustedCertificateIndex2 = trustedCertificateIndex3;
                } catch (Exception e5) {
                    exc = e5;
                    certificateFactory = certificateFactory2;
                    certPathValidator = certPathValidator2;
                    x509CertificateArr2 = conscryptCertStore;
                    x509CertificateArr = null;
                    CertificateFactory certificateFactory32 = certificateFactory;
                    conscryptCertStore2 = x509CertificateArr2;
                    certPathValidator2 = certPathValidator;
                    certificateFactory2 = certificateFactory32;
                    if (certBlocklist == null) {
                    }
                    if (cTLogStore == null) {
                    }
                    if (cTPolicy == null) {
                    }
                    this.pinManager = certPinManager;
                    this.rootKeyStore = keyStore;
                    this.trustedCertificateStore = conscryptCertStore2;
                    this.validator = certPathValidator2;
                    this.factory = certificateFactory2;
                    this.trustedCertificateIndex = trustedCertificateIndex2;
                    this.intermediateIndex = new TrustedCertificateIndex();
                    this.acceptedIssuers = x509CertificateArr;
                    this.err = exc;
                    this.blocklist = certBlocklist;
                    this.ctVerifier = new CTVerifier(cTLogStore);
                    this.ctPolicy = cTPolicy;
                }
                certBlocklist = certBlocklist == null ? Platform.newDefaultBlocklist() : certBlocklist;
                cTLogStore = cTLogStore == null ? Platform.newDefaultLogStore() : cTLogStore;
                cTPolicy = cTPolicy == null ? Platform.newDefaultPolicy(cTLogStore) : cTPolicy;
                this.pinManager = certPinManager;
                this.rootKeyStore = keyStore;
                this.trustedCertificateStore = conscryptCertStore2;
                this.validator = certPathValidator2;
                this.factory = certificateFactory2;
                this.trustedCertificateIndex = trustedCertificateIndex2;
                this.intermediateIndex = new TrustedCertificateIndex();
                this.acceptedIssuers = x509CertificateArr;
                this.err = exc;
                this.blocklist = certBlocklist;
                this.ctVerifier = new CTVerifier(cTLogStore);
                this.ctPolicy = cTPolicy;
            }
        }
        X509Certificate[] acceptedIssuers = acceptedIssuers(keyStore);
        trustedCertificateIndex = new TrustedCertificateIndex(trustAnchors(acceptedIssuers));
        conscryptCertStore2 = conscryptCertStore;
        x509CertificateArr = acceptedIssuers;
        keyStore = null;
        TrustedCertificateIndex trustedCertificateIndex32 = trustedCertificateIndex;
        exc = null;
        trustedCertificateIndex2 = trustedCertificateIndex32;
        if (certBlocklist == null) {
        }
        if (cTLogStore == null) {
        }
        if (cTPolicy == null) {
        }
        this.pinManager = certPinManager;
        this.rootKeyStore = keyStore;
        this.trustedCertificateStore = conscryptCertStore2;
        this.validator = certPathValidator2;
        this.factory = certificateFactory2;
        this.trustedCertificateIndex = trustedCertificateIndex2;
        this.intermediateIndex = new TrustedCertificateIndex();
        this.acceptedIssuers = x509CertificateArr;
        this.err = exc;
        this.blocklist = certBlocklist;
        this.ctVerifier = new CTVerifier(cTLogStore);
        this.ctPolicy = cTPolicy;
    }

    private static X509Certificate[] acceptedIssuers(KeyStore keyStore) {
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration<String> aliases = keyStore.aliases();
            while (aliases.hasMoreElements()) {
                X509Certificate x509Certificate = (X509Certificate) keyStore.getCertificate(aliases.nextElement());
                if (x509Certificate != null) {
                    arrayList.add(x509Certificate);
                }
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
        } catch (KeyStoreException unused) {
            return new X509Certificate[0];
        }
    }

    private static Set<TrustAnchor> trustAnchors(X509Certificate[] x509CertificateArr) {
        HashSet hashSet = new HashSet(x509CertificateArr.length);
        for (X509Certificate x509Certificate : x509CertificateArr) {
            hashSet.add(new TrustAnchor(x509Certificate, null));
        }
        return hashSet;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        checkTrusted(x509CertificateArr, str, null, null, true);
    }

    public List<X509Certificate> checkClientTrusted(X509Certificate[] x509CertificateArr, String str, String str2) throws CertificateException {
        return checkTrusted(x509CertificateArr, null, null, str, str2, true);
    }

    private static SSLSession getHandshakeSessionOrThrow(SSLSocket sSLSocket) throws CertificateException {
        SSLSession handshakeSession;
        handshakeSession = sSLSocket.getHandshakeSession();
        if (handshakeSession != null) {
            return handshakeSession;
        }
        throw new CertificateException("Not in handshake; no session available");
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        SSLSession sSLSession;
        SSLParameters sSLParameters;
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            SSLSession handshakeSessionOrThrow = getHandshakeSessionOrThrow(sSLSocket);
            sSLParameters = sSLSocket.getSSLParameters();
            sSLSession = handshakeSessionOrThrow;
        } else {
            sSLSession = null;
            sSLParameters = null;
        }
        checkTrusted(x509CertificateArr, str, sSLSession, sSLParameters, true);
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        SSLSession handshakeSession;
        handshakeSession = sSLEngine.getHandshakeSession();
        if (handshakeSession == null) {
            throw new CertificateException("Not in handshake; no session available");
        }
        checkTrusted(x509CertificateArr, str, handshakeSession, sSLEngine.getSSLParameters(), true);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        checkTrusted(x509CertificateArr, str, null, null, false);
    }

    public List<X509Certificate> checkServerTrusted(X509Certificate[] x509CertificateArr, String str, String str2) throws CertificateException {
        return checkTrusted(x509CertificateArr, null, null, str, str2, false);
    }

    public List<X509Certificate> getTrustedChainForServer(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        SSLSession sSLSession;
        SSLParameters sSLParameters;
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            SSLSession handshakeSessionOrThrow = getHandshakeSessionOrThrow(sSLSocket);
            sSLParameters = sSLSocket.getSSLParameters();
            sSLSession = handshakeSessionOrThrow;
        } else {
            sSLSession = null;
            sSLParameters = null;
        }
        return checkTrusted(x509CertificateArr, str, sSLSession, sSLParameters, false);
    }

    public List<X509Certificate> getTrustedChainForServer(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        SSLSession handshakeSession;
        handshakeSession = sSLEngine.getHandshakeSession();
        if (handshakeSession == null) {
            throw new CertificateException("Not in handshake; no session available");
        }
        return checkTrusted(x509CertificateArr, str, handshakeSession, sSLEngine.getSSLParameters(), false);
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        getTrustedChainForServer(x509CertificateArr, str, socket);
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        getTrustedChainForServer(x509CertificateArr, str, sSLEngine);
    }

    public List<X509Certificate> checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLSession sSLSession) throws CertificateException {
        return checkTrusted(x509CertificateArr, str, sSLSession, null, false);
    }

    public void handleTrustStorageUpdate() {
        X509Certificate[] x509CertificateArr = this.acceptedIssuers;
        if (x509CertificateArr == null) {
            this.trustedCertificateIndex.reset();
        } else {
            this.trustedCertificateIndex.reset(trustAnchors(x509CertificateArr));
        }
    }

    private List<X509Certificate> checkTrusted(X509Certificate[] x509CertificateArr, String str, SSLSession sSLSession, SSLParameters sSLParameters, boolean z) throws CertificateException {
        byte[] bArr;
        byte[] bArr2;
        String str2;
        String endpointIdentificationAlgorithm;
        if (sSLSession != null) {
            str2 = sSLSession.getPeerHost();
            bArr = getOcspDataFromSession(sSLSession);
            bArr2 = getTlsSctDataFromSession(sSLSession);
        } else {
            bArr = null;
            bArr2 = null;
            str2 = null;
        }
        if (sSLSession != null && sSLParameters != null) {
            endpointIdentificationAlgorithm = sSLParameters.getEndpointIdentificationAlgorithm();
            if ("HTTPS".equalsIgnoreCase(endpointIdentificationAlgorithm) && !getHttpsVerifier().verify(x509CertificateArr, str2, sSLSession)) {
                throw new CertificateException("No subjectAltNames on the certificate match");
            }
        }
        return checkTrusted(x509CertificateArr, bArr, bArr2, str, str2, z);
    }

    private static byte[] getOcspDataFromSession(SSLSession sSLSession) {
        List<byte[]> list;
        if (sSLSession instanceof ConscryptSession) {
            list = ((ConscryptSession) sSLSession).getStatusResponses();
        } else {
            try {
                Method declaredMethod = sSLSession.getClass().getDeclaredMethod("getStatusResponses", new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(sSLSession, new Object[0]);
                if (invoke instanceof List) {
                    list = (List) invoke;
                }
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private byte[] getTlsSctDataFromSession(SSLSession sSLSession) {
        if (sSLSession instanceof ConscryptSession) {
            return ((ConscryptSession) sSLSession).getPeerSignedCertificateTimestamp();
        }
        try {
            Method declaredMethod = sSLSession.getClass().getDeclaredMethod("getPeerSignedCertificateTimestamp", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(sSLSession, new Object[0]);
            if (invoke instanceof byte[]) {
                return (byte[]) invoke;
            }
            return null;
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException unused) {
            return null;
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e.getCause());
        }
    }

    private List<X509Certificate> checkTrusted(X509Certificate[] x509CertificateArr, byte[] bArr, byte[] bArr2, String str, String str2, boolean z) throws CertificateException {
        if (x509CertificateArr == null || x509CertificateArr.length == 0 || str == null || str.length() == 0) {
            throw new IllegalArgumentException("null or zero-length parameter");
        }
        if (this.err != null) {
            throw new CertificateException(this.err);
        }
        HashSet hashSet = new HashSet();
        ArrayList<X509Certificate> arrayList = new ArrayList<>();
        ArrayList<TrustAnchor> arrayList2 = new ArrayList<>();
        X509Certificate x509Certificate = x509CertificateArr[0];
        TrustAnchor findTrustAnchorBySubjectAndPublicKey = findTrustAnchorBySubjectAndPublicKey(x509Certificate);
        if (findTrustAnchorBySubjectAndPublicKey != null) {
            arrayList2.add(findTrustAnchorBySubjectAndPublicKey);
            hashSet.add(findTrustAnchorBySubjectAndPublicKey.getTrustedCert());
        } else {
            arrayList.add(x509Certificate);
        }
        hashSet.add(x509Certificate);
        return checkTrustedRecursive(x509CertificateArr, bArr, bArr2, str2, z, arrayList, arrayList2, hashSet);
    }

    private List<X509Certificate> checkTrustedRecursive(X509Certificate[] x509CertificateArr, byte[] bArr, byte[] bArr2, String str, boolean z, ArrayList<X509Certificate> arrayList, ArrayList<TrustAnchor> arrayList2, Set<X509Certificate> set) throws CertificateException {
        X509Certificate trustedCert;
        if (arrayList2.isEmpty()) {
            trustedCert = arrayList.get(arrayList.size() - 1);
        } else {
            trustedCert = arrayList2.get(arrayList2.size() - 1).getTrustedCert();
        }
        X509Certificate x509Certificate = trustedCert;
        checkBlocklist(x509Certificate);
        if (x509Certificate.getIssuerDN().equals(x509Certificate.getSubjectDN())) {
            return verifyChain(arrayList, arrayList2, str, z, bArr, bArr2);
        }
        boolean z2 = false;
        CertificateException certificateException = null;
        for (TrustAnchor trustAnchor : sortPotentialAnchors(findAllTrustAnchorsByIssuerAndSignature(x509Certificate))) {
            X509Certificate trustedCert2 = trustAnchor.getTrustedCert();
            if (!set.contains(trustedCert2)) {
                set.add(trustedCert2);
                arrayList2.add(trustAnchor);
                try {
                    return checkTrustedRecursive(x509CertificateArr, bArr, bArr2, str, z, arrayList, arrayList2, set);
                } catch (CertificateException e) {
                    arrayList2.remove(arrayList2.size() - 1);
                    set.remove(trustedCert2);
                    certificateException = e;
                    z2 = true;
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            if (!z2) {
                return verifyChain(arrayList, arrayList2, str, z, bArr, bArr2);
            }
            throw certificateException;
        }
        for (int i = 1; i < x509CertificateArr.length; i++) {
            X509Certificate x509Certificate2 = x509CertificateArr[i];
            if (!set.contains(x509Certificate2) && x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
                try {
                    x509Certificate2.checkValidity();
                    ChainStrengthAnalyzer.checkCert(x509Certificate2);
                    set.add(x509Certificate2);
                    arrayList.add(x509Certificate2);
                    try {
                        return checkTrustedRecursive(x509CertificateArr, bArr, bArr2, str, z, arrayList, arrayList2, set);
                    } catch (CertificateException e2) {
                        set.remove(x509Certificate2);
                        arrayList.remove(arrayList.size() - 1);
                        certificateException = e2;
                    }
                } catch (CertificateException e3) {
                    certificateException = new CertificateException("Unacceptable certificate: " + x509Certificate2.getSubjectX500Principal(), e3);
                }
            }
        }
        for (TrustAnchor trustAnchor2 : sortPotentialAnchors(this.intermediateIndex.findAllByIssuerAndSignature(x509Certificate))) {
            X509Certificate trustedCert3 = trustAnchor2.getTrustedCert();
            if (!set.contains(trustedCert3)) {
                set.add(trustedCert3);
                arrayList.add(trustedCert3);
                try {
                    return checkTrustedRecursive(x509CertificateArr, bArr, bArr2, str, z, arrayList, arrayList2, set);
                } catch (CertificateException e4) {
                    arrayList.remove(arrayList.size() - 1);
                    set.remove(trustedCert3);
                    certificateException = e4;
                }
            }
        }
        if (certificateException != null) {
            throw certificateException;
        }
        throw new CertificateException(new CertPathValidatorException("Trust anchor for certification path not found.", null, this.factory.generateCertPath(arrayList), -1));
    }

    private List<X509Certificate> verifyChain(List<X509Certificate> list, List<TrustAnchor> list2, String str, boolean z, byte[] bArr, byte[] bArr2) throws CertificateException {
        try {
            CertPath generateCertPath = this.factory.generateCertPath(list);
            if (list2.isEmpty()) {
                throw new CertificateException(new CertPathValidatorException("Trust anchor for certification path not found.", null, generateCertPath, -1));
            }
            ArrayList<X509Certificate> arrayList = new ArrayList();
            arrayList.addAll(list);
            for (TrustAnchor trustAnchor : list2) {
                arrayList.add(trustAnchor.getTrustedCert());
            }
            CertPinManager certPinManager = this.pinManager;
            if (certPinManager != null) {
                certPinManager.checkChainPinning(str, arrayList);
            }
            for (X509Certificate x509Certificate : arrayList) {
                checkBlocklist(x509Certificate);
            }
            if (!z && (this.ctEnabledOverride || (str != null && Platform.isCTVerificationRequired(str)))) {
                checkCT(str, arrayList, bArr, bArr2);
            }
            if (list.isEmpty()) {
                return arrayList;
            }
            ChainStrengthAnalyzer.check(list);
            try {
                HashSet hashSet = new HashSet();
                hashSet.add(list2.get(0));
                PKIXParameters pKIXParameters = new PKIXParameters(hashSet);
                pKIXParameters.setRevocationEnabled(false);
                X509Certificate x509Certificate2 = list.get(0);
                setOcspResponses(pKIXParameters, x509Certificate2, bArr);
                pKIXParameters.addCertPathChecker(new ExtendedKeyUsagePKIXCertPathChecker(z, x509Certificate2));
                this.validator.validate(generateCertPath, pKIXParameters);
                for (int i = 1; i < list.size(); i++) {
                    this.intermediateIndex.index(list.get(i));
                }
                return arrayList;
            } catch (InvalidAlgorithmParameterException e) {
                throw new CertificateException("Chain validation failed", e);
            } catch (CertPathValidatorException e2) {
                throw new CertificateException("Chain validation failed", e2);
            }
        } catch (CertificateException e3) {
            Logger logger2 = logger;
            logger2.fine("Rejected candidate cert chain due to error: " + e3.getMessage());
            throw e3;
        }
    }

    private void checkBlocklist(X509Certificate x509Certificate) throws CertificateException {
        CertBlocklist certBlocklist = this.blocklist;
        if (certBlocklist == null || !certBlocklist.isPublicKeyBlockListed(x509Certificate.getPublicKey())) {
            return;
        }
        throw new CertificateException("Certificate blocklisted by public key: " + x509Certificate);
    }

    private void checkCT(String str, List<X509Certificate> list, byte[] bArr, byte[] bArr2) throws CertificateException {
        if (!this.ctPolicy.doesResultConformToPolicy(this.ctVerifier.verifySignedCertificateTimestamps(list, bArr2, bArr), str, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]))) {
            throw new CertificateException("Certificate chain does not conform to required transparency policy.");
        }
    }

    private void setOcspResponses(PKIXParameters pKIXParameters, X509Certificate x509Certificate, byte[] bArr) {
        PKIXRevocationChecker pKIXRevocationChecker;
        CertPathChecker revocationChecker;
        PKIXRevocationChecker.Option option;
        if (bArr == null) {
            return;
        }
        List<PKIXCertPathChecker> arrayList = new ArrayList<>(pKIXParameters.getCertPathCheckers());
        Iterator<PKIXCertPathChecker> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                pKIXRevocationChecker = null;
                break;
            }
            PKIXCertPathChecker next = it.next();
            if (Platform$$ExternalSyntheticApiModelOutline0.m$1(next)) {
                pKIXRevocationChecker = Platform$$ExternalSyntheticApiModelOutline0.m9070m((Object) next);
                break;
            }
        }
        if (pKIXRevocationChecker == null) {
            try {
                revocationChecker = this.validator.getRevocationChecker();
                pKIXRevocationChecker = Platform$$ExternalSyntheticApiModelOutline0.m9070m((Object) revocationChecker);
                arrayList.add(pKIXRevocationChecker);
                option = PKIXRevocationChecker.Option.ONLY_END_ENTITY;
                pKIXRevocationChecker.setOptions(Collections.singleton(option));
            } catch (UnsupportedOperationException unused) {
                return;
            }
        }
        pKIXRevocationChecker.setOcspResponses(Collections.singletonMap(x509Certificate, bArr));
        pKIXParameters.setCertPathCheckers(arrayList);
    }

    private static Collection<TrustAnchor> sortPotentialAnchors(Set<TrustAnchor> set) {
        if (set.size() <= 1) {
            return set;
        }
        ArrayList arrayList = new ArrayList(set);
        Collections.sort(arrayList, TRUST_ANCHOR_COMPARATOR);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class TrustAnchorComparator implements Comparator<TrustAnchor> {
        private static final CertificatePriorityComparator CERT_COMPARATOR = new CertificatePriorityComparator();

        private TrustAnchorComparator() {
        }

        @Override // java.util.Comparator
        public int compare(TrustAnchor trustAnchor, TrustAnchor trustAnchor2) {
            return CERT_COMPARATOR.compare(trustAnchor.getTrustedCert(), trustAnchor2.getTrustedCert());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class ExtendedKeyUsagePKIXCertPathChecker extends PKIXCertPathChecker {
        private static final String EKU_anyExtendedKeyUsage = "2.5.29.37.0";
        private static final String EKU_clientAuth = "1.3.6.1.5.5.7.3.2";
        private static final String EKU_msSGC = "1.3.6.1.4.1.311.10.3.3";
        private static final String EKU_nsSGC = "2.16.840.1.113730.4.1";
        private static final String EKU_serverAuth = "1.3.6.1.5.5.7.3.1";
        private final boolean clientAuth;
        private final X509Certificate leaf;
        private static final String EKU_OID = "2.5.29.37";
        private static final Set<String> SUPPORTED_EXTENSIONS = Collections.unmodifiableSet(new HashSet(Arrays.asList(EKU_OID)));

        @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
        public void init(boolean z) throws CertPathValidatorException {
        }

        @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
        public boolean isForwardCheckingSupported() {
            return true;
        }

        private ExtendedKeyUsagePKIXCertPathChecker(boolean z, X509Certificate x509Certificate) {
            this.clientAuth = z;
            this.leaf = x509Certificate;
        }

        @Override // java.security.cert.PKIXCertPathChecker
        public Set<String> getSupportedExtensions() {
            return SUPPORTED_EXTENSIONS;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:
            r5.remove(org.conscrypt.TrustManagerImpl.ExtendedKeyUsagePKIXCertPathChecker.EKU_OID);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
            return;
         */
        @Override // java.security.cert.PKIXCertPathChecker
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void check(Certificate certificate, Collection<String> collection) throws CertPathValidatorException {
            boolean z;
            X509Certificate x509Certificate = this.leaf;
            if (certificate != x509Certificate) {
                return;
            }
            try {
                List<String> extendedKeyUsage = x509Certificate.getExtendedKeyUsage();
                if (extendedKeyUsage == null) {
                    return;
                }
                Iterator<String> it = extendedKeyUsage.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    String next = it.next();
                    z = true;
                    if (!next.equals(EKU_anyExtendedKeyUsage)) {
                        if (this.clientAuth) {
                            if (next.equals(EKU_clientAuth)) {
                                break;
                            }
                        } else if (next.equals(EKU_serverAuth) || next.equals(EKU_nsSGC) || next.equals(EKU_msSGC)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                throw new CertPathValidatorException("End-entity certificate does not have a valid extendedKeyUsage.");
            } catch (CertificateParsingException e) {
                throw new CertPathValidatorException(e);
            }
        }
    }

    private Set<TrustAnchor> findAllTrustAnchorsByIssuerAndSignature(X509Certificate x509Certificate) {
        ConscryptCertStore conscryptCertStore;
        Set<TrustAnchor> findAllByIssuerAndSignature = this.trustedCertificateIndex.findAllByIssuerAndSignature(x509Certificate);
        if (findAllByIssuerAndSignature.isEmpty() && (conscryptCertStore = this.trustedCertificateStore) != null) {
            Set<X509Certificate> findAllIssuers = conscryptCertStore.findAllIssuers(x509Certificate);
            if (findAllIssuers.isEmpty()) {
                return findAllByIssuerAndSignature;
            }
            findAllByIssuerAndSignature = new HashSet<>(findAllIssuers.size());
            for (X509Certificate x509Certificate2 : findAllIssuers) {
                findAllByIssuerAndSignature.add(this.trustedCertificateIndex.index(x509Certificate2));
            }
        }
        return findAllByIssuerAndSignature;
    }

    private TrustAnchor findTrustAnchorBySubjectAndPublicKey(X509Certificate x509Certificate) {
        X509Certificate trustAnchor;
        TrustAnchor findBySubjectAndPublicKey = this.trustedCertificateIndex.findBySubjectAndPublicKey(x509Certificate);
        if (findBySubjectAndPublicKey != null) {
            return findBySubjectAndPublicKey;
        }
        ConscryptCertStore conscryptCertStore = this.trustedCertificateStore;
        if (conscryptCertStore == null || (trustAnchor = conscryptCertStore.getTrustAnchor(x509Certificate)) == null) {
            return null;
        }
        return new TrustAnchor(trustAnchor, null);
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        X509Certificate[] x509CertificateArr = this.acceptedIssuers;
        return x509CertificateArr != null ? (X509Certificate[]) x509CertificateArr.clone() : acceptedIssuers(this.rootKeyStore);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void setDefaultHostnameVerifier(ConscryptHostnameVerifier conscryptHostnameVerifier) {
        synchronized (TrustManagerImpl.class) {
            defaultHostnameVerifier = conscryptHostnameVerifier;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized ConscryptHostnameVerifier getDefaultHostnameVerifier() {
        ConscryptHostnameVerifier conscryptHostnameVerifier;
        synchronized (TrustManagerImpl.class) {
            conscryptHostnameVerifier = defaultHostnameVerifier;
        }
        return conscryptHostnameVerifier;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setHostnameVerifier(ConscryptHostnameVerifier conscryptHostnameVerifier) {
        this.hostnameVerifier = conscryptHostnameVerifier;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConscryptHostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    private ConscryptHostnameVerifier getHttpsVerifier() {
        ConscryptHostnameVerifier conscryptHostnameVerifier = this.hostnameVerifier;
        return conscryptHostnameVerifier != null ? conscryptHostnameVerifier : Platform.getDefaultHostnameVerifier();
    }

    public void setCTEnabledOverride(boolean z) {
        this.ctEnabledOverride = z;
    }

    public void setCTVerifier(CTVerifier cTVerifier) {
        this.ctVerifier = cTVerifier;
    }

    public void setCTPolicy(CTPolicy cTPolicy) {
        this.ctPolicy = cTPolicy;
    }
}
