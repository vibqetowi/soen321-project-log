package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLinkResult;
/* loaded from: classes.dex */
public final class AFd1tSDK extends AFc1lSDK<DeepLinkResult> {
    private final AFb1pSDK AFLogger;
    private DeepLinkResult afRDLog;

    /* renamed from: com.appsflyer.internal.AFd1tSDK$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] AFKeystoreWrapper;

        static {
            int[] iArr = new int[DeepLinkResult.Status.values().length];
            AFKeystoreWrapper = iArr;
            try {
                iArr[DeepLinkResult.Status.FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AFKeystoreWrapper[DeepLinkResult.Status.NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AFKeystoreWrapper[DeepLinkResult.Status.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public AFd1tSDK(AFb1pSDK aFb1pSDK) {
        super(AFc1kSDK.DLSDK, new AFc1kSDK[]{AFc1kSDK.RC_CDN}, "DdlSdk");
        this.AFLogger = aFb1pSDK;
    }

    @Override // com.appsflyer.internal.AFc1lSDK
    public final AFc1jSDK AFInAppEventType() {
        DeepLinkResult AFLogger = this.AFLogger.AFLogger();
        this.afRDLog = AFLogger;
        if (AnonymousClass2.AFKeystoreWrapper[AFLogger.getStatus().ordinal()] != 1) {
            if (this.afRDLog.getError() == DeepLinkResult.Error.TIMEOUT) {
                return AFc1jSDK.TIMEOUT;
            }
            return AFc1jSDK.FAILURE;
        }
        return AFc1jSDK.SUCCESS;
    }

    @Override // com.appsflyer.internal.AFc1lSDK
    public final boolean AFKeystoreWrapper() {
        return false;
    }

    @Override // com.appsflyer.internal.AFc1lSDK
    public final long values() {
        return 90000L;
    }
}
