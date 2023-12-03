package androidx.media;

import java.util.Arrays;
/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public int f2483a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f2484b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f2485c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f2486d = -1;

    public final boolean equals(Object obj) {
        int i6;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f2484b != audioAttributesImplBase.f2484b) {
            return false;
        }
        int i10 = this.f2485c;
        int i11 = audioAttributesImplBase.f2485c;
        int i12 = audioAttributesImplBase.f2486d;
        if (i12 != -1) {
            i6 = i12;
        } else {
            int i13 = audioAttributesImplBase.f2483a;
            int i14 = AudioAttributesCompat.f2479b;
            if ((i11 & 1) == 1) {
                i6 = 7;
            } else {
                i6 = 4;
                if ((i11 & 4) == 4) {
                    i6 = 6;
                } else {
                    switch (i13) {
                        case 2:
                            i6 = 0;
                            break;
                        case 3:
                            i6 = 8;
                            break;
                        case 4:
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i6 = 5;
                            break;
                        case 6:
                            i6 = 2;
                            break;
                        case 11:
                            i6 = 10;
                            break;
                        case 12:
                        default:
                            i6 = 3;
                            break;
                        case 13:
                            i6 = 1;
                            break;
                    }
                }
            }
        }
        if (i6 == 6) {
            i11 |= 4;
        } else if (i6 == 7) {
            i11 |= 1;
        }
        if (i10 != (i11 & 273) || this.f2483a != audioAttributesImplBase.f2483a || this.f2486d != i12) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2484b), Integer.valueOf(this.f2485c), Integer.valueOf(this.f2483a), Integer.valueOf(this.f2486d)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f2486d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f2486d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        int i6 = this.f2483a;
        int i10 = AudioAttributesCompat.f2479b;
        switch (i6) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 15:
            default:
                str = c.p("unknown usage ", i6);
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        sb2.append(str);
        sb2.append(" content=");
        sb2.append(this.f2484b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f2485c).toUpperCase());
        return sb2.toString();
    }
}
