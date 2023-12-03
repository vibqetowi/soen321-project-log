package gd;

import android.text.TextUtils;
import com.appsflyer.R;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class i {
    public static Status a(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(":", 2);
            split[0] = split[0].trim();
            if (split.length > 1 && (str2 = split[1]) != null) {
                split[1] = str2.trim();
            }
            List asList = Arrays.asList(split);
            if (asList.size() > 1) {
                return b((String) asList.get(0), (String) asList.get(1));
            }
            return b((String) asList.get(0), null);
        }
        return new Status(17499, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Status b(String str, String str2) {
        char c10;
        int i6;
        switch (str.hashCode()) {
            case -2130504259:
                if (str.equals("USER_CANCELLED")) {
                    c10 = 'C';
                    break;
                }
                c10 = 65535;
                break;
            case -2065866930:
                if (str.equals("INVALID_RECIPIENT_EMAIL")) {
                    c10 = 28;
                    break;
                }
                c10 = 65535;
                break;
            case -2014808264:
                if (str.equals("WEB_CONTEXT_ALREADY_PRESENTED")) {
                    c10 = '/';
                    break;
                }
                c10 = 65535;
                break;
            case -2005236790:
                if (str.equals("INTERNAL_SUCCESS_SIGN_OUT")) {
                    c10 = '@';
                    break;
                }
                c10 = 65535;
                break;
            case -2001169389:
                if (str.equals("INVALID_IDP_RESPONSE")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -1944433728:
                if (str.equals("DYNAMIC_LINK_NOT_ACTIVATED")) {
                    c10 = '-';
                    break;
                }
                c10 = 65535;
                break;
            case -1800638118:
                if (str.equals("QUOTA_EXCEEDED")) {
                    c10 = '\'';
                    break;
                }
                c10 = 65535;
                break;
            case -1774756919:
                if (str.equals("WEB_NETWORK_REQUEST_FAILED")) {
                    c10 = ')';
                    break;
                }
                c10 = 65535;
                break;
            case -1699246888:
                if (str.equals("INVALID_RECAPTCHA_VERSION")) {
                    c10 = 'K';
                    break;
                }
                c10 = 65535;
                break;
            case -1603818979:
                if (str.equals("RECAPTCHA_NOT_ENABLED")) {
                    c10 = 'H';
                    break;
                }
                c10 = 65535;
                break;
            case -1587614300:
                if (str.equals("EXPIRED_OOB_CODE")) {
                    c10 = 25;
                    break;
                }
                c10 = 65535;
                break;
            case -1583894766:
                if (str.equals("INVALID_OOB_CODE")) {
                    c10 = 24;
                    break;
                }
                c10 = 65535;
                break;
            case -1458751677:
                if (str.equals("MISSING_EMAIL")) {
                    c10 = 29;
                    break;
                }
                c10 = 65535;
                break;
            case -1421414571:
                if (str.equals("INVALID_CODE")) {
                    c10 = '\"';
                    break;
                }
                c10 = 65535;
                break;
            case -1345867105:
                if (str.equals("TOKEN_EXPIRED")) {
                    c10 = 23;
                    break;
                }
                c10 = 65535;
                break;
            case -1340100504:
                if (str.equals("INVALID_TENANT_ID")) {
                    c10 = '2';
                    break;
                }
                c10 = 65535;
                break;
            case -1232010689:
                if (str.equals("INVALID_SESSION_INFO")) {
                    c10 = '$';
                    break;
                }
                c10 = 65535;
                break;
            case -1202691903:
                if (str.equals("SECOND_FACTOR_EXISTS")) {
                    c10 = '<';
                    break;
                }
                c10 = 65535;
                break;
            case -1112393964:
                if (str.equals("INVALID_EMAIL")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case -1063710844:
                if (str.equals("ADMIN_ONLY_OPERATION")) {
                    c10 = ':';
                    break;
                }
                c10 = 65535;
                break;
            case -974503964:
                if (str.equals("MISSING_OR_INVALID_NONCE")) {
                    c10 = 'B';
                    break;
                }
                c10 = 65535;
                break;
            case -863830559:
                if (str.equals("INVALID_CERT_HASH")) {
                    c10 = '(';
                    break;
                }
                c10 = 65535;
                break;
            case -828507413:
                if (str.equals("NO_SUCH_PROVIDER")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -749743758:
                if (str.equals("MFA_ENROLLMENT_NOT_FOUND")) {
                    c10 = '9';
                    break;
                }
                c10 = 65535;
                break;
            case -736207500:
                if (str.equals("MISSING_PASSWORD")) {
                    c10 = 30;
                    break;
                }
                c10 = 65535;
                break;
            case -646022241:
                if (str.equals("CREDENTIAL_TOO_OLD_LOGIN_AGAIN")) {
                    c10 = 20;
                    break;
                }
                c10 = 65535;
                break;
            case -595928767:
                if (str.equals("TIMEOUT")) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case -505579581:
                if (str.equals("INVALID_REQ_TYPE")) {
                    c10 = 'L';
                    break;
                }
                c10 = 65535;
                break;
            case -380728810:
                if (str.equals("INVALID_RECAPTCHA_ACTION")) {
                    c10 = 'G';
                    break;
                }
                c10 = 65535;
                break;
            case -333672188:
                if (str.equals("OPERATION_NOT_ALLOWED")) {
                    c10 = 17;
                    break;
                }
                c10 = 65535;
                break;
            case -294485423:
                if (str.equals("WEB_INTERNAL_ERROR")) {
                    c10 = '*';
                    break;
                }
                c10 = 65535;
                break;
            case -217128228:
                if (str.equals("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                    c10 = '=';
                    break;
                }
                c10 = 65535;
                break;
            case -122667194:
                if (str.equals("MISSING_MFA_ENROLLMENT_ID")) {
                    c10 = '7';
                    break;
                }
                c10 = 65535;
                break;
            case -75433118:
                if (str.equals("USER_NOT_FOUND")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case -52772551:
                if (str.equals("CAPTCHA_CHECK_FAILED")) {
                    c10 = 'M';
                    break;
                }
                c10 = 65535;
                break;
            case -40686718:
                if (str.equals("WEAK_PASSWORD")) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            case 15352275:
                if (str.equals("EMAIL_NOT_FOUND")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 210308040:
                if (str.equals("UNSUPPORTED_FIRST_FACTOR")) {
                    c10 = '>';
                    break;
                }
                c10 = 65535;
                break;
            case 269327773:
                if (str.equals("INVALID_SENDER")) {
                    c10 = 27;
                    break;
                }
                c10 = 65535;
                break;
            case 278802867:
                if (str.equals("MISSING_PHONE_NUMBER")) {
                    c10 = 31;
                    break;
                }
                c10 = 65535;
                break;
            case 408411681:
                if (str.equals("INVALID_DYNAMIC_LINK_DOMAIN")) {
                    c10 = '3';
                    break;
                }
                c10 = 65535;
                break;
            case 423563023:
                if (str.equals("MISSING_MFA_PENDING_CREDENTIAL")) {
                    c10 = '6';
                    break;
                }
                c10 = 65535;
                break;
            case 429251986:
                if (str.equals("UNSUPPORTED_PASSTHROUGH_OPERATION")) {
                    c10 = 'D';
                    break;
                }
                c10 = 65535;
                break;
            case 483847807:
                if (str.equals("EMAIL_EXISTS")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 491979549:
                if (str.equals("INVALID_ID_TOKEN")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case 492072102:
                if (str.equals("WEB_STORAGE_UNSUPPORTED")) {
                    c10 = '+';
                    break;
                }
                c10 = 65535;
                break;
            case 492515765:
                if (str.equals("MISSING_CLIENT_TYPE")) {
                    c10 = 'I';
                    break;
                }
                c10 = 65535;
                break;
            case 530628231:
                if (str.equals("MISSING_RECAPTCHA_VERSION")) {
                    c10 = 'J';
                    break;
                }
                c10 = 65535;
                break;
            case 542728406:
                if (str.equals("PASSWORD_LOGIN_DISABLED")) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case 582457886:
                if (str.equals("UNVERIFIED_EMAIL")) {
                    c10 = ';';
                    break;
                }
                c10 = 65535;
                break;
            case 605031096:
                if (str.equals("REJECTED_CREDENTIAL")) {
                    c10 = '4';
                    break;
                }
                c10 = 65535;
                break;
            case 745638750:
                if (str.equals("INVALID_MFA_PENDING_CREDENTIAL")) {
                    c10 = '8';
                    break;
                }
                c10 = 65535;
                break;
            case 786916712:
                if (str.equals("INVALID_VERIFICATION_PROOF")) {
                    c10 = '%';
                    break;
                }
                c10 = 65535;
                break;
            case 799258561:
                if (str.equals("INVALID_PROVIDER_ID")) {
                    c10 = '.';
                    break;
                }
                c10 = 65535;
                break;
            case 819646646:
                if (str.equals("CREDENTIAL_MISMATCH")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 844240628:
                if (str.equals("WEB_CONTEXT_CANCELED")) {
                    c10 = '0';
                    break;
                }
                c10 = 65535;
                break;
            case 886186878:
                if (str.equals("REQUIRES_SECOND_FACTOR_AUTH")) {
                    c10 = '5';
                    break;
                }
                c10 = 65535;
                break;
            case 895302372:
                if (str.equals("MISSING_CLIENT_IDENTIFIER")) {
                    c10 = 'A';
                    break;
                }
                c10 = 65535;
                break;
            case 922685102:
                if (str.equals("INVALID_MESSAGE_PAYLOAD")) {
                    c10 = 26;
                    break;
                }
                c10 = 65535;
                break;
            case 989000548:
                if (str.equals("RESET_PASSWORD_EXCEED_LIMIT")) {
                    c10 = 22;
                    break;
                }
                c10 = 65535;
                break;
            case 1034932393:
                if (str.equals("INVALID_PENDING_TOKEN")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1072360691:
                if (str.equals("INVALID_CUSTOM_TOKEN")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 1094975491:
                if (str.equals("INVALID_PASSWORD")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case 1107081238:
                if (str.equals("<<Network Error>>")) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case 1113992697:
                if (str.equals("INVALID_RECAPTCHA_TOKEN")) {
                    c10 = 'F';
                    break;
                }
                c10 = 65535;
                break;
            case 1141576252:
                if (str.equals("SESSION_EXPIRED")) {
                    c10 = '&';
                    break;
                }
                c10 = 65535;
                break;
            case 1199811910:
                if (str.equals("MISSING_CODE")) {
                    c10 = '!';
                    break;
                }
                c10 = 65535;
                break;
            case 1226505451:
                if (str.equals("FEDERATED_USER_ID_ALREADY_LINKED")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 1308491624:
                if (str.equals("MISSING_RECAPTCHA_TOKEN")) {
                    c10 = 'E';
                    break;
                }
                c10 = 65535;
                break;
            case 1388786705:
                if (str.equals("INVALID_IDENTIFIER")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 1433767024:
                if (str.equals("USER_DISABLED")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 1442968770:
                if (str.equals("INVALID_PHONE_NUMBER")) {
                    c10 = ' ';
                    break;
                }
                c10 = 65535;
                break;
            case 1494923453:
                if (str.equals("INVALID_APP_CREDENTIAL")) {
                    c10 = 19;
                    break;
                }
                c10 = 65535;
                break;
            case 1497901284:
                if (str.equals("TOO_MANY_ATTEMPTS_TRY_LATER")) {
                    c10 = 21;
                    break;
                }
                c10 = 65535;
                break;
            case 1803454477:
                if (str.equals("MISSING_CONTINUE_URI")) {
                    c10 = ',';
                    break;
                }
                c10 = 65535;
                break;
            case 1898790704:
                if (str.equals("MISSING_SESSION_INFO")) {
                    c10 = '#';
                    break;
                }
                c10 = 65535;
                break;
            case 2063209097:
                if (str.equals("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                    c10 = '?';
                    break;
                }
                c10 = 65535;
                break;
            case 2082564316:
                if (str.equals("UNSUPPORTED_TENANT_OPERATION")) {
                    c10 = '1';
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                i6 = 17016;
                break;
            case 1:
                i6 = 17002;
                break;
            case 2:
                i6 = 17000;
                break;
            case 3:
            case 4:
                i6 = 17004;
                break;
            case 5:
                i6 = 17005;
                break;
            case 6:
            case 7:
                i6 = 17008;
                break;
            case '\b':
            case '\t':
                i6 = 17011;
                break;
            case '\n':
                i6 = 17007;
                break;
            case 11:
                i6 = 17009;
                break;
            case '\f':
                i6 = 17025;
                break;
            case '\r':
                i6 = 17017;
                break;
            case 14:
            case 15:
                i6 = 17020;
                break;
            case 16:
                i6 = 17026;
                break;
            case 17:
            case 18:
                i6 = 17006;
                break;
            case 19:
                i6 = 17028;
                break;
            case 20:
                i6 = 17014;
                break;
            case 21:
            case 22:
                i6 = 17010;
                break;
            case 23:
                i6 = 17021;
                break;
            case 24:
                i6 = 17030;
                break;
            case 25:
                i6 = 17029;
                break;
            case 26:
                i6 = 17031;
                break;
            case 27:
                i6 = 17032;
                break;
            case 28:
                i6 = 17033;
                break;
            case 29:
                i6 = 17034;
                break;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                i6 = 17035;
                break;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                i6 = 17041;
                break;
            case ' ':
                i6 = 17042;
                break;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                i6 = 17043;
                break;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                i6 = 17044;
                break;
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                i6 = 17045;
                break;
            case '$':
                i6 = 17046;
                break;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                i6 = 17049;
                break;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                i6 = 17051;
                break;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                i6 = 17052;
                break;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                i6 = 17064;
                break;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                i6 = 17061;
                break;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                i6 = 17062;
                break;
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                i6 = 17065;
                break;
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                i6 = 17040;
                break;
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                i6 = 17068;
                break;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                i6 = 17071;
                break;
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                i6 = 17057;
                break;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                i6 = 17058;
                break;
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                i6 = 17073;
                break;
            case '2':
                i6 = 17079;
                break;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                i6 = 17074;
                break;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                i6 = 17075;
                break;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                i6 = 17078;
                break;
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                i6 = 17081;
                break;
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                i6 = 17082;
                break;
            case R.styleable.AppCompatTheme_colorError /* 56 */:
                i6 = 17083;
                break;
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                i6 = 17084;
                break;
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                i6 = 17085;
                break;
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                i6 = 17086;
                break;
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                i6 = 17087;
                break;
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                i6 = 17088;
                break;
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                i6 = 17089;
                break;
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                i6 = 17090;
                break;
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                i6 = 17091;
                break;
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                i6 = 17093;
                break;
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                i6 = 17094;
                break;
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                i6 = 18001;
                break;
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                i6 = 17095;
                break;
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                i6 = 18002;
                break;
            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                i6 = 18003;
                break;
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                i6 = 18004;
                break;
            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                i6 = 18006;
                break;
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                i6 = 18007;
                break;
            case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                i6 = 18008;
                break;
            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                i6 = 18009;
                break;
            case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                i6 = 18010;
                break;
            case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                i6 = 18011;
                break;
            default:
                i6 = 17499;
                break;
        }
        if (i6 == 17499) {
            if (str2 != null) {
                return new Status(17499, defpackage.d.f(str, ":", str2));
            }
            return new Status(17499, str);
        }
        return new Status(i6, str2);
    }
}
