package com.hbb20;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import androidx.recyclerview.widget.k;
import com.appsflyer.R;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.hbb20.CountryCodePicker;
import com.theinnerhour.b2b.utils.SessionManager;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* compiled from: CCPCountry.java */
/* loaded from: classes.dex */
public final class a implements Comparable<a> {
    public static String A;
    public static String B;
    public static String C;
    public static ArrayList D;

    /* renamed from: z  reason: collision with root package name */
    public static CountryCodePicker.g f10141z;

    /* renamed from: u  reason: collision with root package name */
    public String f10142u;

    /* renamed from: v  reason: collision with root package name */
    public String f10143v;

    /* renamed from: w  reason: collision with root package name */
    public String f10144w;

    /* renamed from: x  reason: collision with root package name */
    public String f10145x;

    /* renamed from: y  reason: collision with root package name */
    public int f10146y;

    public a() {
        this.f10146y = -99;
    }

    public static boolean d(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            try {
                return str2.toLowerCase(Locale.ROOT).contains(str3);
            } catch (Exception unused) {
                Log.w("CCPCountry", str + ":" + str2 + " failed to execute toLowerCase(Locale.ROOT).contains(query) for query:" + str3);
                return false;
            }
        }
        return false;
    }

    public static a f(Context context, CountryCodePicker.g gVar, String str, ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (aVar.f10143v.equals(str)) {
                    return aVar;
                }
            }
        }
        for (a aVar2 : r(context, gVar)) {
            if (aVar2.f10143v.equals(str)) {
                return aVar2;
            }
        }
        return null;
    }

    public static a h(Context context, CountryCodePicker.g gVar, ArrayList arrayList, int i6) {
        return f(context, gVar, i6 + "", arrayList);
    }

    public static a i(String str) {
        Iterator it = p().iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f10143v.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    public static a j(String str) {
        Iterator it = p().iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f10142u.equalsIgnoreCase(str)) {
                return aVar;
            }
        }
        return null;
    }

    public static a k(Context context, CountryCodePicker.g gVar, String str) {
        for (a aVar : r(context, gVar)) {
            if (aVar.f10142u.equalsIgnoreCase(str)) {
                return aVar;
            }
        }
        return null;
    }

    public static String l(a aVar) {
        String lowerCase = aVar.f10142u.toLowerCase();
        lowerCase.getClass();
        char c10 = 65535;
        switch (lowerCase.hashCode()) {
            case 3107:
                if (lowerCase.equals("ad")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3108:
                if (lowerCase.equals("ae")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3109:
                if (lowerCase.equals("af")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3110:
                if (lowerCase.equals("ag")) {
                    c10 = 3;
                    break;
                }
                break;
            case 3112:
                if (lowerCase.equals("ai")) {
                    c10 = 4;
                    break;
                }
                break;
            case 3115:
                if (lowerCase.equals("al")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3116:
                if (lowerCase.equals("am")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3118:
                if (lowerCase.equals("ao")) {
                    c10 = 7;
                    break;
                }
                break;
            case 3120:
                if (lowerCase.equals("aq")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 3121:
                if (lowerCase.equals("ar")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 3122:
                if (lowerCase.equals("as")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 3123:
                if (lowerCase.equals("at")) {
                    c10 = 11;
                    break;
                }
                break;
            case 3124:
                if (lowerCase.equals("au")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 3126:
                if (lowerCase.equals("aw")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 3127:
                if (lowerCase.equals("ax")) {
                    c10 = 14;
                    break;
                }
                break;
            case 3129:
                if (lowerCase.equals("az")) {
                    c10 = 15;
                    break;
                }
                break;
            case 3135:
                if (lowerCase.equals("ba")) {
                    c10 = 16;
                    break;
                }
                break;
            case 3136:
                if (lowerCase.equals("bb")) {
                    c10 = 17;
                    break;
                }
                break;
            case 3138:
                if (lowerCase.equals("bd")) {
                    c10 = 18;
                    break;
                }
                break;
            case 3139:
                if (lowerCase.equals("be")) {
                    c10 = 19;
                    break;
                }
                break;
            case 3140:
                if (lowerCase.equals("bf")) {
                    c10 = 20;
                    break;
                }
                break;
            case 3141:
                if (lowerCase.equals("bg")) {
                    c10 = 21;
                    break;
                }
                break;
            case 3142:
                if (lowerCase.equals("bh")) {
                    c10 = 22;
                    break;
                }
                break;
            case 3143:
                if (lowerCase.equals("bi")) {
                    c10 = 23;
                    break;
                }
                break;
            case 3144:
                if (lowerCase.equals("bj")) {
                    c10 = 24;
                    break;
                }
                break;
            case 3146:
                if (lowerCase.equals("bl")) {
                    c10 = 25;
                    break;
                }
                break;
            case 3147:
                if (lowerCase.equals("bm")) {
                    c10 = 26;
                    break;
                }
                break;
            case 3148:
                if (lowerCase.equals("bn")) {
                    c10 = 27;
                    break;
                }
                break;
            case 3149:
                if (lowerCase.equals("bo")) {
                    c10 = 28;
                    break;
                }
                break;
            case 3151:
                if (lowerCase.equals("bq")) {
                    c10 = 29;
                    break;
                }
                break;
            case 3152:
                if (lowerCase.equals("br")) {
                    c10 = 30;
                    break;
                }
                break;
            case 3153:
                if (lowerCase.equals("bs")) {
                    c10 = 31;
                    break;
                }
                break;
            case 3154:
                if (lowerCase.equals("bt")) {
                    c10 = ' ';
                    break;
                }
                break;
            case 3156:
                if (lowerCase.equals("bv")) {
                    c10 = '!';
                    break;
                }
                break;
            case 3157:
                if (lowerCase.equals("bw")) {
                    c10 = '\"';
                    break;
                }
                break;
            case 3159:
                if (lowerCase.equals("by")) {
                    c10 = '#';
                    break;
                }
                break;
            case 3160:
                if (lowerCase.equals("bz")) {
                    c10 = '$';
                    break;
                }
                break;
            case 3166:
                if (lowerCase.equals("ca")) {
                    c10 = '%';
                    break;
                }
                break;
            case 3168:
                if (lowerCase.equals("cc")) {
                    c10 = '&';
                    break;
                }
                break;
            case 3169:
                if (lowerCase.equals("cd")) {
                    c10 = '\'';
                    break;
                }
                break;
            case 3171:
                if (lowerCase.equals("cf")) {
                    c10 = '(';
                    break;
                }
                break;
            case 3172:
                if (lowerCase.equals("cg")) {
                    c10 = ')';
                    break;
                }
                break;
            case 3173:
                if (lowerCase.equals("ch")) {
                    c10 = '*';
                    break;
                }
                break;
            case 3174:
                if (lowerCase.equals("ci")) {
                    c10 = '+';
                    break;
                }
                break;
            case 3176:
                if (lowerCase.equals("ck")) {
                    c10 = ',';
                    break;
                }
                break;
            case 3177:
                if (lowerCase.equals("cl")) {
                    c10 = '-';
                    break;
                }
                break;
            case 3178:
                if (lowerCase.equals("cm")) {
                    c10 = '.';
                    break;
                }
                break;
            case 3179:
                if (lowerCase.equals("cn")) {
                    c10 = '/';
                    break;
                }
                break;
            case 3180:
                if (lowerCase.equals("co")) {
                    c10 = '0';
                    break;
                }
                break;
            case 3183:
                if (lowerCase.equals("cr")) {
                    c10 = '1';
                    break;
                }
                break;
            case 3186:
                if (lowerCase.equals("cu")) {
                    c10 = '2';
                    break;
                }
                break;
            case 3187:
                if (lowerCase.equals("cv")) {
                    c10 = '3';
                    break;
                }
                break;
            case 3188:
                if (lowerCase.equals("cw")) {
                    c10 = '4';
                    break;
                }
                break;
            case 3189:
                if (lowerCase.equals("cx")) {
                    c10 = '5';
                    break;
                }
                break;
            case 3190:
                if (lowerCase.equals("cy")) {
                    c10 = '6';
                    break;
                }
                break;
            case 3191:
                if (lowerCase.equals("cz")) {
                    c10 = '7';
                    break;
                }
                break;
            case 3201:
                if (lowerCase.equals("de")) {
                    c10 = '8';
                    break;
                }
                break;
            case 3206:
                if (lowerCase.equals("dj")) {
                    c10 = '9';
                    break;
                }
                break;
            case 3207:
                if (lowerCase.equals("dk")) {
                    c10 = ':';
                    break;
                }
                break;
            case 3209:
                if (lowerCase.equals("dm")) {
                    c10 = ';';
                    break;
                }
                break;
            case 3211:
                if (lowerCase.equals("do")) {
                    c10 = '<';
                    break;
                }
                break;
            case 3222:
                if (lowerCase.equals("dz")) {
                    c10 = '=';
                    break;
                }
                break;
            case 3230:
                if (lowerCase.equals("ec")) {
                    c10 = '>';
                    break;
                }
                break;
            case 3232:
                if (lowerCase.equals("ee")) {
                    c10 = '?';
                    break;
                }
                break;
            case 3234:
                if (lowerCase.equals("eg")) {
                    c10 = '@';
                    break;
                }
                break;
            case 3235:
                if (lowerCase.equals("eh")) {
                    c10 = 'A';
                    break;
                }
                break;
            case 3245:
                if (lowerCase.equals("er")) {
                    c10 = 'B';
                    break;
                }
                break;
            case 3246:
                if (lowerCase.equals("es")) {
                    c10 = 'C';
                    break;
                }
                break;
            case 3247:
                if (lowerCase.equals("et")) {
                    c10 = 'D';
                    break;
                }
                break;
            case 3267:
                if (lowerCase.equals("fi")) {
                    c10 = 'E';
                    break;
                }
                break;
            case 3268:
                if (lowerCase.equals("fj")) {
                    c10 = 'F';
                    break;
                }
                break;
            case 3269:
                if (lowerCase.equals("fk")) {
                    c10 = 'G';
                    break;
                }
                break;
            case 3271:
                if (lowerCase.equals("fm")) {
                    c10 = 'H';
                    break;
                }
                break;
            case 3273:
                if (lowerCase.equals("fo")) {
                    c10 = 'I';
                    break;
                }
                break;
            case 3276:
                if (lowerCase.equals("fr")) {
                    c10 = 'J';
                    break;
                }
                break;
            case 3290:
                if (lowerCase.equals("ga")) {
                    c10 = 'K';
                    break;
                }
                break;
            case 3291:
                if (lowerCase.equals("gb")) {
                    c10 = 'L';
                    break;
                }
                break;
            case 3293:
                if (lowerCase.equals("gd")) {
                    c10 = 'M';
                    break;
                }
                break;
            case 3294:
                if (lowerCase.equals("ge")) {
                    c10 = 'N';
                    break;
                }
                break;
            case 3295:
                if (lowerCase.equals("gf")) {
                    c10 = 'O';
                    break;
                }
                break;
            case 3296:
                if (lowerCase.equals("gg")) {
                    c10 = 'P';
                    break;
                }
                break;
            case 3297:
                if (lowerCase.equals("gh")) {
                    c10 = 'Q';
                    break;
                }
                break;
            case 3298:
                if (lowerCase.equals("gi")) {
                    c10 = 'R';
                    break;
                }
                break;
            case 3301:
                if (lowerCase.equals("gl")) {
                    c10 = 'S';
                    break;
                }
                break;
            case 3302:
                if (lowerCase.equals("gm")) {
                    c10 = 'T';
                    break;
                }
                break;
            case 3303:
                if (lowerCase.equals("gn")) {
                    c10 = 'U';
                    break;
                }
                break;
            case 3305:
                if (lowerCase.equals("gp")) {
                    c10 = 'V';
                    break;
                }
                break;
            case 3306:
                if (lowerCase.equals("gq")) {
                    c10 = 'W';
                    break;
                }
                break;
            case 3307:
                if (lowerCase.equals("gr")) {
                    c10 = 'X';
                    break;
                }
                break;
            case 3308:
                if (lowerCase.equals("gs")) {
                    c10 = 'Y';
                    break;
                }
                break;
            case 3309:
                if (lowerCase.equals("gt")) {
                    c10 = 'Z';
                    break;
                }
                break;
            case 3310:
                if (lowerCase.equals("gu")) {
                    c10 = '[';
                    break;
                }
                break;
            case 3312:
                if (lowerCase.equals("gw")) {
                    c10 = '\\';
                    break;
                }
                break;
            case 3314:
                if (lowerCase.equals("gy")) {
                    c10 = ']';
                    break;
                }
                break;
            case 3331:
                if (lowerCase.equals("hk")) {
                    c10 = '^';
                    break;
                }
                break;
            case 3333:
                if (lowerCase.equals("hm")) {
                    c10 = '_';
                    break;
                }
                break;
            case 3334:
                if (lowerCase.equals("hn")) {
                    c10 = '`';
                    break;
                }
                break;
            case 3338:
                if (lowerCase.equals("hr")) {
                    c10 = 'a';
                    break;
                }
                break;
            case 3340:
                if (lowerCase.equals("ht")) {
                    c10 = 'b';
                    break;
                }
                break;
            case 3341:
                if (lowerCase.equals("hu")) {
                    c10 = 'c';
                    break;
                }
                break;
            case 3355:
                if (lowerCase.equals("id")) {
                    c10 = 'd';
                    break;
                }
                break;
            case 3356:
                if (lowerCase.equals("ie")) {
                    c10 = 'e';
                    break;
                }
                break;
            case 3363:
                if (lowerCase.equals("il")) {
                    c10 = 'f';
                    break;
                }
                break;
            case 3364:
                if (lowerCase.equals("im")) {
                    c10 = 'g';
                    break;
                }
                break;
            case 3365:
                if (lowerCase.equals("in")) {
                    c10 = 'h';
                    break;
                }
                break;
            case 3366:
                if (lowerCase.equals("io")) {
                    c10 = 'i';
                    break;
                }
                break;
            case 3368:
                if (lowerCase.equals("iq")) {
                    c10 = 'j';
                    break;
                }
                break;
            case 3369:
                if (lowerCase.equals("ir")) {
                    c10 = 'k';
                    break;
                }
                break;
            case 3370:
                if (lowerCase.equals("is")) {
                    c10 = 'l';
                    break;
                }
                break;
            case 3371:
                if (lowerCase.equals("it")) {
                    c10 = 'm';
                    break;
                }
                break;
            case 3387:
                if (lowerCase.equals("je")) {
                    c10 = 'n';
                    break;
                }
                break;
            case 3395:
                if (lowerCase.equals("jm")) {
                    c10 = 'o';
                    break;
                }
                break;
            case 3397:
                if (lowerCase.equals("jo")) {
                    c10 = 'p';
                    break;
                }
                break;
            case 3398:
                if (lowerCase.equals("jp")) {
                    c10 = 'q';
                    break;
                }
                break;
            case 3418:
                if (lowerCase.equals("ke")) {
                    c10 = 'r';
                    break;
                }
                break;
            case 3420:
                if (lowerCase.equals("kg")) {
                    c10 = 's';
                    break;
                }
                break;
            case 3421:
                if (lowerCase.equals("kh")) {
                    c10 = 't';
                    break;
                }
                break;
            case 3422:
                if (lowerCase.equals("ki")) {
                    c10 = 'u';
                    break;
                }
                break;
            case 3426:
                if (lowerCase.equals("km")) {
                    c10 = 'v';
                    break;
                }
                break;
            case 3427:
                if (lowerCase.equals("kn")) {
                    c10 = 'w';
                    break;
                }
                break;
            case 3429:
                if (lowerCase.equals("kp")) {
                    c10 = 'x';
                    break;
                }
                break;
            case 3431:
                if (lowerCase.equals("kr")) {
                    c10 = 'y';
                    break;
                }
                break;
            case 3436:
                if (lowerCase.equals("kw")) {
                    c10 = 'z';
                    break;
                }
                break;
            case 3438:
                if (lowerCase.equals("ky")) {
                    c10 = '{';
                    break;
                }
                break;
            case 3439:
                if (lowerCase.equals("kz")) {
                    c10 = '|';
                    break;
                }
                break;
            case 3445:
                if (lowerCase.equals("la")) {
                    c10 = '}';
                    break;
                }
                break;
            case 3446:
                if (lowerCase.equals("lb")) {
                    c10 = '~';
                    break;
                }
                break;
            case 3447:
                if (lowerCase.equals("lc")) {
                    c10 = 127;
                    break;
                }
                break;
            case 3453:
                if (lowerCase.equals("li")) {
                    c10 = 128;
                    break;
                }
                break;
            case 3455:
                if (lowerCase.equals("lk")) {
                    c10 = 129;
                    break;
                }
                break;
            case 3462:
                if (lowerCase.equals("lr")) {
                    c10 = 130;
                    break;
                }
                break;
            case 3463:
                if (lowerCase.equals("ls")) {
                    c10 = 131;
                    break;
                }
                break;
            case 3464:
                if (lowerCase.equals("lt")) {
                    c10 = 132;
                    break;
                }
                break;
            case 3465:
                if (lowerCase.equals("lu")) {
                    c10 = 133;
                    break;
                }
                break;
            case 3466:
                if (lowerCase.equals("lv")) {
                    c10 = 134;
                    break;
                }
                break;
            case 3469:
                if (lowerCase.equals("ly")) {
                    c10 = 135;
                    break;
                }
                break;
            case 3476:
                if (lowerCase.equals("ma")) {
                    c10 = 136;
                    break;
                }
                break;
            case 3478:
                if (lowerCase.equals("mc")) {
                    c10 = 137;
                    break;
                }
                break;
            case 3479:
                if (lowerCase.equals("md")) {
                    c10 = 138;
                    break;
                }
                break;
            case 3480:
                if (lowerCase.equals("me")) {
                    c10 = 139;
                    break;
                }
                break;
            case 3481:
                if (lowerCase.equals("mf")) {
                    c10 = 140;
                    break;
                }
                break;
            case 3482:
                if (lowerCase.equals("mg")) {
                    c10 = 141;
                    break;
                }
                break;
            case 3483:
                if (lowerCase.equals("mh")) {
                    c10 = 142;
                    break;
                }
                break;
            case 3486:
                if (lowerCase.equals("mk")) {
                    c10 = 143;
                    break;
                }
                break;
            case 3487:
                if (lowerCase.equals("ml")) {
                    c10 = 144;
                    break;
                }
                break;
            case 3488:
                if (lowerCase.equals("mm")) {
                    c10 = 145;
                    break;
                }
                break;
            case 3489:
                if (lowerCase.equals("mn")) {
                    c10 = 146;
                    break;
                }
                break;
            case 3490:
                if (lowerCase.equals("mo")) {
                    c10 = 147;
                    break;
                }
                break;
            case 3491:
                if (lowerCase.equals("mp")) {
                    c10 = 148;
                    break;
                }
                break;
            case 3492:
                if (lowerCase.equals("mq")) {
                    c10 = 149;
                    break;
                }
                break;
            case 3493:
                if (lowerCase.equals("mr")) {
                    c10 = 150;
                    break;
                }
                break;
            case 3494:
                if (lowerCase.equals("ms")) {
                    c10 = 151;
                    break;
                }
                break;
            case 3495:
                if (lowerCase.equals("mt")) {
                    c10 = 152;
                    break;
                }
                break;
            case 3496:
                if (lowerCase.equals("mu")) {
                    c10 = 153;
                    break;
                }
                break;
            case 3497:
                if (lowerCase.equals("mv")) {
                    c10 = 154;
                    break;
                }
                break;
            case 3498:
                if (lowerCase.equals("mw")) {
                    c10 = 155;
                    break;
                }
                break;
            case 3499:
                if (lowerCase.equals("mx")) {
                    c10 = 156;
                    break;
                }
                break;
            case 3500:
                if (lowerCase.equals("my")) {
                    c10 = 157;
                    break;
                }
                break;
            case 3501:
                if (lowerCase.equals("mz")) {
                    c10 = 158;
                    break;
                }
                break;
            case 3507:
                if (lowerCase.equals("na")) {
                    c10 = 159;
                    break;
                }
                break;
            case 3509:
                if (lowerCase.equals("nc")) {
                    c10 = 160;
                    break;
                }
                break;
            case 3511:
                if (lowerCase.equals("ne")) {
                    c10 = 161;
                    break;
                }
                break;
            case 3512:
                if (lowerCase.equals("nf")) {
                    c10 = 162;
                    break;
                }
                break;
            case 3513:
                if (lowerCase.equals("ng")) {
                    c10 = 163;
                    break;
                }
                break;
            case 3515:
                if (lowerCase.equals("ni")) {
                    c10 = 164;
                    break;
                }
                break;
            case 3518:
                if (lowerCase.equals("nl")) {
                    c10 = 165;
                    break;
                }
                break;
            case 3521:
                if (lowerCase.equals("no")) {
                    c10 = 166;
                    break;
                }
                break;
            case 3522:
                if (lowerCase.equals("np")) {
                    c10 = 167;
                    break;
                }
                break;
            case 3524:
                if (lowerCase.equals("nr")) {
                    c10 = 168;
                    break;
                }
                break;
            case 3527:
                if (lowerCase.equals("nu")) {
                    c10 = 169;
                    break;
                }
                break;
            case 3532:
                if (lowerCase.equals("nz")) {
                    c10 = 170;
                    break;
                }
                break;
            case 3550:
                if (lowerCase.equals("om")) {
                    c10 = 171;
                    break;
                }
                break;
            case 3569:
                if (lowerCase.equals("pa")) {
                    c10 = 172;
                    break;
                }
                break;
            case 3573:
                if (lowerCase.equals("pe")) {
                    c10 = 173;
                    break;
                }
                break;
            case 3574:
                if (lowerCase.equals("pf")) {
                    c10 = 174;
                    break;
                }
                break;
            case 3575:
                if (lowerCase.equals("pg")) {
                    c10 = 175;
                    break;
                }
                break;
            case 3576:
                if (lowerCase.equals("ph")) {
                    c10 = 176;
                    break;
                }
                break;
            case 3579:
                if (lowerCase.equals("pk")) {
                    c10 = 177;
                    break;
                }
                break;
            case 3580:
                if (lowerCase.equals("pl")) {
                    c10 = 178;
                    break;
                }
                break;
            case 3581:
                if (lowerCase.equals("pm")) {
                    c10 = 179;
                    break;
                }
                break;
            case 3582:
                if (lowerCase.equals("pn")) {
                    c10 = 180;
                    break;
                }
                break;
            case 3586:
                if (lowerCase.equals("pr")) {
                    c10 = 181;
                    break;
                }
                break;
            case 3587:
                if (lowerCase.equals("ps")) {
                    c10 = 182;
                    break;
                }
                break;
            case 3588:
                if (lowerCase.equals("pt")) {
                    c10 = 183;
                    break;
                }
                break;
            case 3591:
                if (lowerCase.equals("pw")) {
                    c10 = 184;
                    break;
                }
                break;
            case 3593:
                if (lowerCase.equals("py")) {
                    c10 = 185;
                    break;
                }
                break;
            case 3600:
                if (lowerCase.equals("qa")) {
                    c10 = 186;
                    break;
                }
                break;
            case 3635:
                if (lowerCase.equals("re")) {
                    c10 = 187;
                    break;
                }
                break;
            case 3645:
                if (lowerCase.equals("ro")) {
                    c10 = 188;
                    break;
                }
                break;
            case 3649:
                if (lowerCase.equals("rs")) {
                    c10 = 189;
                    break;
                }
                break;
            case 3651:
                if (lowerCase.equals("ru")) {
                    c10 = 190;
                    break;
                }
                break;
            case 3653:
                if (lowerCase.equals("rw")) {
                    c10 = 191;
                    break;
                }
                break;
            case 3662:
                if (lowerCase.equals("sa")) {
                    c10 = 192;
                    break;
                }
                break;
            case 3663:
                if (lowerCase.equals("sb")) {
                    c10 = 193;
                    break;
                }
                break;
            case 3664:
                if (lowerCase.equals("sc")) {
                    c10 = 194;
                    break;
                }
                break;
            case 3665:
                if (lowerCase.equals("sd")) {
                    c10 = 195;
                    break;
                }
                break;
            case 3666:
                if (lowerCase.equals("se")) {
                    c10 = 196;
                    break;
                }
                break;
            case 3668:
                if (lowerCase.equals("sg")) {
                    c10 = 197;
                    break;
                }
                break;
            case 3669:
                if (lowerCase.equals("sh")) {
                    c10 = 198;
                    break;
                }
                break;
            case 3670:
                if (lowerCase.equals("si")) {
                    c10 = 199;
                    break;
                }
                break;
            case 3671:
                if (lowerCase.equals("sj")) {
                    c10 = 200;
                    break;
                }
                break;
            case 3672:
                if (lowerCase.equals("sk")) {
                    c10 = 201;
                    break;
                }
                break;
            case 3673:
                if (lowerCase.equals("sl")) {
                    c10 = 202;
                    break;
                }
                break;
            case 3674:
                if (lowerCase.equals("sm")) {
                    c10 = 203;
                    break;
                }
                break;
            case 3675:
                if (lowerCase.equals("sn")) {
                    c10 = 204;
                    break;
                }
                break;
            case 3676:
                if (lowerCase.equals("so")) {
                    c10 = 205;
                    break;
                }
                break;
            case 3679:
                if (lowerCase.equals("sr")) {
                    c10 = 206;
                    break;
                }
                break;
            case 3680:
                if (lowerCase.equals("ss")) {
                    c10 = 207;
                    break;
                }
                break;
            case 3681:
                if (lowerCase.equals("st")) {
                    c10 = 208;
                    break;
                }
                break;
            case 3683:
                if (lowerCase.equals("sv")) {
                    c10 = 209;
                    break;
                }
                break;
            case 3685:
                if (lowerCase.equals("sx")) {
                    c10 = 210;
                    break;
                }
                break;
            case 3686:
                if (lowerCase.equals("sy")) {
                    c10 = 211;
                    break;
                }
                break;
            case 3687:
                if (lowerCase.equals("sz")) {
                    c10 = 212;
                    break;
                }
                break;
            case 3695:
                if (lowerCase.equals("tc")) {
                    c10 = 213;
                    break;
                }
                break;
            case 3696:
                if (lowerCase.equals("td")) {
                    c10 = 214;
                    break;
                }
                break;
            case 3698:
                if (lowerCase.equals("tf")) {
                    c10 = 215;
                    break;
                }
                break;
            case 3699:
                if (lowerCase.equals("tg")) {
                    c10 = 216;
                    break;
                }
                break;
            case 3700:
                if (lowerCase.equals("th")) {
                    c10 = 217;
                    break;
                }
                break;
            case 3702:
                if (lowerCase.equals("tj")) {
                    c10 = 218;
                    break;
                }
                break;
            case 3703:
                if (lowerCase.equals("tk")) {
                    c10 = 219;
                    break;
                }
                break;
            case 3704:
                if (lowerCase.equals("tl")) {
                    c10 = 220;
                    break;
                }
                break;
            case 3705:
                if (lowerCase.equals("tm")) {
                    c10 = 221;
                    break;
                }
                break;
            case 3706:
                if (lowerCase.equals("tn")) {
                    c10 = 222;
                    break;
                }
                break;
            case 3707:
                if (lowerCase.equals("to")) {
                    c10 = 223;
                    break;
                }
                break;
            case 3710:
                if (lowerCase.equals("tr")) {
                    c10 = 224;
                    break;
                }
                break;
            case 3712:
                if (lowerCase.equals("tt")) {
                    c10 = 225;
                    break;
                }
                break;
            case 3714:
                if (lowerCase.equals("tv")) {
                    c10 = 226;
                    break;
                }
                break;
            case 3715:
                if (lowerCase.equals("tw")) {
                    c10 = 227;
                    break;
                }
                break;
            case 3718:
                if (lowerCase.equals("tz")) {
                    c10 = 228;
                    break;
                }
                break;
            case 3724:
                if (lowerCase.equals("ua")) {
                    c10 = 229;
                    break;
                }
                break;
            case 3730:
                if (lowerCase.equals("ug")) {
                    c10 = 230;
                    break;
                }
                break;
            case 3736:
                if (lowerCase.equals("um")) {
                    c10 = 231;
                    break;
                }
                break;
            case 3742:
                if (lowerCase.equals("us")) {
                    c10 = 232;
                    break;
                }
                break;
            case 3748:
                if (lowerCase.equals("uy")) {
                    c10 = 233;
                    break;
                }
                break;
            case 3749:
                if (lowerCase.equals("uz")) {
                    c10 = 234;
                    break;
                }
                break;
            case 3755:
                if (lowerCase.equals("va")) {
                    c10 = 235;
                    break;
                }
                break;
            case 3757:
                if (lowerCase.equals("vc")) {
                    c10 = 236;
                    break;
                }
                break;
            case 3759:
                if (lowerCase.equals("ve")) {
                    c10 = 237;
                    break;
                }
                break;
            case 3761:
                if (lowerCase.equals("vg")) {
                    c10 = 238;
                    break;
                }
                break;
            case 3763:
                if (lowerCase.equals("vi")) {
                    c10 = 239;
                    break;
                }
                break;
            case 3768:
                if (lowerCase.equals("vn")) {
                    c10 = 240;
                    break;
                }
                break;
            case 3775:
                if (lowerCase.equals("vu")) {
                    c10 = 241;
                    break;
                }
                break;
            case 3791:
                if (lowerCase.equals("wf")) {
                    c10 = 242;
                    break;
                }
                break;
            case 3804:
                if (lowerCase.equals("ws")) {
                    c10 = 243;
                    break;
                }
                break;
            case 3827:
                if (lowerCase.equals("xk")) {
                    c10 = 244;
                    break;
                }
                break;
            case 3852:
                if (lowerCase.equals("ye")) {
                    c10 = 245;
                    break;
                }
                break;
            case 3867:
                if (lowerCase.equals("yt")) {
                    c10 = 246;
                    break;
                }
                break;
            case 3879:
                if (lowerCase.equals("za")) {
                    c10 = 247;
                    break;
                }
                break;
            case 3891:
                if (lowerCase.equals("zm")) {
                    c10 = 248;
                    break;
                }
                break;
            case 3901:
                if (lowerCase.equals("zw")) {
                    c10 = 249;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return "🇦🇩";
            case 1:
                return "🇦🇪";
            case 2:
                return "🇦🇫";
            case 3:
                return "🇦🇬";
            case 4:
                return "🇦🇮";
            case 5:
                return "🇦🇱";
            case 6:
                return "🇦🇲";
            case 7:
                return "🇦🇴";
            case '\b':
                return "🇦🇶";
            case '\t':
                return "🇦🇷";
            case '\n':
                return "🇦🇸";
            case 11:
                return "🇦🇹";
            case '\f':
                return "🇦🇺";
            case '\r':
                return "🇦🇼";
            case 14:
                return "🇦🇽";
            case 15:
                return "🇦🇿";
            case 16:
                return "🇧🇦";
            case 17:
                return "🇧🇧";
            case 18:
                return "🇧🇩";
            case 19:
                return "🇧🇪";
            case 20:
                return "🇧🇫";
            case 21:
                return "🇧🇬";
            case 22:
                return "🇧🇭";
            case 23:
                return "🇧🇮";
            case 24:
                return "🇧🇯";
            case 25:
                return "🇧🇱";
            case 26:
                return "🇧🇲";
            case 27:
                return "🇧🇳";
            case 28:
                return "🇧🇴";
            case 29:
                return "🇧🇶";
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return "🇧🇷";
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return "🇧🇸";
            case ' ':
                return "🇧🇹";
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return "🇧🇻";
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                return "🇧🇼";
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                return "🇧🇾";
            case '$':
                return "🇧🇿";
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return "🇨🇦";
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return "🇨🇨";
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return "🇨🇩";
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return "🇨🇫";
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return "🇨🇬";
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return "🇨🇭";
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                return "🇨🇮";
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                return "🇨🇰";
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                return "🇨🇱";
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                return "🇨🇲";
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                return "🇨🇳";
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                return "🇨🇴";
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                return "🇨🇷";
            case '2':
                return "🇨🇺";
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                return "🇨🇻";
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                return "🇨🇼";
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                return "🇨🇽";
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                return "🇨🇾";
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                return "🇨🇿";
            case R.styleable.AppCompatTheme_colorError /* 56 */:
                return "🇩🇪";
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                return "🇩🇯";
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                return "🇩🇰";
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                return "🇩🇲";
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                return "🇩🇴";
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                return "🇩🇿";
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                return "🇪🇨";
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                return "🇪🇪";
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                return "🇪🇬";
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                return "🇪🇭";
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                return "🇪🇷";
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                return "🇪🇸";
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                return "🇪🇹";
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                return "🇫🇮";
            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                return "🇫🇯";
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                return "🇫🇰";
            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                return "🇫🇲";
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                return "🇫🇴";
            case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                return "🇫🇷";
            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                return "🇬🇦";
            case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                return "🇬🇧";
            case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                return "🇬🇩";
            case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                return "🇬🇪";
            case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                return "🇬🇫";
            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                return "🇬🇬";
            case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                return "🇬🇭";
            case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                return "🇬🇮";
            case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                return "🇬🇱";
            case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                return "🇬🇲";
            case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                return "🇬🇳";
            case 'V':
                return "🇬🇵";
            case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                return "🇬🇶";
            case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                return "🇬🇷";
            case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                return "🇬🇸";
            case 'Z':
                return "🇬🇹";
            case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                return "🇬🇺";
            case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                return "🇬🇼";
            case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                return "🇬🇾";
            case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                return "🇭🇰";
            case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                return "🇭🇲";
            case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                return "🇭🇳";
            case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                return "🇭🇷";
            case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                return "🇭🇹";
            case 'c':
                return "🇭🇺";
            case 'd':
                return "🇮🇩";
            case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                return "🇮🇪";
            case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
                return "🇮🇱";
            case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                return "🇮🇲";
            case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                return "🇮🇳";
            case R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 105 */:
                return "🇮🇴";
            case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                return "🇮🇶";
            case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                return "🇮🇷";
            case R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
                return "🇮🇸";
            case R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
                return "🇮🇹";
            case R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 110 */:
                return "🇯🇪";
            case R.styleable.AppCompatTheme_textColorSearchUrl /* 111 */:
                return "🇯🇲";
            case R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 112 */:
                return "🇯🇴";
            case R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
                return "🇯🇵";
            case R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
                return "🇰🇪";
            case R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                return "🇰🇬";
            case R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
                return "🇰🇭";
            case R.styleable.AppCompatTheme_windowActionBar /* 117 */:
                return "🇰🇮";
            case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                return "🇰🇲";
            case R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                return "🇰🇳";
            case R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                return "🇰🇵";
            case R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
                return "🇰🇷";
            case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                return "🇰🇼";
            case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                return "🇰🇾";
            case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                return "🇰🇿";
            case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                return "🇱🇦";
            case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                return "🇱🇧";
            case 127:
                return "🇱🇨";
            case 128:
                return "🇱🇮";
            case 129:
                return "🇱🇰";
            case 130:
                return "🇱🇷";
            case 131:
                return "🇱🇸";
            case 132:
                return "🇱🇹";
            case 133:
                return "🇱🇺";
            case 134:
                return "🇱🇻";
            case 135:
                return "🇱🇾";
            case 136:
                return "🇲🇦";
            case 137:
                return "🇲🇨";
            case 138:
                return "🇲🇩";
            case 139:
                return "🇲🇪";
            case 140:
                return "🇲🇫";
            case 141:
                return "🇲🇬";
            case 142:
                return "🇲🇭";
            case 143:
                return "🇲🇰";
            case 144:
                return "🇲🇱";
            case 145:
                return "🇲🇲";
            case 146:
                return "🇲🇳";
            case 147:
                return "🇲🇴";
            case 148:
                return "🇲🇵";
            case 149:
                return "🇲🇶";
            case 150:
                return "🇲🇷";
            case 151:
                return "🇲🇸";
            case 152:
                return "🇲🇹";
            case 153:
                return "🇲🇺";
            case 154:
                return "🇲🇻";
            case 155:
                return "🇲🇼";
            case 156:
                return "🇲🇽";
            case 157:
                return "🇲🇾";
            case 158:
                return "🇲🇿";
            case 159:
                return "🇳🇦";
            case 160:
                return "🇳🇨";
            case 161:
                return "🇳🇪";
            case 162:
                return "🇳🇫";
            case 163:
                return "🇳🇬";
            case 164:
                return "🇳🇮";
            case 165:
                return "🇳🇱";
            case 166:
                return "🇳🇴";
            case 167:
                return "🇳🇵";
            case 168:
                return "🇳🇷";
            case 169:
                return "🇳🇺";
            case 170:
                return "🇳🇿";
            case 171:
                return "🇴🇲";
            case 172:
                return "🇵🇦";
            case 173:
                return "🇵🇪";
            case 174:
                return "🇵🇫";
            case 175:
                return "🇵🇬";
            case 176:
                return "🇵🇭";
            case 177:
                return "🇵🇰";
            case 178:
                return "🇵🇱";
            case 179:
                return "🇵🇲";
            case SubsamplingScaleImageView.ORIENTATION_180 /* 180 */:
                return "🇵🇳";
            case 181:
                return "🇵🇷";
            case 182:
                return "🇵🇸";
            case 183:
                return "🇵🇹";
            case 184:
                return "🇵🇼";
            case 185:
                return "🇵🇾";
            case 186:
                return "🇶🇦";
            case 187:
                return "🇷🇪";
            case 188:
                return "🇷🇴";
            case 189:
                return "🇷🇸";
            case 190:
                return "🇷🇺";
            case 191:
                return "🇷🇼";
            case 192:
                return "🇸🇦";
            case 193:
                return "🇸🇧";
            case 194:
                return "🇸🇨";
            case 195:
                return "🇸🇩";
            case 196:
                return "🇸🇪";
            case 197:
                return "🇸🇬";
            case 198:
                return "🇸🇭";
            case 199:
                return "🇸🇮";
            case k.d.DEFAULT_DRAG_ANIMATION_DURATION /* 200 */:
                return "🇸🇯";
            case 201:
                return "🇸🇰";
            case 202:
                return "🇸🇱";
            case 203:
                return "🇸🇲";
            case 204:
                return "🇸🇳";
            case 205:
                return "🇸🇴";
            case 206:
                return "🇸🇷";
            case 207:
                return "🇸🇸";
            case 208:
                return "🇸🇹";
            case 209:
                return "🇸🇻";
            case 210:
                return "🇸🇽";
            case 211:
                return "🇸🇾";
            case 212:
                return "🇸🇿";
            case 213:
                return "🇹🇨";
            case 214:
                return "🇹🇩";
            case 215:
                return "🇹🇫";
            case 216:
                return "🇹🇬";
            case 217:
                return "🇹🇭";
            case 218:
                return "🇹🇯";
            case 219:
                return "🇹🇰";
            case 220:
                return "🇹🇱";
            case 221:
                return "🇹🇲";
            case 222:
                return "🇹🇳";
            case 223:
                return "🇹🇴";
            case 224:
                return "🇹🇷";
            case 225:
                return "🇹🇹";
            case 226:
                return "🇹🇻";
            case 227:
                return "🇹🇼";
            case 228:
                return "🇹🇿";
            case 229:
                return "🇺🇦";
            case 230:
                return "🇺🇬";
            case 231:
                return "🇺🇲";
            case 232:
                return "🇺🇸";
            case 233:
                return "🇺🇾";
            case 234:
                return "🇺🇿";
            case 235:
                return "🇻🇦";
            case 236:
                return "🇻🇨";
            case 237:
                return "🇻🇪";
            case 238:
                return "🇻🇬";
            case 239:
                return "🇻🇮";
            case 240:
                return "🇻🇳";
            case 241:
                return "🇻🇺";
            case 242:
                return "🇼🇫";
            case 243:
                return "🇼🇸";
            case 244:
                return "🇽🇰";
            case 245:
                return "🇾🇪";
            case 246:
                return "🇾🇹";
            case 247:
                return "🇿🇦";
            case 248:
                return "🇿🇲";
            case 249:
                return "🇿🇼";
            default:
                return " ";
        }
    }

    public static int n(a aVar) {
        String lowerCase = aVar.f10142u.toLowerCase();
        lowerCase.getClass();
        char c10 = 65535;
        switch (lowerCase.hashCode()) {
            case 3107:
                if (lowerCase.equals("ad")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3108:
                if (lowerCase.equals("ae")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3109:
                if (lowerCase.equals("af")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3110:
                if (lowerCase.equals("ag")) {
                    c10 = 3;
                    break;
                }
                break;
            case 3112:
                if (lowerCase.equals("ai")) {
                    c10 = 4;
                    break;
                }
                break;
            case 3115:
                if (lowerCase.equals("al")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3116:
                if (lowerCase.equals("am")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3118:
                if (lowerCase.equals("ao")) {
                    c10 = 7;
                    break;
                }
                break;
            case 3120:
                if (lowerCase.equals("aq")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 3121:
                if (lowerCase.equals("ar")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 3122:
                if (lowerCase.equals("as")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 3123:
                if (lowerCase.equals("at")) {
                    c10 = 11;
                    break;
                }
                break;
            case 3124:
                if (lowerCase.equals("au")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 3126:
                if (lowerCase.equals("aw")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 3127:
                if (lowerCase.equals("ax")) {
                    c10 = 14;
                    break;
                }
                break;
            case 3129:
                if (lowerCase.equals("az")) {
                    c10 = 15;
                    break;
                }
                break;
            case 3135:
                if (lowerCase.equals("ba")) {
                    c10 = 16;
                    break;
                }
                break;
            case 3136:
                if (lowerCase.equals("bb")) {
                    c10 = 17;
                    break;
                }
                break;
            case 3138:
                if (lowerCase.equals("bd")) {
                    c10 = 18;
                    break;
                }
                break;
            case 3139:
                if (lowerCase.equals("be")) {
                    c10 = 19;
                    break;
                }
                break;
            case 3140:
                if (lowerCase.equals("bf")) {
                    c10 = 20;
                    break;
                }
                break;
            case 3141:
                if (lowerCase.equals("bg")) {
                    c10 = 21;
                    break;
                }
                break;
            case 3142:
                if (lowerCase.equals("bh")) {
                    c10 = 22;
                    break;
                }
                break;
            case 3143:
                if (lowerCase.equals("bi")) {
                    c10 = 23;
                    break;
                }
                break;
            case 3144:
                if (lowerCase.equals("bj")) {
                    c10 = 24;
                    break;
                }
                break;
            case 3146:
                if (lowerCase.equals("bl")) {
                    c10 = 25;
                    break;
                }
                break;
            case 3147:
                if (lowerCase.equals("bm")) {
                    c10 = 26;
                    break;
                }
                break;
            case 3148:
                if (lowerCase.equals("bn")) {
                    c10 = 27;
                    break;
                }
                break;
            case 3149:
                if (lowerCase.equals("bo")) {
                    c10 = 28;
                    break;
                }
                break;
            case 3152:
                if (lowerCase.equals("br")) {
                    c10 = 29;
                    break;
                }
                break;
            case 3153:
                if (lowerCase.equals("bs")) {
                    c10 = 30;
                    break;
                }
                break;
            case 3154:
                if (lowerCase.equals("bt")) {
                    c10 = 31;
                    break;
                }
                break;
            case 3157:
                if (lowerCase.equals("bw")) {
                    c10 = ' ';
                    break;
                }
                break;
            case 3159:
                if (lowerCase.equals("by")) {
                    c10 = '!';
                    break;
                }
                break;
            case 3160:
                if (lowerCase.equals("bz")) {
                    c10 = '\"';
                    break;
                }
                break;
            case 3166:
                if (lowerCase.equals("ca")) {
                    c10 = '#';
                    break;
                }
                break;
            case 3168:
                if (lowerCase.equals("cc")) {
                    c10 = '$';
                    break;
                }
                break;
            case 3169:
                if (lowerCase.equals("cd")) {
                    c10 = '%';
                    break;
                }
                break;
            case 3171:
                if (lowerCase.equals("cf")) {
                    c10 = '&';
                    break;
                }
                break;
            case 3172:
                if (lowerCase.equals("cg")) {
                    c10 = '\'';
                    break;
                }
                break;
            case 3173:
                if (lowerCase.equals("ch")) {
                    c10 = '(';
                    break;
                }
                break;
            case 3174:
                if (lowerCase.equals("ci")) {
                    c10 = ')';
                    break;
                }
                break;
            case 3176:
                if (lowerCase.equals("ck")) {
                    c10 = '*';
                    break;
                }
                break;
            case 3177:
                if (lowerCase.equals("cl")) {
                    c10 = '+';
                    break;
                }
                break;
            case 3178:
                if (lowerCase.equals("cm")) {
                    c10 = ',';
                    break;
                }
                break;
            case 3179:
                if (lowerCase.equals("cn")) {
                    c10 = '-';
                    break;
                }
                break;
            case 3180:
                if (lowerCase.equals("co")) {
                    c10 = '.';
                    break;
                }
                break;
            case 3183:
                if (lowerCase.equals("cr")) {
                    c10 = '/';
                    break;
                }
                break;
            case 3186:
                if (lowerCase.equals("cu")) {
                    c10 = '0';
                    break;
                }
                break;
            case 3187:
                if (lowerCase.equals("cv")) {
                    c10 = '1';
                    break;
                }
                break;
            case 3188:
                if (lowerCase.equals("cw")) {
                    c10 = '2';
                    break;
                }
                break;
            case 3189:
                if (lowerCase.equals("cx")) {
                    c10 = '3';
                    break;
                }
                break;
            case 3190:
                if (lowerCase.equals("cy")) {
                    c10 = '4';
                    break;
                }
                break;
            case 3191:
                if (lowerCase.equals("cz")) {
                    c10 = '5';
                    break;
                }
                break;
            case 3201:
                if (lowerCase.equals("de")) {
                    c10 = '6';
                    break;
                }
                break;
            case 3206:
                if (lowerCase.equals("dj")) {
                    c10 = '7';
                    break;
                }
                break;
            case 3207:
                if (lowerCase.equals("dk")) {
                    c10 = '8';
                    break;
                }
                break;
            case 3209:
                if (lowerCase.equals("dm")) {
                    c10 = '9';
                    break;
                }
                break;
            case 3211:
                if (lowerCase.equals("do")) {
                    c10 = ':';
                    break;
                }
                break;
            case 3222:
                if (lowerCase.equals("dz")) {
                    c10 = ';';
                    break;
                }
                break;
            case 3230:
                if (lowerCase.equals("ec")) {
                    c10 = '<';
                    break;
                }
                break;
            case 3232:
                if (lowerCase.equals("ee")) {
                    c10 = '=';
                    break;
                }
                break;
            case 3234:
                if (lowerCase.equals("eg")) {
                    c10 = '>';
                    break;
                }
                break;
            case 3245:
                if (lowerCase.equals("er")) {
                    c10 = '?';
                    break;
                }
                break;
            case 3246:
                if (lowerCase.equals("es")) {
                    c10 = '@';
                    break;
                }
                break;
            case 3247:
                if (lowerCase.equals("et")) {
                    c10 = 'A';
                    break;
                }
                break;
            case 3267:
                if (lowerCase.equals("fi")) {
                    c10 = 'B';
                    break;
                }
                break;
            case 3268:
                if (lowerCase.equals("fj")) {
                    c10 = 'C';
                    break;
                }
                break;
            case 3269:
                if (lowerCase.equals("fk")) {
                    c10 = 'D';
                    break;
                }
                break;
            case 3271:
                if (lowerCase.equals("fm")) {
                    c10 = 'E';
                    break;
                }
                break;
            case 3273:
                if (lowerCase.equals("fo")) {
                    c10 = 'F';
                    break;
                }
                break;
            case 3276:
                if (lowerCase.equals("fr")) {
                    c10 = 'G';
                    break;
                }
                break;
            case 3290:
                if (lowerCase.equals("ga")) {
                    c10 = 'H';
                    break;
                }
                break;
            case 3291:
                if (lowerCase.equals("gb")) {
                    c10 = 'I';
                    break;
                }
                break;
            case 3293:
                if (lowerCase.equals("gd")) {
                    c10 = 'J';
                    break;
                }
                break;
            case 3294:
                if (lowerCase.equals("ge")) {
                    c10 = 'K';
                    break;
                }
                break;
            case 3295:
                if (lowerCase.equals("gf")) {
                    c10 = 'L';
                    break;
                }
                break;
            case 3296:
                if (lowerCase.equals("gg")) {
                    c10 = 'M';
                    break;
                }
                break;
            case 3297:
                if (lowerCase.equals("gh")) {
                    c10 = 'N';
                    break;
                }
                break;
            case 3298:
                if (lowerCase.equals("gi")) {
                    c10 = 'O';
                    break;
                }
                break;
            case 3301:
                if (lowerCase.equals("gl")) {
                    c10 = 'P';
                    break;
                }
                break;
            case 3302:
                if (lowerCase.equals("gm")) {
                    c10 = 'Q';
                    break;
                }
                break;
            case 3303:
                if (lowerCase.equals("gn")) {
                    c10 = 'R';
                    break;
                }
                break;
            case 3305:
                if (lowerCase.equals("gp")) {
                    c10 = 'S';
                    break;
                }
                break;
            case 3306:
                if (lowerCase.equals("gq")) {
                    c10 = 'T';
                    break;
                }
                break;
            case 3307:
                if (lowerCase.equals("gr")) {
                    c10 = 'U';
                    break;
                }
                break;
            case 3309:
                if (lowerCase.equals("gt")) {
                    c10 = 'V';
                    break;
                }
                break;
            case 3310:
                if (lowerCase.equals("gu")) {
                    c10 = 'W';
                    break;
                }
                break;
            case 3312:
                if (lowerCase.equals("gw")) {
                    c10 = 'X';
                    break;
                }
                break;
            case 3314:
                if (lowerCase.equals("gy")) {
                    c10 = 'Y';
                    break;
                }
                break;
            case 3331:
                if (lowerCase.equals("hk")) {
                    c10 = 'Z';
                    break;
                }
                break;
            case 3334:
                if (lowerCase.equals("hn")) {
                    c10 = '[';
                    break;
                }
                break;
            case 3338:
                if (lowerCase.equals("hr")) {
                    c10 = '\\';
                    break;
                }
                break;
            case 3340:
                if (lowerCase.equals("ht")) {
                    c10 = ']';
                    break;
                }
                break;
            case 3341:
                if (lowerCase.equals("hu")) {
                    c10 = '^';
                    break;
                }
                break;
            case 3355:
                if (lowerCase.equals("id")) {
                    c10 = '_';
                    break;
                }
                break;
            case 3356:
                if (lowerCase.equals("ie")) {
                    c10 = '`';
                    break;
                }
                break;
            case 3363:
                if (lowerCase.equals("il")) {
                    c10 = 'a';
                    break;
                }
                break;
            case 3364:
                if (lowerCase.equals("im")) {
                    c10 = 'b';
                    break;
                }
                break;
            case 3365:
                if (lowerCase.equals("in")) {
                    c10 = 'c';
                    break;
                }
                break;
            case 3366:
                if (lowerCase.equals("io")) {
                    c10 = 'd';
                    break;
                }
                break;
            case 3368:
                if (lowerCase.equals("iq")) {
                    c10 = 'e';
                    break;
                }
                break;
            case 3369:
                if (lowerCase.equals("ir")) {
                    c10 = 'f';
                    break;
                }
                break;
            case 3370:
                if (lowerCase.equals("is")) {
                    c10 = 'g';
                    break;
                }
                break;
            case 3371:
                if (lowerCase.equals("it")) {
                    c10 = 'h';
                    break;
                }
                break;
            case 3387:
                if (lowerCase.equals("je")) {
                    c10 = 'i';
                    break;
                }
                break;
            case 3395:
                if (lowerCase.equals("jm")) {
                    c10 = 'j';
                    break;
                }
                break;
            case 3397:
                if (lowerCase.equals("jo")) {
                    c10 = 'k';
                    break;
                }
                break;
            case 3398:
                if (lowerCase.equals("jp")) {
                    c10 = 'l';
                    break;
                }
                break;
            case 3418:
                if (lowerCase.equals("ke")) {
                    c10 = 'm';
                    break;
                }
                break;
            case 3420:
                if (lowerCase.equals("kg")) {
                    c10 = 'n';
                    break;
                }
                break;
            case 3421:
                if (lowerCase.equals("kh")) {
                    c10 = 'o';
                    break;
                }
                break;
            case 3422:
                if (lowerCase.equals("ki")) {
                    c10 = 'p';
                    break;
                }
                break;
            case 3426:
                if (lowerCase.equals("km")) {
                    c10 = 'q';
                    break;
                }
                break;
            case 3427:
                if (lowerCase.equals("kn")) {
                    c10 = 'r';
                    break;
                }
                break;
            case 3429:
                if (lowerCase.equals("kp")) {
                    c10 = 's';
                    break;
                }
                break;
            case 3431:
                if (lowerCase.equals("kr")) {
                    c10 = 't';
                    break;
                }
                break;
            case 3436:
                if (lowerCase.equals("kw")) {
                    c10 = 'u';
                    break;
                }
                break;
            case 3438:
                if (lowerCase.equals("ky")) {
                    c10 = 'v';
                    break;
                }
                break;
            case 3439:
                if (lowerCase.equals("kz")) {
                    c10 = 'w';
                    break;
                }
                break;
            case 3445:
                if (lowerCase.equals("la")) {
                    c10 = 'x';
                    break;
                }
                break;
            case 3446:
                if (lowerCase.equals("lb")) {
                    c10 = 'y';
                    break;
                }
                break;
            case 3447:
                if (lowerCase.equals("lc")) {
                    c10 = 'z';
                    break;
                }
                break;
            case 3453:
                if (lowerCase.equals("li")) {
                    c10 = '{';
                    break;
                }
                break;
            case 3455:
                if (lowerCase.equals("lk")) {
                    c10 = '|';
                    break;
                }
                break;
            case 3462:
                if (lowerCase.equals("lr")) {
                    c10 = '}';
                    break;
                }
                break;
            case 3463:
                if (lowerCase.equals("ls")) {
                    c10 = '~';
                    break;
                }
                break;
            case 3464:
                if (lowerCase.equals("lt")) {
                    c10 = 127;
                    break;
                }
                break;
            case 3465:
                if (lowerCase.equals("lu")) {
                    c10 = 128;
                    break;
                }
                break;
            case 3466:
                if (lowerCase.equals("lv")) {
                    c10 = 129;
                    break;
                }
                break;
            case 3469:
                if (lowerCase.equals("ly")) {
                    c10 = 130;
                    break;
                }
                break;
            case 3476:
                if (lowerCase.equals("ma")) {
                    c10 = 131;
                    break;
                }
                break;
            case 3478:
                if (lowerCase.equals("mc")) {
                    c10 = 132;
                    break;
                }
                break;
            case 3479:
                if (lowerCase.equals("md")) {
                    c10 = 133;
                    break;
                }
                break;
            case 3480:
                if (lowerCase.equals("me")) {
                    c10 = 134;
                    break;
                }
                break;
            case 3481:
                if (lowerCase.equals("mf")) {
                    c10 = 135;
                    break;
                }
                break;
            case 3482:
                if (lowerCase.equals("mg")) {
                    c10 = 136;
                    break;
                }
                break;
            case 3483:
                if (lowerCase.equals("mh")) {
                    c10 = 137;
                    break;
                }
                break;
            case 3486:
                if (lowerCase.equals("mk")) {
                    c10 = 138;
                    break;
                }
                break;
            case 3487:
                if (lowerCase.equals("ml")) {
                    c10 = 139;
                    break;
                }
                break;
            case 3488:
                if (lowerCase.equals("mm")) {
                    c10 = 140;
                    break;
                }
                break;
            case 3489:
                if (lowerCase.equals("mn")) {
                    c10 = 141;
                    break;
                }
                break;
            case 3490:
                if (lowerCase.equals("mo")) {
                    c10 = 142;
                    break;
                }
                break;
            case 3491:
                if (lowerCase.equals("mp")) {
                    c10 = 143;
                    break;
                }
                break;
            case 3492:
                if (lowerCase.equals("mq")) {
                    c10 = 144;
                    break;
                }
                break;
            case 3493:
                if (lowerCase.equals("mr")) {
                    c10 = 145;
                    break;
                }
                break;
            case 3494:
                if (lowerCase.equals("ms")) {
                    c10 = 146;
                    break;
                }
                break;
            case 3495:
                if (lowerCase.equals("mt")) {
                    c10 = 147;
                    break;
                }
                break;
            case 3496:
                if (lowerCase.equals("mu")) {
                    c10 = 148;
                    break;
                }
                break;
            case 3497:
                if (lowerCase.equals("mv")) {
                    c10 = 149;
                    break;
                }
                break;
            case 3498:
                if (lowerCase.equals("mw")) {
                    c10 = 150;
                    break;
                }
                break;
            case 3499:
                if (lowerCase.equals("mx")) {
                    c10 = 151;
                    break;
                }
                break;
            case 3500:
                if (lowerCase.equals("my")) {
                    c10 = 152;
                    break;
                }
                break;
            case 3501:
                if (lowerCase.equals("mz")) {
                    c10 = 153;
                    break;
                }
                break;
            case 3507:
                if (lowerCase.equals("na")) {
                    c10 = 154;
                    break;
                }
                break;
            case 3509:
                if (lowerCase.equals("nc")) {
                    c10 = 155;
                    break;
                }
                break;
            case 3511:
                if (lowerCase.equals("ne")) {
                    c10 = 156;
                    break;
                }
                break;
            case 3512:
                if (lowerCase.equals("nf")) {
                    c10 = 157;
                    break;
                }
                break;
            case 3513:
                if (lowerCase.equals("ng")) {
                    c10 = 158;
                    break;
                }
                break;
            case 3515:
                if (lowerCase.equals("ni")) {
                    c10 = 159;
                    break;
                }
                break;
            case 3518:
                if (lowerCase.equals("nl")) {
                    c10 = 160;
                    break;
                }
                break;
            case 3521:
                if (lowerCase.equals("no")) {
                    c10 = 161;
                    break;
                }
                break;
            case 3522:
                if (lowerCase.equals("np")) {
                    c10 = 162;
                    break;
                }
                break;
            case 3524:
                if (lowerCase.equals("nr")) {
                    c10 = 163;
                    break;
                }
                break;
            case 3527:
                if (lowerCase.equals("nu")) {
                    c10 = 164;
                    break;
                }
                break;
            case 3532:
                if (lowerCase.equals("nz")) {
                    c10 = 165;
                    break;
                }
                break;
            case 3550:
                if (lowerCase.equals("om")) {
                    c10 = 166;
                    break;
                }
                break;
            case 3569:
                if (lowerCase.equals("pa")) {
                    c10 = 167;
                    break;
                }
                break;
            case 3573:
                if (lowerCase.equals("pe")) {
                    c10 = 168;
                    break;
                }
                break;
            case 3574:
                if (lowerCase.equals("pf")) {
                    c10 = 169;
                    break;
                }
                break;
            case 3575:
                if (lowerCase.equals("pg")) {
                    c10 = 170;
                    break;
                }
                break;
            case 3576:
                if (lowerCase.equals("ph")) {
                    c10 = 171;
                    break;
                }
                break;
            case 3579:
                if (lowerCase.equals("pk")) {
                    c10 = 172;
                    break;
                }
                break;
            case 3580:
                if (lowerCase.equals("pl")) {
                    c10 = 173;
                    break;
                }
                break;
            case 3581:
                if (lowerCase.equals("pm")) {
                    c10 = 174;
                    break;
                }
                break;
            case 3582:
                if (lowerCase.equals("pn")) {
                    c10 = 175;
                    break;
                }
                break;
            case 3586:
                if (lowerCase.equals("pr")) {
                    c10 = 176;
                    break;
                }
                break;
            case 3587:
                if (lowerCase.equals("ps")) {
                    c10 = 177;
                    break;
                }
                break;
            case 3588:
                if (lowerCase.equals("pt")) {
                    c10 = 178;
                    break;
                }
                break;
            case 3591:
                if (lowerCase.equals("pw")) {
                    c10 = 179;
                    break;
                }
                break;
            case 3593:
                if (lowerCase.equals("py")) {
                    c10 = 180;
                    break;
                }
                break;
            case 3600:
                if (lowerCase.equals("qa")) {
                    c10 = 181;
                    break;
                }
                break;
            case 3635:
                if (lowerCase.equals("re")) {
                    c10 = 182;
                    break;
                }
                break;
            case 3645:
                if (lowerCase.equals("ro")) {
                    c10 = 183;
                    break;
                }
                break;
            case 3649:
                if (lowerCase.equals("rs")) {
                    c10 = 184;
                    break;
                }
                break;
            case 3651:
                if (lowerCase.equals("ru")) {
                    c10 = 185;
                    break;
                }
                break;
            case 3653:
                if (lowerCase.equals("rw")) {
                    c10 = 186;
                    break;
                }
                break;
            case 3662:
                if (lowerCase.equals("sa")) {
                    c10 = 187;
                    break;
                }
                break;
            case 3663:
                if (lowerCase.equals("sb")) {
                    c10 = 188;
                    break;
                }
                break;
            case 3664:
                if (lowerCase.equals("sc")) {
                    c10 = 189;
                    break;
                }
                break;
            case 3665:
                if (lowerCase.equals("sd")) {
                    c10 = 190;
                    break;
                }
                break;
            case 3666:
                if (lowerCase.equals("se")) {
                    c10 = 191;
                    break;
                }
                break;
            case 3668:
                if (lowerCase.equals("sg")) {
                    c10 = 192;
                    break;
                }
                break;
            case 3669:
                if (lowerCase.equals("sh")) {
                    c10 = 193;
                    break;
                }
                break;
            case 3670:
                if (lowerCase.equals("si")) {
                    c10 = 194;
                    break;
                }
                break;
            case 3672:
                if (lowerCase.equals("sk")) {
                    c10 = 195;
                    break;
                }
                break;
            case 3673:
                if (lowerCase.equals("sl")) {
                    c10 = 196;
                    break;
                }
                break;
            case 3674:
                if (lowerCase.equals("sm")) {
                    c10 = 197;
                    break;
                }
                break;
            case 3675:
                if (lowerCase.equals("sn")) {
                    c10 = 198;
                    break;
                }
                break;
            case 3676:
                if (lowerCase.equals("so")) {
                    c10 = 199;
                    break;
                }
                break;
            case 3679:
                if (lowerCase.equals("sr")) {
                    c10 = 200;
                    break;
                }
                break;
            case 3680:
                if (lowerCase.equals("ss")) {
                    c10 = 201;
                    break;
                }
                break;
            case 3681:
                if (lowerCase.equals("st")) {
                    c10 = 202;
                    break;
                }
                break;
            case 3683:
                if (lowerCase.equals("sv")) {
                    c10 = 203;
                    break;
                }
                break;
            case 3685:
                if (lowerCase.equals("sx")) {
                    c10 = 204;
                    break;
                }
                break;
            case 3686:
                if (lowerCase.equals("sy")) {
                    c10 = 205;
                    break;
                }
                break;
            case 3687:
                if (lowerCase.equals("sz")) {
                    c10 = 206;
                    break;
                }
                break;
            case 3695:
                if (lowerCase.equals("tc")) {
                    c10 = 207;
                    break;
                }
                break;
            case 3696:
                if (lowerCase.equals("td")) {
                    c10 = 208;
                    break;
                }
                break;
            case 3699:
                if (lowerCase.equals("tg")) {
                    c10 = 209;
                    break;
                }
                break;
            case 3700:
                if (lowerCase.equals("th")) {
                    c10 = 210;
                    break;
                }
                break;
            case 3702:
                if (lowerCase.equals("tj")) {
                    c10 = 211;
                    break;
                }
                break;
            case 3703:
                if (lowerCase.equals("tk")) {
                    c10 = 212;
                    break;
                }
                break;
            case 3704:
                if (lowerCase.equals("tl")) {
                    c10 = 213;
                    break;
                }
                break;
            case 3705:
                if (lowerCase.equals("tm")) {
                    c10 = 214;
                    break;
                }
                break;
            case 3706:
                if (lowerCase.equals("tn")) {
                    c10 = 215;
                    break;
                }
                break;
            case 3707:
                if (lowerCase.equals("to")) {
                    c10 = 216;
                    break;
                }
                break;
            case 3710:
                if (lowerCase.equals("tr")) {
                    c10 = 217;
                    break;
                }
                break;
            case 3712:
                if (lowerCase.equals("tt")) {
                    c10 = 218;
                    break;
                }
                break;
            case 3714:
                if (lowerCase.equals("tv")) {
                    c10 = 219;
                    break;
                }
                break;
            case 3715:
                if (lowerCase.equals("tw")) {
                    c10 = 220;
                    break;
                }
                break;
            case 3718:
                if (lowerCase.equals("tz")) {
                    c10 = 221;
                    break;
                }
                break;
            case 3724:
                if (lowerCase.equals("ua")) {
                    c10 = 222;
                    break;
                }
                break;
            case 3730:
                if (lowerCase.equals("ug")) {
                    c10 = 223;
                    break;
                }
                break;
            case 3742:
                if (lowerCase.equals("us")) {
                    c10 = 224;
                    break;
                }
                break;
            case 3748:
                if (lowerCase.equals("uy")) {
                    c10 = 225;
                    break;
                }
                break;
            case 3749:
                if (lowerCase.equals("uz")) {
                    c10 = 226;
                    break;
                }
                break;
            case 3755:
                if (lowerCase.equals("va")) {
                    c10 = 227;
                    break;
                }
                break;
            case 3757:
                if (lowerCase.equals("vc")) {
                    c10 = 228;
                    break;
                }
                break;
            case 3759:
                if (lowerCase.equals("ve")) {
                    c10 = 229;
                    break;
                }
                break;
            case 3761:
                if (lowerCase.equals("vg")) {
                    c10 = 230;
                    break;
                }
                break;
            case 3763:
                if (lowerCase.equals("vi")) {
                    c10 = 231;
                    break;
                }
                break;
            case 3768:
                if (lowerCase.equals("vn")) {
                    c10 = 232;
                    break;
                }
                break;
            case 3775:
                if (lowerCase.equals("vu")) {
                    c10 = 233;
                    break;
                }
                break;
            case 3791:
                if (lowerCase.equals("wf")) {
                    c10 = 234;
                    break;
                }
                break;
            case 3804:
                if (lowerCase.equals("ws")) {
                    c10 = 235;
                    break;
                }
                break;
            case 3827:
                if (lowerCase.equals("xk")) {
                    c10 = 236;
                    break;
                }
                break;
            case 3852:
                if (lowerCase.equals("ye")) {
                    c10 = 237;
                    break;
                }
                break;
            case 3867:
                if (lowerCase.equals("yt")) {
                    c10 = 238;
                    break;
                }
                break;
            case 3879:
                if (lowerCase.equals("za")) {
                    c10 = 239;
                    break;
                }
                break;
            case 3891:
                if (lowerCase.equals("zm")) {
                    c10 = 240;
                    break;
                }
                break;
            case 3901:
                if (lowerCase.equals("zw")) {
                    c10 = 241;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return com.theinnerhour.b2b.R.drawable.flag_andorra;
            case 1:
                return com.theinnerhour.b2b.R.drawable.flag_uae;
            case 2:
                return com.theinnerhour.b2b.R.drawable.flag_afghanistan;
            case 3:
                return com.theinnerhour.b2b.R.drawable.flag_antigua_and_barbuda;
            case 4:
                return com.theinnerhour.b2b.R.drawable.flag_anguilla;
            case 5:
                return com.theinnerhour.b2b.R.drawable.flag_albania;
            case 6:
                return com.theinnerhour.b2b.R.drawable.flag_armenia;
            case 7:
                return com.theinnerhour.b2b.R.drawable.flag_angola;
            case '\b':
                return com.theinnerhour.b2b.R.drawable.flag_antarctica;
            case '\t':
                return com.theinnerhour.b2b.R.drawable.flag_argentina;
            case '\n':
                return com.theinnerhour.b2b.R.drawable.flag_american_samoa;
            case 11:
                return com.theinnerhour.b2b.R.drawable.flag_austria;
            case '\f':
                return com.theinnerhour.b2b.R.drawable.flag_australia;
            case '\r':
                return com.theinnerhour.b2b.R.drawable.flag_aruba;
            case 14:
                return com.theinnerhour.b2b.R.drawable.flag_aland;
            case 15:
                return com.theinnerhour.b2b.R.drawable.flag_azerbaijan;
            case 16:
                return com.theinnerhour.b2b.R.drawable.flag_bosnia;
            case 17:
                return com.theinnerhour.b2b.R.drawable.flag_barbados;
            case 18:
                return com.theinnerhour.b2b.R.drawable.flag_bangladesh;
            case 19:
                return com.theinnerhour.b2b.R.drawable.flag_belgium;
            case 20:
                return com.theinnerhour.b2b.R.drawable.flag_burkina_faso;
            case 21:
                return com.theinnerhour.b2b.R.drawable.flag_bulgaria;
            case 22:
                return com.theinnerhour.b2b.R.drawable.flag_bahrain;
            case 23:
                return com.theinnerhour.b2b.R.drawable.flag_burundi;
            case 24:
                return com.theinnerhour.b2b.R.drawable.flag_benin;
            case 25:
                return com.theinnerhour.b2b.R.drawable.flag_saint_barthelemy;
            case 26:
                return com.theinnerhour.b2b.R.drawable.flag_bermuda;
            case 27:
                return com.theinnerhour.b2b.R.drawable.flag_brunei;
            case 28:
                return com.theinnerhour.b2b.R.drawable.flag_bolivia;
            case 29:
                return com.theinnerhour.b2b.R.drawable.flag_brazil;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return com.theinnerhour.b2b.R.drawable.flag_bahamas;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return com.theinnerhour.b2b.R.drawable.flag_bhutan;
            case ' ':
                return com.theinnerhour.b2b.R.drawable.flag_botswana;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return com.theinnerhour.b2b.R.drawable.flag_belarus;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                return com.theinnerhour.b2b.R.drawable.flag_belize;
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                return com.theinnerhour.b2b.R.drawable.flag_canada;
            case '$':
                return com.theinnerhour.b2b.R.drawable.flag_cocos;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return com.theinnerhour.b2b.R.drawable.flag_democratic_republic_of_the_congo;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return com.theinnerhour.b2b.R.drawable.flag_central_african_republic;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return com.theinnerhour.b2b.R.drawable.flag_republic_of_the_congo;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return com.theinnerhour.b2b.R.drawable.flag_switzerland;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return com.theinnerhour.b2b.R.drawable.flag_cote_divoire;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return com.theinnerhour.b2b.R.drawable.flag_cook_islands;
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                return com.theinnerhour.b2b.R.drawable.flag_chile;
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                return com.theinnerhour.b2b.R.drawable.flag_cameroon;
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                return com.theinnerhour.b2b.R.drawable.flag_china;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                return com.theinnerhour.b2b.R.drawable.flag_colombia;
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                return com.theinnerhour.b2b.R.drawable.flag_costa_rica;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                return com.theinnerhour.b2b.R.drawable.flag_cuba;
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                return com.theinnerhour.b2b.R.drawable.flag_cape_verde;
            case '2':
                return com.theinnerhour.b2b.R.drawable.flag_curacao;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                return com.theinnerhour.b2b.R.drawable.flag_christmas_island;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                return com.theinnerhour.b2b.R.drawable.flag_cyprus;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                return com.theinnerhour.b2b.R.drawable.flag_czech_republic;
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                return com.theinnerhour.b2b.R.drawable.flag_germany;
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                return com.theinnerhour.b2b.R.drawable.flag_djibouti;
            case R.styleable.AppCompatTheme_colorError /* 56 */:
                return com.theinnerhour.b2b.R.drawable.flag_denmark;
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                return com.theinnerhour.b2b.R.drawable.flag_dominica;
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                return com.theinnerhour.b2b.R.drawable.flag_dominican_republic;
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                return com.theinnerhour.b2b.R.drawable.flag_algeria;
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                return com.theinnerhour.b2b.R.drawable.flag_ecuador;
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                return com.theinnerhour.b2b.R.drawable.flag_estonia;
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                return com.theinnerhour.b2b.R.drawable.flag_egypt;
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                return com.theinnerhour.b2b.R.drawable.flag_eritrea;
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                return com.theinnerhour.b2b.R.drawable.flag_spain;
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                return com.theinnerhour.b2b.R.drawable.flag_ethiopia;
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                return com.theinnerhour.b2b.R.drawable.flag_finland;
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                return com.theinnerhour.b2b.R.drawable.flag_fiji;
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                return com.theinnerhour.b2b.R.drawable.flag_falkland_islands;
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                return com.theinnerhour.b2b.R.drawable.flag_micronesia;
            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                return com.theinnerhour.b2b.R.drawable.flag_faroe_islands;
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                return com.theinnerhour.b2b.R.drawable.flag_france;
            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                return com.theinnerhour.b2b.R.drawable.flag_gabon;
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                return com.theinnerhour.b2b.R.drawable.flag_united_kingdom;
            case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                return com.theinnerhour.b2b.R.drawable.flag_grenada;
            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                return com.theinnerhour.b2b.R.drawable.flag_georgia;
            case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                return com.theinnerhour.b2b.R.drawable.flag_guyane;
            case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                return com.theinnerhour.b2b.R.drawable.flag_guernsey;
            case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                return com.theinnerhour.b2b.R.drawable.flag_ghana;
            case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                return com.theinnerhour.b2b.R.drawable.flag_gibraltar;
            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                return com.theinnerhour.b2b.R.drawable.flag_greenland;
            case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                return com.theinnerhour.b2b.R.drawable.flag_gambia;
            case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                return com.theinnerhour.b2b.R.drawable.flag_guinea;
            case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                return com.theinnerhour.b2b.R.drawable.flag_guadeloupe;
            case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                return com.theinnerhour.b2b.R.drawable.flag_equatorial_guinea;
            case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                return com.theinnerhour.b2b.R.drawable.flag_greece;
            case 'V':
                return com.theinnerhour.b2b.R.drawable.flag_guatemala;
            case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                return com.theinnerhour.b2b.R.drawable.flag_guam;
            case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                return com.theinnerhour.b2b.R.drawable.flag_guinea_bissau;
            case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                return com.theinnerhour.b2b.R.drawable.flag_guyana;
            case 'Z':
                return com.theinnerhour.b2b.R.drawable.flag_hong_kong;
            case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                return com.theinnerhour.b2b.R.drawable.flag_honduras;
            case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                return com.theinnerhour.b2b.R.drawable.flag_croatia;
            case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                return com.theinnerhour.b2b.R.drawable.flag_haiti;
            case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                return com.theinnerhour.b2b.R.drawable.flag_hungary;
            case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                return com.theinnerhour.b2b.R.drawable.flag_indonesia;
            case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                return com.theinnerhour.b2b.R.drawable.flag_ireland;
            case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                return com.theinnerhour.b2b.R.drawable.flag_israel;
            case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                return com.theinnerhour.b2b.R.drawable.flag_isleof_man;
            case 'c':
                return com.theinnerhour.b2b.R.drawable.flag_india;
            case 'd':
                return com.theinnerhour.b2b.R.drawable.flag_british_indian_ocean_territory;
            case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                return com.theinnerhour.b2b.R.drawable.flag_iraq_new;
            case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
                return com.theinnerhour.b2b.R.drawable.flag_iran;
            case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                return com.theinnerhour.b2b.R.drawable.flag_iceland;
            case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                return com.theinnerhour.b2b.R.drawable.flag_italy;
            case R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 105 */:
                return com.theinnerhour.b2b.R.drawable.flag_jersey;
            case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                return com.theinnerhour.b2b.R.drawable.flag_jamaica;
            case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                return com.theinnerhour.b2b.R.drawable.flag_jordan;
            case R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
                return com.theinnerhour.b2b.R.drawable.flag_japan;
            case R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
                return com.theinnerhour.b2b.R.drawable.flag_kenya;
            case R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 110 */:
                return com.theinnerhour.b2b.R.drawable.flag_kyrgyzstan;
            case R.styleable.AppCompatTheme_textColorSearchUrl /* 111 */:
                return com.theinnerhour.b2b.R.drawable.flag_cambodia;
            case R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 112 */:
                return com.theinnerhour.b2b.R.drawable.flag_kiribati;
            case R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
                return com.theinnerhour.b2b.R.drawable.flag_comoros;
            case R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
                return com.theinnerhour.b2b.R.drawable.flag_saint_kitts_and_nevis;
            case R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                return com.theinnerhour.b2b.R.drawable.flag_north_korea;
            case R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
                return com.theinnerhour.b2b.R.drawable.flag_south_korea;
            case R.styleable.AppCompatTheme_windowActionBar /* 117 */:
                return com.theinnerhour.b2b.R.drawable.flag_kuwait;
            case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                return com.theinnerhour.b2b.R.drawable.flag_cayman_islands;
            case R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                return com.theinnerhour.b2b.R.drawable.flag_kazakhstan;
            case R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                return com.theinnerhour.b2b.R.drawable.flag_laos;
            case R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
                return com.theinnerhour.b2b.R.drawable.flag_lebanon;
            case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                return com.theinnerhour.b2b.R.drawable.flag_saint_lucia;
            case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                return com.theinnerhour.b2b.R.drawable.flag_liechtenstein;
            case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                return com.theinnerhour.b2b.R.drawable.flag_sri_lanka;
            case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                return com.theinnerhour.b2b.R.drawable.flag_liberia;
            case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                return com.theinnerhour.b2b.R.drawable.flag_lesotho;
            case 127:
                return com.theinnerhour.b2b.R.drawable.flag_lithuania;
            case 128:
                return com.theinnerhour.b2b.R.drawable.flag_luxembourg;
            case 129:
                return com.theinnerhour.b2b.R.drawable.flag_latvia;
            case 130:
                return com.theinnerhour.b2b.R.drawable.flag_libya;
            case 131:
                return com.theinnerhour.b2b.R.drawable.flag_morocco;
            case 132:
                return com.theinnerhour.b2b.R.drawable.flag_monaco;
            case 133:
                return com.theinnerhour.b2b.R.drawable.flag_moldova;
            case 134:
                return com.theinnerhour.b2b.R.drawable.flag_of_montenegro;
            case 135:
                return com.theinnerhour.b2b.R.drawable.flag_saint_martin;
            case 136:
                return com.theinnerhour.b2b.R.drawable.flag_madagascar;
            case 137:
                return com.theinnerhour.b2b.R.drawable.flag_marshall_islands;
            case 138:
                return com.theinnerhour.b2b.R.drawable.flag_macedonia;
            case 139:
                return com.theinnerhour.b2b.R.drawable.flag_mali;
            case 140:
                return com.theinnerhour.b2b.R.drawable.flag_myanmar;
            case 141:
                return com.theinnerhour.b2b.R.drawable.flag_mongolia;
            case 142:
                return com.theinnerhour.b2b.R.drawable.flag_macao;
            case 143:
                return com.theinnerhour.b2b.R.drawable.flag_northern_mariana_islands;
            case 144:
                return com.theinnerhour.b2b.R.drawable.flag_martinique;
            case 145:
                return com.theinnerhour.b2b.R.drawable.flag_mauritania;
            case 146:
                return com.theinnerhour.b2b.R.drawable.flag_montserrat;
            case 147:
                return com.theinnerhour.b2b.R.drawable.flag_malta;
            case 148:
                return com.theinnerhour.b2b.R.drawable.flag_mauritius;
            case 149:
                return com.theinnerhour.b2b.R.drawable.flag_maldives;
            case 150:
                return com.theinnerhour.b2b.R.drawable.flag_malawi;
            case 151:
                return com.theinnerhour.b2b.R.drawable.flag_mexico;
            case 152:
                return com.theinnerhour.b2b.R.drawable.flag_malaysia;
            case 153:
                return com.theinnerhour.b2b.R.drawable.flag_mozambique;
            case 154:
                return com.theinnerhour.b2b.R.drawable.flag_namibia;
            case 155:
                return com.theinnerhour.b2b.R.drawable.flag_new_caledonia;
            case 156:
                return com.theinnerhour.b2b.R.drawable.flag_niger;
            case 157:
                return com.theinnerhour.b2b.R.drawable.flag_norfolk_island;
            case 158:
                return com.theinnerhour.b2b.R.drawable.flag_nigeria;
            case 159:
                return com.theinnerhour.b2b.R.drawable.flag_nicaragua;
            case 160:
                return com.theinnerhour.b2b.R.drawable.flag_netherlands;
            case 161:
                return com.theinnerhour.b2b.R.drawable.flag_norway;
            case 162:
                return com.theinnerhour.b2b.R.drawable.flag_nepal;
            case 163:
                return com.theinnerhour.b2b.R.drawable.flag_nauru;
            case 164:
                return com.theinnerhour.b2b.R.drawable.flag_niue;
            case 165:
                return com.theinnerhour.b2b.R.drawable.flag_new_zealand;
            case 166:
                return com.theinnerhour.b2b.R.drawable.flag_oman;
            case 167:
                return com.theinnerhour.b2b.R.drawable.flag_panama;
            case 168:
                return com.theinnerhour.b2b.R.drawable.flag_peru;
            case 169:
                return com.theinnerhour.b2b.R.drawable.flag_french_polynesia;
            case 170:
                return com.theinnerhour.b2b.R.drawable.flag_papua_new_guinea;
            case 171:
                return com.theinnerhour.b2b.R.drawable.flag_philippines;
            case 172:
                return com.theinnerhour.b2b.R.drawable.flag_pakistan;
            case 173:
                return com.theinnerhour.b2b.R.drawable.flag_poland;
            case 174:
                return com.theinnerhour.b2b.R.drawable.flag_saint_pierre;
            case 175:
                return com.theinnerhour.b2b.R.drawable.flag_pitcairn_islands;
            case 176:
                return com.theinnerhour.b2b.R.drawable.flag_puerto_rico;
            case 177:
                return com.theinnerhour.b2b.R.drawable.flag_palestine;
            case 178:
                return com.theinnerhour.b2b.R.drawable.flag_portugal;
            case 179:
                return com.theinnerhour.b2b.R.drawable.flag_palau;
            case SubsamplingScaleImageView.ORIENTATION_180 /* 180 */:
                return com.theinnerhour.b2b.R.drawable.flag_paraguay;
            case 181:
                return com.theinnerhour.b2b.R.drawable.flag_qatar;
            case 182:
                return com.theinnerhour.b2b.R.drawable.flag_martinique;
            case 183:
                return com.theinnerhour.b2b.R.drawable.flag_romania;
            case 184:
                return com.theinnerhour.b2b.R.drawable.flag_serbia;
            case 185:
                return com.theinnerhour.b2b.R.drawable.flag_russian_federation;
            case 186:
                return com.theinnerhour.b2b.R.drawable.flag_rwanda;
            case 187:
                return com.theinnerhour.b2b.R.drawable.flag_saudi_arabia;
            case 188:
                return com.theinnerhour.b2b.R.drawable.flag_soloman_islands;
            case 189:
                return com.theinnerhour.b2b.R.drawable.flag_seychelles;
            case 190:
                return com.theinnerhour.b2b.R.drawable.flag_sudan;
            case 191:
                return com.theinnerhour.b2b.R.drawable.flag_sweden;
            case 192:
                return com.theinnerhour.b2b.R.drawable.flag_singapore;
            case 193:
                return com.theinnerhour.b2b.R.drawable.flag_saint_helena;
            case 194:
                return com.theinnerhour.b2b.R.drawable.flag_slovenia;
            case 195:
                return com.theinnerhour.b2b.R.drawable.flag_slovakia;
            case 196:
                return com.theinnerhour.b2b.R.drawable.flag_sierra_leone;
            case 197:
                return com.theinnerhour.b2b.R.drawable.flag_san_marino;
            case 198:
                return com.theinnerhour.b2b.R.drawable.flag_senegal;
            case 199:
                return com.theinnerhour.b2b.R.drawable.flag_somalia;
            case k.d.DEFAULT_DRAG_ANIMATION_DURATION /* 200 */:
                return com.theinnerhour.b2b.R.drawable.flag_suriname;
            case 201:
                return com.theinnerhour.b2b.R.drawable.flag_south_sudan;
            case 202:
                return com.theinnerhour.b2b.R.drawable.flag_sao_tome_and_principe;
            case 203:
                return com.theinnerhour.b2b.R.drawable.flag_el_salvador;
            case 204:
                return com.theinnerhour.b2b.R.drawable.flag_sint_maarten;
            case 205:
                return com.theinnerhour.b2b.R.drawable.flag_syria;
            case 206:
                return com.theinnerhour.b2b.R.drawable.flag_swaziland;
            case 207:
                return com.theinnerhour.b2b.R.drawable.flag_turks_and_caicos_islands;
            case 208:
                return com.theinnerhour.b2b.R.drawable.flag_chad;
            case 209:
                return com.theinnerhour.b2b.R.drawable.flag_togo;
            case 210:
                return com.theinnerhour.b2b.R.drawable.flag_thailand;
            case 211:
                return com.theinnerhour.b2b.R.drawable.flag_tajikistan;
            case 212:
                return com.theinnerhour.b2b.R.drawable.flag_tokelau;
            case 213:
                return com.theinnerhour.b2b.R.drawable.flag_timor_leste;
            case 214:
                return com.theinnerhour.b2b.R.drawable.flag_turkmenistan;
            case 215:
                return com.theinnerhour.b2b.R.drawable.flag_tunisia;
            case 216:
                return com.theinnerhour.b2b.R.drawable.flag_tonga;
            case 217:
                return com.theinnerhour.b2b.R.drawable.flag_turkey;
            case 218:
                return com.theinnerhour.b2b.R.drawable.flag_trinidad_and_tobago;
            case 219:
                return com.theinnerhour.b2b.R.drawable.flag_tuvalu;
            case 220:
                return com.theinnerhour.b2b.R.drawable.flag_taiwan;
            case 221:
                return com.theinnerhour.b2b.R.drawable.flag_tanzania;
            case 222:
                return com.theinnerhour.b2b.R.drawable.flag_ukraine;
            case 223:
                return com.theinnerhour.b2b.R.drawable.flag_uganda;
            case 224:
                return com.theinnerhour.b2b.R.drawable.flag_united_states_of_america;
            case 225:
                return com.theinnerhour.b2b.R.drawable.flag_uruguay;
            case 226:
                return com.theinnerhour.b2b.R.drawable.flag_uzbekistan;
            case 227:
                return com.theinnerhour.b2b.R.drawable.flag_vatican_city;
            case 228:
                return com.theinnerhour.b2b.R.drawable.flag_saint_vicent_and_the_grenadines;
            case 229:
                return com.theinnerhour.b2b.R.drawable.flag_venezuela;
            case 230:
                return com.theinnerhour.b2b.R.drawable.flag_british_virgin_islands;
            case 231:
                return com.theinnerhour.b2b.R.drawable.flag_us_virgin_islands;
            case 232:
                return com.theinnerhour.b2b.R.drawable.flag_vietnam;
            case 233:
                return com.theinnerhour.b2b.R.drawable.flag_vanuatu;
            case 234:
                return com.theinnerhour.b2b.R.drawable.flag_wallis_and_futuna;
            case 235:
                return com.theinnerhour.b2b.R.drawable.flag_samoa;
            case 236:
                return com.theinnerhour.b2b.R.drawable.flag_kosovo;
            case 237:
                return com.theinnerhour.b2b.R.drawable.flag_yemen;
            case 238:
                return com.theinnerhour.b2b.R.drawable.flag_martinique;
            case 239:
                return com.theinnerhour.b2b.R.drawable.flag_south_africa;
            case 240:
                return com.theinnerhour.b2b.R.drawable.flag_zambia;
            case 241:
                return com.theinnerhour.b2b.R.drawable.flag_zimbabwe;
            default:
                return com.theinnerhour.b2b.R.drawable.flag_transparent;
        }
    }

    public static ArrayList p() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("ad", "376", "Andorra"));
        arrayList.add(new a("ae", "971", "United Arab Emirates (UAE)"));
        arrayList.add(new a("af", "93", "Afghanistan"));
        arrayList.add(new a("ag", "1", "Antigua and Barbuda"));
        arrayList.add(new a("ai", "1", "Anguilla"));
        arrayList.add(new a("al", "355", "Albania"));
        arrayList.add(new a("am", "374", "Armenia"));
        arrayList.add(new a("ao", "244", "Angola"));
        arrayList.add(new a("aq", "672", "Antarctica"));
        arrayList.add(new a("ar", "54", "Argentina"));
        arrayList.add(new a("as", "1", "American Samoa"));
        arrayList.add(new a("at", "43", "Austria"));
        arrayList.add(new a("au", "61", "Australia"));
        arrayList.add(new a("aw", "297", "Aruba"));
        arrayList.add(new a("ax", "358", "Åland Islands"));
        arrayList.add(new a("az", "994", "Azerbaijan"));
        arrayList.add(new a("ba", "387", "Bosnia And Herzegovina"));
        arrayList.add(new a("bb", "1", "Barbados"));
        arrayList.add(new a("bd", "880", "Bangladesh"));
        arrayList.add(new a("be", "32", "Belgium"));
        arrayList.add(new a("bf", "226", "Burkina Faso"));
        arrayList.add(new a("bg", "359", "Bulgaria"));
        arrayList.add(new a("bh", "973", "Bahrain"));
        arrayList.add(new a("bi", "257", "Burundi"));
        arrayList.add(new a("bj", "229", "Benin"));
        arrayList.add(new a("bl", "590", "Saint Barthélemy"));
        arrayList.add(new a("bm", "1", "Bermuda"));
        arrayList.add(new a("bn", "673", "Brunei Darussalam"));
        arrayList.add(new a("bo", "591", "Bolivia, Plurinational State Of"));
        arrayList.add(new a("br", "55", "Brazil"));
        arrayList.add(new a("bs", "1", "Bahamas"));
        arrayList.add(new a("bt", "975", "Bhutan"));
        arrayList.add(new a("bw", "267", "Botswana"));
        arrayList.add(new a("by", "375", "Belarus"));
        arrayList.add(new a("bz", "501", "Belize"));
        arrayList.add(new a("ca", "1", "Canada"));
        arrayList.add(new a("cc", "61", "Cocos (keeling) Islands"));
        arrayList.add(new a("cd", "243", "Congo, The Democratic Republic Of The"));
        arrayList.add(new a("cf", "236", "Central African Republic"));
        arrayList.add(new a("cg", "242", "Congo"));
        arrayList.add(new a("ch", "41", "Switzerland"));
        arrayList.add(new a("ci", "225", "Côte D'ivoire"));
        arrayList.add(new a("ck", "682", "Cook Islands"));
        arrayList.add(new a("cl", "56", "Chile"));
        arrayList.add(new a("cm", "237", "Cameroon"));
        arrayList.add(new a("cn", "86", "China"));
        arrayList.add(new a("co", "57", "Colombia"));
        arrayList.add(new a("cr", "506", "Costa Rica"));
        arrayList.add(new a("cu", "53", "Cuba"));
        arrayList.add(new a("cv", "238", "Cape Verde"));
        arrayList.add(new a("cw", "599", "Curaçao"));
        arrayList.add(new a("cx", "61", "Christmas Island"));
        arrayList.add(new a("cy", "357", "Cyprus"));
        arrayList.add(new a("cz", "420", "Czech Republic"));
        arrayList.add(new a("de", "49", "Germany"));
        arrayList.add(new a("dj", "253", "Djibouti"));
        arrayList.add(new a("dk", "45", "Denmark"));
        arrayList.add(new a("dm", "1", "Dominica"));
        arrayList.add(new a("do", "1", "Dominican Republic"));
        arrayList.add(new a("dz", "213", "Algeria"));
        arrayList.add(new a("ec", "593", "Ecuador"));
        arrayList.add(new a("ee", "372", "Estonia"));
        arrayList.add(new a("eg", "20", "Egypt"));
        arrayList.add(new a("er", "291", "Eritrea"));
        arrayList.add(new a("es", "34", "Spain"));
        arrayList.add(new a("et", "251", "Ethiopia"));
        arrayList.add(new a("fi", "358", "Finland"));
        arrayList.add(new a("fj", "679", "Fiji"));
        arrayList.add(new a("fk", "500", "Falkland Islands (malvinas)"));
        arrayList.add(new a("fm", "691", "Micronesia, Federated States Of"));
        arrayList.add(new a("fo", "298", "Faroe Islands"));
        arrayList.add(new a("fr", "33", "France"));
        arrayList.add(new a("ga", "241", "Gabon"));
        arrayList.add(new a("gb", "44", "United Kingdom"));
        arrayList.add(new a("gd", "1", "Grenada"));
        arrayList.add(new a("ge", "995", "Georgia"));
        arrayList.add(new a("gf", "594", "French Guyana"));
        arrayList.add(new a("gh", "233", "Ghana"));
        arrayList.add(new a("gi", "350", "Gibraltar"));
        arrayList.add(new a("gl", "299", "Greenland"));
        arrayList.add(new a("gm", "220", "Gambia"));
        arrayList.add(new a("gn", "224", "Guinea"));
        arrayList.add(new a("gp", "450", "Guadeloupe"));
        arrayList.add(new a("gq", "240", "Equatorial Guinea"));
        arrayList.add(new a("gr", "30", "Greece"));
        arrayList.add(new a("gt", "502", "Guatemala"));
        arrayList.add(new a("gu", "1", "Guam"));
        arrayList.add(new a("gw", "245", "Guinea-bissau"));
        arrayList.add(new a("gy", "592", "Guyana"));
        arrayList.add(new a("hk", "852", "Hong Kong"));
        arrayList.add(new a("hn", "504", "Honduras"));
        arrayList.add(new a("hr", "385", "Croatia"));
        arrayList.add(new a("ht", "509", "Haiti"));
        arrayList.add(new a("hu", "36", "Hungary"));
        arrayList.add(new a("id", "62", "Indonesia"));
        arrayList.add(new a("ie", "353", "Ireland"));
        arrayList.add(new a("il", "972", "Israel"));
        arrayList.add(new a("im", "44", "Isle Of Man"));
        arrayList.add(new a("is", "354", "Iceland"));
        arrayList.add(new a("in", "91", "India"));
        arrayList.add(new a("io", "246", "British Indian Ocean Territory"));
        arrayList.add(new a("iq", "964", "Iraq"));
        arrayList.add(new a("ir", "98", "Iran, Islamic Republic Of"));
        arrayList.add(new a("it", "39", "Italy"));
        arrayList.add(new a("je", "44", "Jersey "));
        arrayList.add(new a("jm", "1", "Jamaica"));
        arrayList.add(new a("jo", "962", "Jordan"));
        arrayList.add(new a("jp", "81", "Japan"));
        arrayList.add(new a("ke", "254", "Kenya"));
        arrayList.add(new a("kg", "996", "Kyrgyzstan"));
        arrayList.add(new a("kh", "855", "Cambodia"));
        arrayList.add(new a("ki", "686", "Kiribati"));
        arrayList.add(new a("km", "269", "Comoros"));
        arrayList.add(new a("kn", "1", "Saint Kitts and Nevis"));
        arrayList.add(new a("kp", "850", "North Korea"));
        arrayList.add(new a("kr", "82", "South Korea"));
        arrayList.add(new a("kw", "965", "Kuwait"));
        arrayList.add(new a("ky", "1", "Cayman Islands"));
        arrayList.add(new a("kz", "7", "Kazakhstan"));
        arrayList.add(new a("la", "856", "Lao People's Democratic Republic"));
        arrayList.add(new a("lb", "961", "Lebanon"));
        arrayList.add(new a("lc", "1", "Saint Lucia"));
        arrayList.add(new a("li", "423", "Liechtenstein"));
        arrayList.add(new a("lk", "94", "Sri Lanka"));
        arrayList.add(new a("lr", "231", "Liberia"));
        arrayList.add(new a("ls", "266", "Lesotho"));
        arrayList.add(new a("lt", "370", "Lithuania"));
        arrayList.add(new a("lu", "352", "Luxembourg"));
        arrayList.add(new a("lv", "371", "Latvia"));
        arrayList.add(new a("ly", "218", "Libya"));
        arrayList.add(new a("ma", "212", "Morocco"));
        arrayList.add(new a("mc", "377", "Monaco"));
        arrayList.add(new a("md", "373", "Moldova, Republic Of"));
        arrayList.add(new a("me", "382", "Montenegro"));
        arrayList.add(new a("mf", "590", "Saint Martin"));
        arrayList.add(new a("mg", "261", "Madagascar"));
        arrayList.add(new a("mh", "692", "Marshall Islands"));
        arrayList.add(new a("mk", "389", "Macedonia (FYROM)"));
        arrayList.add(new a("ml", "223", "Mali"));
        arrayList.add(new a("mm", "95", "Myanmar"));
        arrayList.add(new a("mn", "976", "Mongolia"));
        arrayList.add(new a("mo", "853", "Macau"));
        arrayList.add(new a("mp", "1", "Northern Mariana Islands"));
        arrayList.add(new a("mq", "596", "Martinique"));
        arrayList.add(new a("mr", "222", "Mauritania"));
        arrayList.add(new a("ms", "1", "Montserrat"));
        arrayList.add(new a("mt", "356", "Malta"));
        arrayList.add(new a("mu", "230", "Mauritius"));
        arrayList.add(new a("mv", "960", "Maldives"));
        arrayList.add(new a("mw", "265", "Malawi"));
        arrayList.add(new a("mx", "52", "Mexico"));
        arrayList.add(new a("my", "60", "Malaysia"));
        arrayList.add(new a("mz", "258", "Mozambique"));
        arrayList.add(new a("na", "264", "Namibia"));
        arrayList.add(new a("nc", "687", "New Caledonia"));
        arrayList.add(new a("ne", "227", "Niger"));
        arrayList.add(new a("nf", "672", "Norfolk Islands"));
        arrayList.add(new a("ng", "234", "Nigeria"));
        arrayList.add(new a("ni", "505", "Nicaragua"));
        arrayList.add(new a("nl", "31", "Netherlands"));
        arrayList.add(new a("no", "47", "Norway"));
        arrayList.add(new a("np", "977", "Nepal"));
        arrayList.add(new a("nr", "674", "Nauru"));
        arrayList.add(new a("nu", "683", "Niue"));
        arrayList.add(new a("nz", "64", "New Zealand"));
        arrayList.add(new a("om", "968", "Oman"));
        arrayList.add(new a("pa", "507", "Panama"));
        arrayList.add(new a("pe", "51", "Peru"));
        arrayList.add(new a("pf", "689", "French Polynesia"));
        arrayList.add(new a("pg", "675", "Papua New Guinea"));
        arrayList.add(new a("ph", "63", "Philippines"));
        arrayList.add(new a("pk", "92", "Pakistan"));
        arrayList.add(new a("pl", "48", "Poland"));
        arrayList.add(new a("pm", "508", "Saint Pierre And Miquelon"));
        arrayList.add(new a("pn", "870", "Pitcairn Islands"));
        arrayList.add(new a("pr", "1", "Puerto Rico"));
        arrayList.add(new a("ps", "970", "Palestine"));
        arrayList.add(new a("pt", "351", "Portugal"));
        arrayList.add(new a("pw", "680", "Palau"));
        arrayList.add(new a("py", "595", "Paraguay"));
        arrayList.add(new a("qa", "974", "Qatar"));
        arrayList.add(new a("re", "262", "Réunion"));
        arrayList.add(new a("ro", "40", "Romania"));
        arrayList.add(new a("rs", "381", "Serbia"));
        arrayList.add(new a("ru", "7", "Russian Federation"));
        arrayList.add(new a("rw", "250", "Rwanda"));
        arrayList.add(new a("sa", "966", "Saudi Arabia"));
        arrayList.add(new a("sb", "677", "Solomon Islands"));
        arrayList.add(new a("sc", "248", "Seychelles"));
        arrayList.add(new a("sd", "249", "Sudan"));
        arrayList.add(new a("se", "46", "Sweden"));
        arrayList.add(new a("sg", "65", "Singapore"));
        arrayList.add(new a("sh", "290", "Saint Helena, Ascension And Tristan Da Cunha"));
        arrayList.add(new a("si", "386", "Slovenia"));
        arrayList.add(new a("sk", "421", "Slovakia"));
        arrayList.add(new a("sl", "232", "Sierra Leone"));
        arrayList.add(new a("sm", "378", "San Marino"));
        arrayList.add(new a("sn", "221", "Senegal"));
        arrayList.add(new a("so", "252", "Somalia"));
        arrayList.add(new a("sr", "597", "Suriname"));
        arrayList.add(new a("ss", "211", "South Sudan"));
        arrayList.add(new a("st", "239", "Sao Tome And Principe"));
        arrayList.add(new a("sv", "503", "El Salvador"));
        arrayList.add(new a("sx", "1", "Sint Maarten"));
        arrayList.add(new a("sy", "963", "Syrian Arab Republic"));
        arrayList.add(new a("sz", "268", "Swaziland"));
        arrayList.add(new a("tc", "1", "Turks and Caicos Islands"));
        arrayList.add(new a("td", "235", "Chad"));
        arrayList.add(new a("tg", "228", "Togo"));
        arrayList.add(new a("th", "66", "Thailand"));
        arrayList.add(new a("tj", "992", "Tajikistan"));
        arrayList.add(new a("tk", "690", "Tokelau"));
        arrayList.add(new a("tl", "670", "Timor-leste"));
        arrayList.add(new a("tm", "993", "Turkmenistan"));
        arrayList.add(new a("tn", "216", "Tunisia"));
        arrayList.add(new a("to", "676", "Tonga"));
        arrayList.add(new a("tr", "90", "Turkey"));
        arrayList.add(new a("tt", "1", "Trinidad &amp; Tobago"));
        arrayList.add(new a("tv", "688", "Tuvalu"));
        arrayList.add(new a("tw", "886", "Taiwan"));
        arrayList.add(new a("tz", "255", "Tanzania, United Republic Of"));
        arrayList.add(new a("ua", "380", "Ukraine"));
        arrayList.add(new a("ug", "256", "Uganda"));
        arrayList.add(new a("us", "1", "United States"));
        arrayList.add(new a("uy", "598", "Uruguay"));
        arrayList.add(new a("uz", "998", "Uzbekistan"));
        arrayList.add(new a("va", "379", "Holy See (vatican City State)"));
        arrayList.add(new a("vc", "1", "Saint Vincent &amp; The Grenadines"));
        arrayList.add(new a("ve", "58", "Venezuela, Bolivarian Republic Of"));
        arrayList.add(new a("vg", "1", "British Virgin Islands"));
        arrayList.add(new a("vi", "1", "US Virgin Islands"));
        arrayList.add(new a("vn", "84", "Vietnam"));
        arrayList.add(new a("vu", "678", "Vanuatu"));
        arrayList.add(new a("wf", "681", "Wallis And Futuna"));
        arrayList.add(new a("ws", "685", "Samoa"));
        arrayList.add(new a("xk", "383", "Kosovo"));
        arrayList.add(new a("ye", "967", "Yemen"));
        arrayList.add(new a("yt", "262", "Mayotte"));
        arrayList.add(new a("za", "27", "South Africa"));
        arrayList.add(new a("zm", "260", "Zambia"));
        arrayList.add(new a("zw", "263", "Zimbabwe"));
        return arrayList;
    }

    public static ArrayList r(Context context, CountryCodePicker.g gVar) {
        ArrayList arrayList;
        CountryCodePicker.g gVar2 = f10141z;
        if (gVar2 == null || gVar != gVar2 || (arrayList = D) == null || arrayList.size() == 0) {
            u(context, gVar);
        }
        return D;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void u(Context context, CountryCodePicker.g gVar) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        String str3 = "";
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            Resources resources = context.getResources();
            Resources resources2 = context.getResources();
            newPullParser.setInput(resources.openRawResource(resources2.getIdentifier("ccp_" + gVar.toString().toLowerCase(Locale.ROOT), "raw", context.getPackageName())), "UTF-8");
            str = "";
            str2 = str;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                try {
                    String name = newPullParser.getName();
                    if (eventType == 3) {
                        if (name.equals("country")) {
                            a aVar = new a();
                            aVar.f10142u = newPullParser.getAttributeValue(null, "name_code").toUpperCase(Locale.US);
                            aVar.f10143v = newPullParser.getAttributeValue(null, "phone_code");
                            aVar.f10145x = newPullParser.getAttributeValue(null, "english_name");
                            aVar.f10144w = newPullParser.getAttributeValue(null, SessionManager.KEY_NAME);
                            arrayList.add(aVar);
                        } else if (name.equals("ccp_dialog_title")) {
                            str = newPullParser.getAttributeValue(null, "translation");
                        } else if (name.equals("ccp_dialog_search_hint_message")) {
                            str3 = newPullParser.getAttributeValue(null, "translation");
                        } else if (name.equals("ccp_dialog_no_result_ack_message")) {
                            str2 = newPullParser.getAttributeValue(null, "translation");
                        }
                    }
                } catch (IOException e10) {
                    e = e10;
                    e.printStackTrace();
                    if (arrayList.size() == 0) {
                    }
                    if (str.length() <= 0) {
                    }
                    A = str;
                    if (str3.length() <= 0) {
                    }
                    B = str3;
                    if (str2.length() <= 0) {
                    }
                    C = str2;
                    D = arrayList;
                    Collections.sort(arrayList);
                } catch (XmlPullParserException e11) {
                    e = e11;
                    e.printStackTrace();
                    if (arrayList.size() == 0) {
                    }
                    if (str.length() <= 0) {
                    }
                    A = str;
                    if (str3.length() <= 0) {
                    }
                    B = str3;
                    if (str2.length() <= 0) {
                    }
                    C = str2;
                    D = arrayList;
                    Collections.sort(arrayList);
                } catch (Exception e12) {
                    e = e12;
                    e.printStackTrace();
                    if (arrayList.size() == 0) {
                    }
                    if (str.length() <= 0) {
                    }
                    A = str;
                    if (str3.length() <= 0) {
                    }
                    B = str3;
                    if (str2.length() <= 0) {
                    }
                    C = str2;
                    D = arrayList;
                    Collections.sort(arrayList);
                }
            }
            f10141z = gVar;
        } catch (IOException e13) {
            e = e13;
            str = "";
            str2 = str;
        } catch (XmlPullParserException e14) {
            e = e14;
            str = "";
            str2 = str;
        } catch (Exception e15) {
            e = e15;
            str = "";
            str2 = str;
        }
        if (arrayList.size() == 0) {
            f10141z = CountryCodePicker.g.ENGLISH;
            arrayList = p();
        }
        if (str.length() <= 0) {
            str = "Select a country";
        }
        A = str;
        if (str3.length() <= 0) {
            str3 = "Search...";
        }
        B = str3;
        if (str2.length() <= 0) {
            str2 = "Results not found";
        }
        C = str2;
        D = arrayList;
        Collections.sort(arrayList);
    }

    @Override // java.lang.Comparable
    public final int compareTo(a aVar) {
        return Collator.getInstance().compare(this.f10144w, aVar.f10144w);
    }

    public final boolean t(String str) {
        String lowerCase = str.toLowerCase();
        if (!d("Name", this.f10144w, lowerCase) && !d("NameCode", this.f10142u, lowerCase) && !d("PhoneCode", this.f10143v, lowerCase) && !d("EnglishName", this.f10145x, lowerCase)) {
            return false;
        }
        return true;
    }

    public final void v() {
        try {
            Log.d("Class Country", "Country->" + this.f10142u + ":" + this.f10143v + ":" + this.f10144w);
        } catch (NullPointerException unused) {
            Log.d("Class Country", "Null");
        }
    }

    public a(String str, String str2, String str3) {
        this.f10146y = -99;
        this.f10142u = str.toUpperCase(Locale.US);
        this.f10143v = str2;
        this.f10144w = str3;
        this.f10146y = -99;
    }
}
