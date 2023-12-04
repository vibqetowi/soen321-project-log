package com.google.android.gms.internal.auth;

import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.NativeProtocol;
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
public enum zzby {
    CLIENT_LOGIN_DISABLED("ClientLoginDisabled"),
    SOCKET_TIMEOUT("SocketTimeout"),
    SUCCESS("Ok"),
    UNKNOWN_ERROR("UNKNOWN_ERR"),
    NETWORK_ERROR(NativeProtocol.ERROR_NETWORK_ERROR),
    SERVICE_UNAVAILABLE("ServiceUnavailable"),
    INTNERNAL_ERROR("InternalError"),
    ILLEGAL_ARGUMENT("IllegalArgument"),
    BAD_AUTHENTICATION("BadAuthentication"),
    BAD_TOKEN_REQUEST("BAD_REQUEST"),
    EMPTY_CONSUMER_PKG_OR_SIG("EmptyConsumerPackageOrSig"),
    NEEDS_2F("InvalidSecondFactor"),
    NEEDS_POST_SIGN_IN_FLOW("PostSignInFlowRequired"),
    NEEDS_BROWSER("NeedsBrowser"),
    UNKNOWN(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN),
    NOT_VERIFIED("NotVerified"),
    TERMS_NOT_AGREED("TermsNotAgreed"),
    ACCOUNT_DISABLED("AccountDisabled"),
    CAPTCHA("CaptchaRequired"),
    ACCOUNT_DELETED("AccountDeleted"),
    SERVICE_DISABLED(NativeProtocol.ERROR_SERVICE_DISABLED),
    CHALLENGE_REQUIRED("ChallengeRequired"),
    NEED_PERMISSION("NeedPermission"),
    NEED_REMOTE_CONSENT("NeedRemoteConsent"),
    INVALID_SCOPE("INVALID_SCOPE"),
    USER_CANCEL("UserCancel"),
    PERMISSION_DENIED(NativeProtocol.ERROR_PERMISSION_DENIED),
    RESTRICTED_CLIENT("RESTRICTED_CLIENT"),
    INVALID_AUDIENCE("INVALID_AUDIENCE"),
    UNREGISTERED_ON_API_CONSOLE("UNREGISTERED_ON_API_CONSOLE"),
    THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED("ThirdPartyDeviceManagementRequired"),
    DM_INTERNAL_ERROR("DeviceManagementInternalError"),
    DM_SYNC_DISABLED("DeviceManagementSyncDisabled"),
    DM_ADMIN_BLOCKED("DeviceManagementAdminBlocked"),
    DM_ADMIN_PENDING_APPROVAL("DeviceManagementAdminPendingApproval"),
    DM_STALE_SYNC_REQUIRED("DeviceManagementStaleSyncRequired"),
    DM_DEACTIVATED("DeviceManagementDeactivated"),
    DM_SCREENLOCK_REQUIRED("DeviceManagementScreenlockRequired"),
    DM_REQUIRED("DeviceManagementRequired"),
    DEVICE_MANAGEMENT_REQUIRED("DeviceManagementRequiredOrSyncDisabled"),
    ALREADY_HAS_GMAIL("ALREADY_HAS_GMAIL"),
    BAD_PASSWORD("WeakPassword"),
    BAD_REQUEST("BadRequest"),
    BAD_USERNAME("BadUsername"),
    DELETED_GMAIL("DeletedGmail"),
    EXISTING_USERNAME("ExistingUsername"),
    LOGIN_FAIL("LoginFail"),
    NOT_LOGGED_IN("NotLoggedIn"),
    NO_GMAIL("NoGmail"),
    REQUEST_DENIED("RequestDenied"),
    SERVER_ERROR("ServerError"),
    USERNAME_UNAVAILABLE("UsernameUnavailable"),
    GPLUS_OTHER("GPlusOther"),
    GPLUS_NICKNAME("GPlusNickname"),
    GPLUS_INVALID_CHAR("GPlusInvalidChar"),
    GPLUS_INTERSTITIAL("GPlusInterstitial"),
    GPLUS_PROFILE_ERROR("ProfileUpgradeError"),
    AUTH_SECURITY_ERROR("AuthSecurityError"),
    AUTH_BINDING_ERROR("AuthBindingError"),
    ACCOUNT_NOT_PRESENT("AccountNotPresent");
    
    private final String zzaj;

    zzby(String str) {
        this.zzaj = str;
    }

    public static final zzby zza(String str) {
        zzby[] values;
        for (zzby zzbyVar : values()) {
            if (zzbyVar.zzaj.equals(str)) {
                return zzbyVar;
            }
        }
        return UNKNOWN;
    }

    public static boolean zzb(zzby zzbyVar) {
        return BAD_AUTHENTICATION.equals(zzbyVar) || CAPTCHA.equals(zzbyVar) || NEED_PERMISSION.equals(zzbyVar) || NEED_REMOTE_CONSENT.equals(zzbyVar) || NEEDS_BROWSER.equals(zzbyVar) || USER_CANCEL.equals(zzbyVar) || DEVICE_MANAGEMENT_REQUIRED.equals(zzbyVar) || DM_INTERNAL_ERROR.equals(zzbyVar) || DM_SYNC_DISABLED.equals(zzbyVar) || DM_ADMIN_BLOCKED.equals(zzbyVar) || DM_ADMIN_PENDING_APPROVAL.equals(zzbyVar) || DM_STALE_SYNC_REQUIRED.equals(zzbyVar) || DM_DEACTIVATED.equals(zzbyVar) || DM_REQUIRED.equals(zzbyVar) || THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(zzbyVar) || DM_SCREENLOCK_REQUIRED.equals(zzbyVar);
    }
}
