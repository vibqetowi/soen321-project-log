package b9;

import android.content.Context;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.recyclerview.widget.k;
import b9.b;
import c9.n;
import c9.w;
import com.appsflyer.R;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.common.collect.l0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: DefaultBandwidthMeter.java */
/* loaded from: classes.dex */
public final class k implements b, u {

    /* renamed from: n  reason: collision with root package name */
    public static final l0 f4144n = com.google.common.collect.s.J(5400000L, 3300000L, 2000000L, 1300000L, 760000L);

    /* renamed from: o  reason: collision with root package name */
    public static final l0 f4145o = com.google.common.collect.s.J(1700000L, 820000L, 450000L, 180000L, 130000L);

    /* renamed from: p  reason: collision with root package name */
    public static final l0 f4146p = com.google.common.collect.s.J(2300000L, 1300000L, 1000000L, 820000L, 570000L);

    /* renamed from: q  reason: collision with root package name */
    public static final l0 f4147q = com.google.common.collect.s.J(3400000L, 2000000L, 1400000L, 1000000L, 620000L);
    public static final l0 r = com.google.common.collect.s.J(7500000L, 5200000L, 3700000L, 1800000L, 1100000L);

    /* renamed from: s  reason: collision with root package name */
    public static final l0 f4148s = com.google.common.collect.s.J(3300000L, 1900000L, 1700000L, 1500000L, 1200000L);

    /* renamed from: t  reason: collision with root package name */
    public static k f4149t;

    /* renamed from: a  reason: collision with root package name */
    public final com.google.common.collect.t<Integer, Long> f4150a;

    /* renamed from: b  reason: collision with root package name */
    public final b.a.C0079a f4151b = new b.a.C0079a();

    /* renamed from: c  reason: collision with root package name */
    public final s f4152c;

    /* renamed from: d  reason: collision with root package name */
    public final c9.b f4153d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f4154e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public long f4155g;

    /* renamed from: h  reason: collision with root package name */
    public long f4156h;

    /* renamed from: i  reason: collision with root package name */
    public int f4157i;

    /* renamed from: j  reason: collision with root package name */
    public long f4158j;

    /* renamed from: k  reason: collision with root package name */
    public long f4159k;

    /* renamed from: l  reason: collision with root package name */
    public long f4160l;

    /* renamed from: m  reason: collision with root package name */
    public long f4161m;

    /* compiled from: DefaultBandwidthMeter.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Context f4162a;

        /* renamed from: b  reason: collision with root package name */
        public final HashMap f4163b;

        /* renamed from: c  reason: collision with root package name */
        public final int f4164c;

        /* renamed from: d  reason: collision with root package name */
        public final c9.s f4165d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f4166e;

        /* JADX WARN: Removed duplicated region for block: B:1000:0x0e13  */
        /* JADX WARN: Removed duplicated region for block: B:1001:0x0e1a  */
        /* JADX WARN: Removed duplicated region for block: B:1002:0x0e21  */
        /* JADX WARN: Removed duplicated region for block: B:1003:0x0e28  */
        /* JADX WARN: Removed duplicated region for block: B:1004:0x0e2f  */
        /* JADX WARN: Removed duplicated region for block: B:1005:0x0e36  */
        /* JADX WARN: Removed duplicated region for block: B:1006:0x0e3d  */
        /* JADX WARN: Removed duplicated region for block: B:1007:0x0e44  */
        /* JADX WARN: Removed duplicated region for block: B:1008:0x0e4b  */
        /* JADX WARN: Removed duplicated region for block: B:1009:0x0e52  */
        /* JADX WARN: Removed duplicated region for block: B:1010:0x0e59  */
        /* JADX WARN: Removed duplicated region for block: B:1011:0x0e60  */
        /* JADX WARN: Removed duplicated region for block: B:1012:0x0e67  */
        /* JADX WARN: Removed duplicated region for block: B:1013:0x0e6e  */
        /* JADX WARN: Removed duplicated region for block: B:1014:0x0e75  */
        /* JADX WARN: Removed duplicated region for block: B:1015:0x0e7c  */
        /* JADX WARN: Removed duplicated region for block: B:1016:0x0e83  */
        /* JADX WARN: Removed duplicated region for block: B:1017:0x0e8a  */
        /* JADX WARN: Removed duplicated region for block: B:1018:0x0e91  */
        /* JADX WARN: Removed duplicated region for block: B:1019:0x0e98  */
        /* JADX WARN: Removed duplicated region for block: B:101:0x0179  */
        /* JADX WARN: Removed duplicated region for block: B:1020:0x0e9f  */
        /* JADX WARN: Removed duplicated region for block: B:1021:0x0ea6  */
        /* JADX WARN: Removed duplicated region for block: B:1022:0x0ead  */
        /* JADX WARN: Removed duplicated region for block: B:1023:0x0eb4  */
        /* JADX WARN: Removed duplicated region for block: B:1024:0x0ebb  */
        /* JADX WARN: Removed duplicated region for block: B:1025:0x0ec2  */
        /* JADX WARN: Removed duplicated region for block: B:1026:0x0ec9  */
        /* JADX WARN: Removed duplicated region for block: B:1027:0x0ed0  */
        /* JADX WARN: Removed duplicated region for block: B:1028:0x0ed7  */
        /* JADX WARN: Removed duplicated region for block: B:1029:0x0ede  */
        /* JADX WARN: Removed duplicated region for block: B:1030:0x0ee5  */
        /* JADX WARN: Removed duplicated region for block: B:1031:0x0eec  */
        /* JADX WARN: Removed duplicated region for block: B:1032:0x0ef3  */
        /* JADX WARN: Removed duplicated region for block: B:1033:0x0efa  */
        /* JADX WARN: Removed duplicated region for block: B:1034:0x0f01  */
        /* JADX WARN: Removed duplicated region for block: B:1035:0x0f08  */
        /* JADX WARN: Removed duplicated region for block: B:1036:0x0f0f  */
        /* JADX WARN: Removed duplicated region for block: B:1037:0x0f16  */
        /* JADX WARN: Removed duplicated region for block: B:1038:0x0f1d  */
        /* JADX WARN: Removed duplicated region for block: B:1039:0x0f24  */
        /* JADX WARN: Removed duplicated region for block: B:1040:0x0f2b  */
        /* JADX WARN: Removed duplicated region for block: B:1041:0x0f32  */
        /* JADX WARN: Removed duplicated region for block: B:1042:0x0f39  */
        /* JADX WARN: Removed duplicated region for block: B:1043:0x0f40  */
        /* JADX WARN: Removed duplicated region for block: B:1044:0x0f47  */
        /* JADX WARN: Removed duplicated region for block: B:1045:0x0f4e  */
        /* JADX WARN: Removed duplicated region for block: B:1046:0x0f55  */
        /* JADX WARN: Removed duplicated region for block: B:1047:0x0f5c  */
        /* JADX WARN: Removed duplicated region for block: B:1048:0x0f63  */
        /* JADX WARN: Removed duplicated region for block: B:1049:0x0f6a  */
        /* JADX WARN: Removed duplicated region for block: B:1050:0x0f71  */
        /* JADX WARN: Removed duplicated region for block: B:1051:0x0f78  */
        /* JADX WARN: Removed duplicated region for block: B:1052:0x0f7f  */
        /* JADX WARN: Removed duplicated region for block: B:1053:0x0f86  */
        /* JADX WARN: Removed duplicated region for block: B:1054:0x0f8d  */
        /* JADX WARN: Removed duplicated region for block: B:1055:0x0f94  */
        /* JADX WARN: Removed duplicated region for block: B:1056:0x0f9b  */
        /* JADX WARN: Removed duplicated region for block: B:1057:0x0fa2  */
        /* JADX WARN: Removed duplicated region for block: B:1058:0x0fa9  */
        /* JADX WARN: Removed duplicated region for block: B:1059:0x0fb0  */
        /* JADX WARN: Removed duplicated region for block: B:105:0x0187  */
        /* JADX WARN: Removed duplicated region for block: B:1060:0x0fb7  */
        /* JADX WARN: Removed duplicated region for block: B:1061:0x0fbe  */
        /* JADX WARN: Removed duplicated region for block: B:1062:0x0fc5  */
        /* JADX WARN: Removed duplicated region for block: B:1063:0x0fcc  */
        /* JADX WARN: Removed duplicated region for block: B:1064:0x0fd3  */
        /* JADX WARN: Removed duplicated region for block: B:1065:0x0fda  */
        /* JADX WARN: Removed duplicated region for block: B:1066:0x0fe1  */
        /* JADX WARN: Removed duplicated region for block: B:1067:0x0fe8  */
        /* JADX WARN: Removed duplicated region for block: B:1068:0x0fef  */
        /* JADX WARN: Removed duplicated region for block: B:1069:0x0ff6  */
        /* JADX WARN: Removed duplicated region for block: B:1070:0x0ffd  */
        /* JADX WARN: Removed duplicated region for block: B:1071:0x1004  */
        /* JADX WARN: Removed duplicated region for block: B:1072:0x100b  */
        /* JADX WARN: Removed duplicated region for block: B:1073:0x1012  */
        /* JADX WARN: Removed duplicated region for block: B:1074:0x1019  */
        /* JADX WARN: Removed duplicated region for block: B:1075:0x1020  */
        /* JADX WARN: Removed duplicated region for block: B:1076:0x1027  */
        /* JADX WARN: Removed duplicated region for block: B:1077:0x102e  */
        /* JADX WARN: Removed duplicated region for block: B:1078:0x1035  */
        /* JADX WARN: Removed duplicated region for block: B:1079:0x103c  */
        /* JADX WARN: Removed duplicated region for block: B:1080:0x1043  */
        /* JADX WARN: Removed duplicated region for block: B:1081:0x104a  */
        /* JADX WARN: Removed duplicated region for block: B:1082:0x1051  */
        /* JADX WARN: Removed duplicated region for block: B:1083:0x1058  */
        /* JADX WARN: Removed duplicated region for block: B:1084:0x105f  */
        /* JADX WARN: Removed duplicated region for block: B:1085:0x1066  */
        /* JADX WARN: Removed duplicated region for block: B:1086:0x106d  */
        /* JADX WARN: Removed duplicated region for block: B:1087:0x1074  */
        /* JADX WARN: Removed duplicated region for block: B:1088:0x107b  */
        /* JADX WARN: Removed duplicated region for block: B:1089:0x1082  */
        /* JADX WARN: Removed duplicated region for block: B:1090:0x1089  */
        /* JADX WARN: Removed duplicated region for block: B:1091:0x1090  */
        /* JADX WARN: Removed duplicated region for block: B:1092:0x1097  */
        /* JADX WARN: Removed duplicated region for block: B:1093:0x109e  */
        /* JADX WARN: Removed duplicated region for block: B:1094:0x10a5  */
        /* JADX WARN: Removed duplicated region for block: B:1095:0x10ac  */
        /* JADX WARN: Removed duplicated region for block: B:1096:0x10b3  */
        /* JADX WARN: Removed duplicated region for block: B:1097:0x10ba  */
        /* JADX WARN: Removed duplicated region for block: B:1098:0x10c1  */
        /* JADX WARN: Removed duplicated region for block: B:1099:0x10c8  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x0195  */
        /* JADX WARN: Removed duplicated region for block: B:1100:0x10cf  */
        /* JADX WARN: Removed duplicated region for block: B:1101:0x10d6  */
        /* JADX WARN: Removed duplicated region for block: B:1102:0x10dd  */
        /* JADX WARN: Removed duplicated region for block: B:1103:0x10e4  */
        /* JADX WARN: Removed duplicated region for block: B:1104:0x10eb  */
        /* JADX WARN: Removed duplicated region for block: B:1105:0x10f2  */
        /* JADX WARN: Removed duplicated region for block: B:1106:0x10f9  */
        /* JADX WARN: Removed duplicated region for block: B:1107:0x1100  */
        /* JADX WARN: Removed duplicated region for block: B:1108:0x1107  */
        /* JADX WARN: Removed duplicated region for block: B:1109:0x110e  */
        /* JADX WARN: Removed duplicated region for block: B:1110:0x1115  */
        /* JADX WARN: Removed duplicated region for block: B:1111:0x111c  */
        /* JADX WARN: Removed duplicated region for block: B:1112:0x1123  */
        /* JADX WARN: Removed duplicated region for block: B:1113:0x112a  */
        /* JADX WARN: Removed duplicated region for block: B:1114:0x1131  */
        /* JADX WARN: Removed duplicated region for block: B:1115:0x1137  */
        /* JADX WARN: Removed duplicated region for block: B:1116:0x113d  */
        /* JADX WARN: Removed duplicated region for block: B:1117:0x1143  */
        /* JADX WARN: Removed duplicated region for block: B:1118:0x1149  */
        /* JADX WARN: Removed duplicated region for block: B:1119:0x114f  */
        /* JADX WARN: Removed duplicated region for block: B:1120:0x1155  */
        /* JADX WARN: Removed duplicated region for block: B:1121:0x115b  */
        /* JADX WARN: Removed duplicated region for block: B:1122:0x1161  */
        /* JADX WARN: Removed duplicated region for block: B:1123:0x1167  */
        /* JADX WARN: Removed duplicated region for block: B:1124:0x116d  */
        /* JADX WARN: Removed duplicated region for block: B:1125:0x1173  */
        /* JADX WARN: Removed duplicated region for block: B:1126:0x1179  */
        /* JADX WARN: Removed duplicated region for block: B:1127:0x117f  */
        /* JADX WARN: Removed duplicated region for block: B:1128:0x1185  */
        /* JADX WARN: Removed duplicated region for block: B:1129:0x118b  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x01a3  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x01b1  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x01bf  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x01cd  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x01db  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x01e9  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x01f7  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x0205  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x0213  */
        /* JADX WARN: Removed duplicated region for block: B:149:0x0221  */
        /* JADX WARN: Removed duplicated region for block: B:153:0x022f  */
        /* JADX WARN: Removed duplicated region for block: B:157:0x023d  */
        /* JADX WARN: Removed duplicated region for block: B:161:0x024b  */
        /* JADX WARN: Removed duplicated region for block: B:165:0x0259  */
        /* JADX WARN: Removed duplicated region for block: B:169:0x0267  */
        /* JADX WARN: Removed duplicated region for block: B:173:0x0275  */
        /* JADX WARN: Removed duplicated region for block: B:177:0x0283  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:181:0x0291  */
        /* JADX WARN: Removed duplicated region for block: B:185:0x029f  */
        /* JADX WARN: Removed duplicated region for block: B:189:0x02ad  */
        /* JADX WARN: Removed duplicated region for block: B:193:0x02bb  */
        /* JADX WARN: Removed duplicated region for block: B:197:0x02c9  */
        /* JADX WARN: Removed duplicated region for block: B:201:0x02d7  */
        /* JADX WARN: Removed duplicated region for block: B:205:0x02e5  */
        /* JADX WARN: Removed duplicated region for block: B:209:0x02f3  */
        /* JADX WARN: Removed duplicated region for block: B:213:0x0301  */
        /* JADX WARN: Removed duplicated region for block: B:217:0x030f  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:221:0x031d  */
        /* JADX WARN: Removed duplicated region for block: B:225:0x032b  */
        /* JADX WARN: Removed duplicated region for block: B:229:0x0339  */
        /* JADX WARN: Removed duplicated region for block: B:233:0x0347  */
        /* JADX WARN: Removed duplicated region for block: B:237:0x0355  */
        /* JADX WARN: Removed duplicated region for block: B:241:0x0363  */
        /* JADX WARN: Removed duplicated region for block: B:245:0x0371  */
        /* JADX WARN: Removed duplicated region for block: B:249:0x037f  */
        /* JADX WARN: Removed duplicated region for block: B:253:0x038d  */
        /* JADX WARN: Removed duplicated region for block: B:257:0x039b  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:261:0x03a9  */
        /* JADX WARN: Removed duplicated region for block: B:265:0x03b7  */
        /* JADX WARN: Removed duplicated region for block: B:269:0x03c5  */
        /* JADX WARN: Removed duplicated region for block: B:273:0x03d3  */
        /* JADX WARN: Removed duplicated region for block: B:277:0x03e1  */
        /* JADX WARN: Removed duplicated region for block: B:281:0x03ef  */
        /* JADX WARN: Removed duplicated region for block: B:285:0x03fd  */
        /* JADX WARN: Removed duplicated region for block: B:289:0x040b  */
        /* JADX WARN: Removed duplicated region for block: B:293:0x0419  */
        /* JADX WARN: Removed duplicated region for block: B:297:0x0427  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:301:0x0435  */
        /* JADX WARN: Removed duplicated region for block: B:305:0x0443  */
        /* JADX WARN: Removed duplicated region for block: B:309:0x0451  */
        /* JADX WARN: Removed duplicated region for block: B:313:0x045f  */
        /* JADX WARN: Removed duplicated region for block: B:317:0x046d  */
        /* JADX WARN: Removed duplicated region for block: B:321:0x047b  */
        /* JADX WARN: Removed duplicated region for block: B:325:0x0489  */
        /* JADX WARN: Removed duplicated region for block: B:329:0x0497  */
        /* JADX WARN: Removed duplicated region for block: B:333:0x04a5  */
        /* JADX WARN: Removed duplicated region for block: B:337:0x04b3  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:341:0x04c1  */
        /* JADX WARN: Removed duplicated region for block: B:345:0x04cf  */
        /* JADX WARN: Removed duplicated region for block: B:349:0x04dd  */
        /* JADX WARN: Removed duplicated region for block: B:353:0x04eb  */
        /* JADX WARN: Removed duplicated region for block: B:357:0x04f9  */
        /* JADX WARN: Removed duplicated region for block: B:361:0x0507  */
        /* JADX WARN: Removed duplicated region for block: B:365:0x0515  */
        /* JADX WARN: Removed duplicated region for block: B:369:0x0523  */
        /* JADX WARN: Removed duplicated region for block: B:373:0x0531  */
        /* JADX WARN: Removed duplicated region for block: B:377:0x053f  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:381:0x054d  */
        /* JADX WARN: Removed duplicated region for block: B:385:0x055b  */
        /* JADX WARN: Removed duplicated region for block: B:389:0x0569  */
        /* JADX WARN: Removed duplicated region for block: B:393:0x0577  */
        /* JADX WARN: Removed duplicated region for block: B:397:0x0585  */
        /* JADX WARN: Removed duplicated region for block: B:401:0x0593  */
        /* JADX WARN: Removed duplicated region for block: B:405:0x05a1  */
        /* JADX WARN: Removed duplicated region for block: B:409:0x05af  */
        /* JADX WARN: Removed duplicated region for block: B:413:0x05bd  */
        /* JADX WARN: Removed duplicated region for block: B:417:0x05cb  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:421:0x05d9  */
        /* JADX WARN: Removed duplicated region for block: B:425:0x05e7  */
        /* JADX WARN: Removed duplicated region for block: B:429:0x05f5  */
        /* JADX WARN: Removed duplicated region for block: B:433:0x0603  */
        /* JADX WARN: Removed duplicated region for block: B:437:0x0611  */
        /* JADX WARN: Removed duplicated region for block: B:441:0x061f  */
        /* JADX WARN: Removed duplicated region for block: B:445:0x062d  */
        /* JADX WARN: Removed duplicated region for block: B:449:0x063b  */
        /* JADX WARN: Removed duplicated region for block: B:453:0x0649  */
        /* JADX WARN: Removed duplicated region for block: B:457:0x0657  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:461:0x0665  */
        /* JADX WARN: Removed duplicated region for block: B:465:0x0673  */
        /* JADX WARN: Removed duplicated region for block: B:469:0x0681  */
        /* JADX WARN: Removed duplicated region for block: B:473:0x068f  */
        /* JADX WARN: Removed duplicated region for block: B:477:0x069d  */
        /* JADX WARN: Removed duplicated region for block: B:481:0x06ab  */
        /* JADX WARN: Removed duplicated region for block: B:485:0x06b9  */
        /* JADX WARN: Removed duplicated region for block: B:489:0x06c7  */
        /* JADX WARN: Removed duplicated region for block: B:493:0x06d5  */
        /* JADX WARN: Removed duplicated region for block: B:497:0x06e3  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:501:0x06f1  */
        /* JADX WARN: Removed duplicated region for block: B:505:0x06ff  */
        /* JADX WARN: Removed duplicated region for block: B:509:0x070d  */
        /* JADX WARN: Removed duplicated region for block: B:513:0x071b  */
        /* JADX WARN: Removed duplicated region for block: B:517:0x0729  */
        /* JADX WARN: Removed duplicated region for block: B:521:0x0737  */
        /* JADX WARN: Removed duplicated region for block: B:525:0x0745  */
        /* JADX WARN: Removed duplicated region for block: B:529:0x0753  */
        /* JADX WARN: Removed duplicated region for block: B:533:0x0761  */
        /* JADX WARN: Removed duplicated region for block: B:537:0x076f  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:541:0x077d  */
        /* JADX WARN: Removed duplicated region for block: B:545:0x078b  */
        /* JADX WARN: Removed duplicated region for block: B:549:0x0799  */
        /* JADX WARN: Removed duplicated region for block: B:553:0x07a7  */
        /* JADX WARN: Removed duplicated region for block: B:557:0x07b5  */
        /* JADX WARN: Removed duplicated region for block: B:561:0x07c3  */
        /* JADX WARN: Removed duplicated region for block: B:565:0x07d1  */
        /* JADX WARN: Removed duplicated region for block: B:569:0x07df  */
        /* JADX WARN: Removed duplicated region for block: B:573:0x07ed  */
        /* JADX WARN: Removed duplicated region for block: B:577:0x07fb  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:581:0x0809  */
        /* JADX WARN: Removed duplicated region for block: B:585:0x0817  */
        /* JADX WARN: Removed duplicated region for block: B:589:0x0825  */
        /* JADX WARN: Removed duplicated region for block: B:593:0x0833  */
        /* JADX WARN: Removed duplicated region for block: B:597:0x0841  */
        /* JADX WARN: Removed duplicated region for block: B:601:0x084f  */
        /* JADX WARN: Removed duplicated region for block: B:605:0x085d  */
        /* JADX WARN: Removed duplicated region for block: B:609:0x086b  */
        /* JADX WARN: Removed duplicated region for block: B:613:0x0879  */
        /* JADX WARN: Removed duplicated region for block: B:617:0x0887  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:621:0x0895  */
        /* JADX WARN: Removed duplicated region for block: B:625:0x08a3  */
        /* JADX WARN: Removed duplicated region for block: B:629:0x08b1  */
        /* JADX WARN: Removed duplicated region for block: B:633:0x08bf  */
        /* JADX WARN: Removed duplicated region for block: B:637:0x08cd  */
        /* JADX WARN: Removed duplicated region for block: B:641:0x08db  */
        /* JADX WARN: Removed duplicated region for block: B:645:0x08e9  */
        /* JADX WARN: Removed duplicated region for block: B:649:0x08f7  */
        /* JADX WARN: Removed duplicated region for block: B:653:0x0905  */
        /* JADX WARN: Removed duplicated region for block: B:657:0x0913  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:661:0x0921  */
        /* JADX WARN: Removed duplicated region for block: B:665:0x092f  */
        /* JADX WARN: Removed duplicated region for block: B:669:0x093d  */
        /* JADX WARN: Removed duplicated region for block: B:673:0x094b  */
        /* JADX WARN: Removed duplicated region for block: B:677:0x0959  */
        /* JADX WARN: Removed duplicated region for block: B:681:0x0967  */
        /* JADX WARN: Removed duplicated region for block: B:685:0x0975  */
        /* JADX WARN: Removed duplicated region for block: B:689:0x0983  */
        /* JADX WARN: Removed duplicated region for block: B:693:0x0991  */
        /* JADX WARN: Removed duplicated region for block: B:697:0x099f  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:701:0x09ad  */
        /* JADX WARN: Removed duplicated region for block: B:705:0x09bb  */
        /* JADX WARN: Removed duplicated region for block: B:709:0x09c9  */
        /* JADX WARN: Removed duplicated region for block: B:713:0x09d7  */
        /* JADX WARN: Removed duplicated region for block: B:717:0x09e5  */
        /* JADX WARN: Removed duplicated region for block: B:721:0x09f3  */
        /* JADX WARN: Removed duplicated region for block: B:725:0x0a01  */
        /* JADX WARN: Removed duplicated region for block: B:729:0x0a0f  */
        /* JADX WARN: Removed duplicated region for block: B:733:0x0a1d  */
        /* JADX WARN: Removed duplicated region for block: B:737:0x0a2b  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0117  */
        /* JADX WARN: Removed duplicated region for block: B:741:0x0a39  */
        /* JADX WARN: Removed duplicated region for block: B:745:0x0a47  */
        /* JADX WARN: Removed duplicated region for block: B:749:0x0a55  */
        /* JADX WARN: Removed duplicated region for block: B:753:0x0a63  */
        /* JADX WARN: Removed duplicated region for block: B:757:0x0a71  */
        /* JADX WARN: Removed duplicated region for block: B:761:0x0a7f  */
        /* JADX WARN: Removed duplicated region for block: B:765:0x0a8d  */
        /* JADX WARN: Removed duplicated region for block: B:769:0x0a9b  */
        /* JADX WARN: Removed duplicated region for block: B:773:0x0aa9  */
        /* JADX WARN: Removed duplicated region for block: B:777:0x0ab7  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:781:0x0ac5  */
        /* JADX WARN: Removed duplicated region for block: B:785:0x0ad3  */
        /* JADX WARN: Removed duplicated region for block: B:789:0x0ae1  */
        /* JADX WARN: Removed duplicated region for block: B:793:0x0aef  */
        /* JADX WARN: Removed duplicated region for block: B:797:0x0afd  */
        /* JADX WARN: Removed duplicated region for block: B:801:0x0b0b  */
        /* JADX WARN: Removed duplicated region for block: B:805:0x0b19  */
        /* JADX WARN: Removed duplicated region for block: B:809:0x0b27  */
        /* JADX WARN: Removed duplicated region for block: B:813:0x0b35  */
        /* JADX WARN: Removed duplicated region for block: B:817:0x0b43  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:821:0x0b51  */
        /* JADX WARN: Removed duplicated region for block: B:825:0x0b5f  */
        /* JADX WARN: Removed duplicated region for block: B:829:0x0b6d  */
        /* JADX WARN: Removed duplicated region for block: B:833:0x0b7b  */
        /* JADX WARN: Removed duplicated region for block: B:837:0x0b89  */
        /* JADX WARN: Removed duplicated region for block: B:841:0x0b97  */
        /* JADX WARN: Removed duplicated region for block: B:845:0x0ba5  */
        /* JADX WARN: Removed duplicated region for block: B:849:0x0bb3  */
        /* JADX WARN: Removed duplicated region for block: B:853:0x0bc1  */
        /* JADX WARN: Removed duplicated region for block: B:857:0x0bcf  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0141  */
        /* JADX WARN: Removed duplicated region for block: B:861:0x0bdd  */
        /* JADX WARN: Removed duplicated region for block: B:865:0x0beb  */
        /* JADX WARN: Removed duplicated region for block: B:869:0x0bf9  */
        /* JADX WARN: Removed duplicated region for block: B:873:0x0c07  */
        /* JADX WARN: Removed duplicated region for block: B:877:0x0c15  */
        /* JADX WARN: Removed duplicated region for block: B:881:0x0c23  */
        /* JADX WARN: Removed duplicated region for block: B:885:0x0c31  */
        /* JADX WARN: Removed duplicated region for block: B:889:0x0c3f  */
        /* JADX WARN: Removed duplicated region for block: B:893:0x0c4d  */
        /* JADX WARN: Removed duplicated region for block: B:897:0x0c5b  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x014f  */
        /* JADX WARN: Removed duplicated region for block: B:901:0x0c69  */
        /* JADX WARN: Removed duplicated region for block: B:905:0x0c77  */
        /* JADX WARN: Removed duplicated region for block: B:909:0x0c85  */
        /* JADX WARN: Removed duplicated region for block: B:913:0x0c93  */
        /* JADX WARN: Removed duplicated region for block: B:917:0x0ca1  */
        /* JADX WARN: Removed duplicated region for block: B:921:0x0caf  */
        /* JADX WARN: Removed duplicated region for block: B:925:0x0cbd  */
        /* JADX WARN: Removed duplicated region for block: B:929:0x0ccb  */
        /* JADX WARN: Removed duplicated region for block: B:933:0x0cd9  */
        /* JADX WARN: Removed duplicated region for block: B:937:0x0ce7  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x015d  */
        /* JADX WARN: Removed duplicated region for block: B:941:0x0cf2  */
        /* JADX WARN: Removed duplicated region for block: B:945:0x0cfd  */
        /* JADX WARN: Removed duplicated region for block: B:949:0x0d08  */
        /* JADX WARN: Removed duplicated region for block: B:953:0x0d13  */
        /* JADX WARN: Removed duplicated region for block: B:957:0x0d1e  */
        /* JADX WARN: Removed duplicated region for block: B:961:0x0d29  */
        /* JADX WARN: Removed duplicated region for block: B:965:0x0d34  */
        /* JADX WARN: Removed duplicated region for block: B:970:0x0d41  */
        /* JADX WARN: Removed duplicated region for block: B:971:0x0d48  */
        /* JADX WARN: Removed duplicated region for block: B:972:0x0d4f  */
        /* JADX WARN: Removed duplicated region for block: B:973:0x0d56  */
        /* JADX WARN: Removed duplicated region for block: B:974:0x0d5d  */
        /* JADX WARN: Removed duplicated region for block: B:975:0x0d64  */
        /* JADX WARN: Removed duplicated region for block: B:976:0x0d6b  */
        /* JADX WARN: Removed duplicated region for block: B:977:0x0d72  */
        /* JADX WARN: Removed duplicated region for block: B:978:0x0d79  */
        /* JADX WARN: Removed duplicated region for block: B:979:0x0d80  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x016b  */
        /* JADX WARN: Removed duplicated region for block: B:980:0x0d87  */
        /* JADX WARN: Removed duplicated region for block: B:981:0x0d8e  */
        /* JADX WARN: Removed duplicated region for block: B:982:0x0d95  */
        /* JADX WARN: Removed duplicated region for block: B:983:0x0d9c  */
        /* JADX WARN: Removed duplicated region for block: B:984:0x0da3  */
        /* JADX WARN: Removed duplicated region for block: B:985:0x0daa  */
        /* JADX WARN: Removed duplicated region for block: B:986:0x0db1  */
        /* JADX WARN: Removed duplicated region for block: B:987:0x0db8  */
        /* JADX WARN: Removed duplicated region for block: B:988:0x0dbf  */
        /* JADX WARN: Removed duplicated region for block: B:989:0x0dc6  */
        /* JADX WARN: Removed duplicated region for block: B:990:0x0dcd  */
        /* JADX WARN: Removed duplicated region for block: B:991:0x0dd4  */
        /* JADX WARN: Removed duplicated region for block: B:992:0x0ddb  */
        /* JADX WARN: Removed duplicated region for block: B:993:0x0de2  */
        /* JADX WARN: Removed duplicated region for block: B:994:0x0de9  */
        /* JADX WARN: Removed duplicated region for block: B:995:0x0df0  */
        /* JADX WARN: Removed duplicated region for block: B:996:0x0df7  */
        /* JADX WARN: Removed duplicated region for block: B:997:0x0dfe  */
        /* JADX WARN: Removed duplicated region for block: B:998:0x0e05  */
        /* JADX WARN: Removed duplicated region for block: B:999:0x0e0c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(Context context) {
            Context applicationContext;
            String i02;
            char c10;
            int[] iArr;
            TelephonyManager telephonyManager;
            if (context == null) {
                applicationContext = null;
            } else {
                applicationContext = context.getApplicationContext();
            }
            this.f4162a = applicationContext;
            int i6 = w.f5205a;
            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                if (!TextUtils.isEmpty(networkCountryIso)) {
                    i02 = sc.b.i0(networkCountryIso);
                    l0 l0Var = k.f4144n;
                    i02.getClass();
                    c10 = 65535;
                    switch (i02.hashCode()) {
                        case 2083:
                            if (i02.equals("AD")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 2084:
                            if (i02.equals("AE")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 2085:
                            if (i02.equals("AF")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 2086:
                            if (i02.equals("AG")) {
                                c10 = 3;
                                break;
                            }
                            break;
                        case 2088:
                            if (i02.equals("AI")) {
                                c10 = 4;
                                break;
                            }
                            break;
                        case 2091:
                            if (i02.equals("AL")) {
                                c10 = 5;
                                break;
                            }
                            break;
                        case 2092:
                            if (i02.equals("AM")) {
                                c10 = 6;
                                break;
                            }
                            break;
                        case 2094:
                            if (i02.equals("AO")) {
                                c10 = 7;
                                break;
                            }
                            break;
                        case 2096:
                            if (i02.equals("AQ")) {
                                c10 = '\b';
                                break;
                            }
                            break;
                        case 2097:
                            if (i02.equals("AR")) {
                                c10 = '\t';
                                break;
                            }
                            break;
                        case 2098:
                            if (i02.equals("AS")) {
                                c10 = '\n';
                                break;
                            }
                            break;
                        case 2099:
                            if (i02.equals("AT")) {
                                c10 = 11;
                                break;
                            }
                            break;
                        case 2100:
                            if (i02.equals("AU")) {
                                c10 = '\f';
                                break;
                            }
                            break;
                        case 2102:
                            if (i02.equals("AW")) {
                                c10 = '\r';
                                break;
                            }
                            break;
                        case 2103:
                            if (i02.equals("AX")) {
                                c10 = 14;
                                break;
                            }
                            break;
                        case 2105:
                            if (i02.equals("AZ")) {
                                c10 = 15;
                                break;
                            }
                            break;
                        case 2111:
                            if (i02.equals("BA")) {
                                c10 = 16;
                                break;
                            }
                            break;
                        case 2112:
                            if (i02.equals("BB")) {
                                c10 = 17;
                                break;
                            }
                            break;
                        case 2114:
                            if (i02.equals("BD")) {
                                c10 = 18;
                                break;
                            }
                            break;
                        case 2115:
                            if (i02.equals("BE")) {
                                c10 = 19;
                                break;
                            }
                            break;
                        case 2116:
                            if (i02.equals("BF")) {
                                c10 = 20;
                                break;
                            }
                            break;
                        case 2117:
                            if (i02.equals("BG")) {
                                c10 = 21;
                                break;
                            }
                            break;
                        case 2118:
                            if (i02.equals("BH")) {
                                c10 = 22;
                                break;
                            }
                            break;
                        case 2119:
                            if (i02.equals("BI")) {
                                c10 = 23;
                                break;
                            }
                            break;
                        case 2120:
                            if (i02.equals("BJ")) {
                                c10 = 24;
                                break;
                            }
                            break;
                        case 2122:
                            if (i02.equals("BL")) {
                                c10 = 25;
                                break;
                            }
                            break;
                        case 2123:
                            if (i02.equals("BM")) {
                                c10 = 26;
                                break;
                            }
                            break;
                        case 2124:
                            if (i02.equals("BN")) {
                                c10 = 27;
                                break;
                            }
                            break;
                        case 2125:
                            if (i02.equals("BO")) {
                                c10 = 28;
                                break;
                            }
                            break;
                        case 2127:
                            if (i02.equals("BQ")) {
                                c10 = 29;
                                break;
                            }
                            break;
                        case 2128:
                            if (i02.equals("BR")) {
                                c10 = 30;
                                break;
                            }
                            break;
                        case 2129:
                            if (i02.equals("BS")) {
                                c10 = 31;
                                break;
                            }
                            break;
                        case 2130:
                            if (i02.equals("BT")) {
                                c10 = ' ';
                                break;
                            }
                            break;
                        case 2133:
                            if (i02.equals("BW")) {
                                c10 = '!';
                                break;
                            }
                            break;
                        case 2135:
                            if (i02.equals("BY")) {
                                c10 = '\"';
                                break;
                            }
                            break;
                        case 2136:
                            if (i02.equals("BZ")) {
                                c10 = '#';
                                break;
                            }
                            break;
                        case 2142:
                            if (i02.equals("CA")) {
                                c10 = '$';
                                break;
                            }
                            break;
                        case 2145:
                            if (i02.equals("CD")) {
                                c10 = '%';
                                break;
                            }
                            break;
                        case 2147:
                            if (i02.equals("CF")) {
                                c10 = '&';
                                break;
                            }
                            break;
                        case 2148:
                            if (i02.equals("CG")) {
                                c10 = '\'';
                                break;
                            }
                            break;
                        case 2149:
                            if (i02.equals("CH")) {
                                c10 = '(';
                                break;
                            }
                            break;
                        case 2150:
                            if (i02.equals("CI")) {
                                c10 = ')';
                                break;
                            }
                            break;
                        case 2152:
                            if (i02.equals("CK")) {
                                c10 = '*';
                                break;
                            }
                            break;
                        case 2153:
                            if (i02.equals("CL")) {
                                c10 = '+';
                                break;
                            }
                            break;
                        case 2154:
                            if (i02.equals("CM")) {
                                c10 = ',';
                                break;
                            }
                            break;
                        case 2155:
                            if (i02.equals("CN")) {
                                c10 = '-';
                                break;
                            }
                            break;
                        case 2156:
                            if (i02.equals("CO")) {
                                c10 = '.';
                                break;
                            }
                            break;
                        case 2159:
                            if (i02.equals("CR")) {
                                c10 = '/';
                                break;
                            }
                            break;
                        case 2162:
                            if (i02.equals("CU")) {
                                c10 = '0';
                                break;
                            }
                            break;
                        case 2163:
                            if (i02.equals("CV")) {
                                c10 = '1';
                                break;
                            }
                            break;
                        case 2164:
                            if (i02.equals("CW")) {
                                c10 = '2';
                                break;
                            }
                            break;
                        case 2165:
                            if (i02.equals("CX")) {
                                c10 = '3';
                                break;
                            }
                            break;
                        case 2166:
                            if (i02.equals("CY")) {
                                c10 = '4';
                                break;
                            }
                            break;
                        case 2167:
                            if (i02.equals("CZ")) {
                                c10 = '5';
                                break;
                            }
                            break;
                        case 2177:
                            if (i02.equals("DE")) {
                                c10 = '6';
                                break;
                            }
                            break;
                        case 2182:
                            if (i02.equals("DJ")) {
                                c10 = '7';
                                break;
                            }
                            break;
                        case 2183:
                            if (i02.equals("DK")) {
                                c10 = '8';
                                break;
                            }
                            break;
                        case 2185:
                            if (i02.equals("DM")) {
                                c10 = '9';
                                break;
                            }
                            break;
                        case 2187:
                            if (i02.equals("DO")) {
                                c10 = ':';
                                break;
                            }
                            break;
                        case 2198:
                            if (i02.equals("DZ")) {
                                c10 = ';';
                                break;
                            }
                            break;
                        case 2206:
                            if (i02.equals("EC")) {
                                c10 = '<';
                                break;
                            }
                            break;
                        case 2208:
                            if (i02.equals("EE")) {
                                c10 = '=';
                                break;
                            }
                            break;
                        case 2210:
                            if (i02.equals("EG")) {
                                c10 = '>';
                                break;
                            }
                            break;
                        case 2221:
                            if (i02.equals("ER")) {
                                c10 = '?';
                                break;
                            }
                            break;
                        case 2222:
                            if (i02.equals("ES")) {
                                c10 = '@';
                                break;
                            }
                            break;
                        case 2223:
                            if (i02.equals("ET")) {
                                c10 = 'A';
                                break;
                            }
                            break;
                        case 2243:
                            if (i02.equals("FI")) {
                                c10 = 'B';
                                break;
                            }
                            break;
                        case 2244:
                            if (i02.equals("FJ")) {
                                c10 = 'C';
                                break;
                            }
                            break;
                        case 2245:
                            if (i02.equals("FK")) {
                                c10 = 'D';
                                break;
                            }
                            break;
                        case 2247:
                            if (i02.equals("FM")) {
                                c10 = 'E';
                                break;
                            }
                            break;
                        case 2249:
                            if (i02.equals("FO")) {
                                c10 = 'F';
                                break;
                            }
                            break;
                        case 2252:
                            if (i02.equals("FR")) {
                                c10 = 'G';
                                break;
                            }
                            break;
                        case 2266:
                            if (i02.equals("GA")) {
                                c10 = 'H';
                                break;
                            }
                            break;
                        case 2267:
                            if (i02.equals("GB")) {
                                c10 = 'I';
                                break;
                            }
                            break;
                        case 2269:
                            if (i02.equals("GD")) {
                                c10 = 'J';
                                break;
                            }
                            break;
                        case 2270:
                            if (i02.equals("GE")) {
                                c10 = 'K';
                                break;
                            }
                            break;
                        case 2271:
                            if (i02.equals("GF")) {
                                c10 = 'L';
                                break;
                            }
                            break;
                        case 2272:
                            if (i02.equals("GG")) {
                                c10 = 'M';
                                break;
                            }
                            break;
                        case 2273:
                            if (i02.equals("GH")) {
                                c10 = 'N';
                                break;
                            }
                            break;
                        case 2274:
                            if (i02.equals("GI")) {
                                c10 = 'O';
                                break;
                            }
                            break;
                        case 2277:
                            if (i02.equals("GL")) {
                                c10 = 'P';
                                break;
                            }
                            break;
                        case 2278:
                            if (i02.equals("GM")) {
                                c10 = 'Q';
                                break;
                            }
                            break;
                        case 2279:
                            if (i02.equals("GN")) {
                                c10 = 'R';
                                break;
                            }
                            break;
                        case 2281:
                            if (i02.equals("GP")) {
                                c10 = 'S';
                                break;
                            }
                            break;
                        case 2282:
                            if (i02.equals("GQ")) {
                                c10 = 'T';
                                break;
                            }
                            break;
                        case 2283:
                            if (i02.equals("GR")) {
                                c10 = 'U';
                                break;
                            }
                            break;
                        case 2285:
                            if (i02.equals("GT")) {
                                c10 = 'V';
                                break;
                            }
                            break;
                        case 2286:
                            if (i02.equals("GU")) {
                                c10 = 'W';
                                break;
                            }
                            break;
                        case 2288:
                            if (i02.equals("GW")) {
                                c10 = 'X';
                                break;
                            }
                            break;
                        case 2290:
                            if (i02.equals("GY")) {
                                c10 = 'Y';
                                break;
                            }
                            break;
                        case 2307:
                            if (i02.equals("HK")) {
                                c10 = 'Z';
                                break;
                            }
                            break;
                        case 2310:
                            if (i02.equals("HN")) {
                                c10 = '[';
                                break;
                            }
                            break;
                        case 2314:
                            if (i02.equals("HR")) {
                                c10 = '\\';
                                break;
                            }
                            break;
                        case 2316:
                            if (i02.equals("HT")) {
                                c10 = ']';
                                break;
                            }
                            break;
                        case 2317:
                            if (i02.equals("HU")) {
                                c10 = '^';
                                break;
                            }
                            break;
                        case 2331:
                            if (i02.equals("ID")) {
                                c10 = '_';
                                break;
                            }
                            break;
                        case 2332:
                            if (i02.equals("IE")) {
                                c10 = '`';
                                break;
                            }
                            break;
                        case 2339:
                            if (i02.equals("IL")) {
                                c10 = 'a';
                                break;
                            }
                            break;
                        case 2340:
                            if (i02.equals("IM")) {
                                c10 = 'b';
                                break;
                            }
                            break;
                        case 2341:
                            if (i02.equals("IN")) {
                                c10 = 'c';
                                break;
                            }
                            break;
                        case 2342:
                            if (i02.equals("IO")) {
                                c10 = 'd';
                                break;
                            }
                            break;
                        case 2344:
                            if (i02.equals("IQ")) {
                                c10 = 'e';
                                break;
                            }
                            break;
                        case 2345:
                            if (i02.equals("IR")) {
                                c10 = 'f';
                                break;
                            }
                            break;
                        case 2346:
                            if (i02.equals("IS")) {
                                c10 = 'g';
                                break;
                            }
                            break;
                        case 2347:
                            if (i02.equals("IT")) {
                                c10 = 'h';
                                break;
                            }
                            break;
                        case 2363:
                            if (i02.equals("JE")) {
                                c10 = 'i';
                                break;
                            }
                            break;
                        case 2371:
                            if (i02.equals("JM")) {
                                c10 = 'j';
                                break;
                            }
                            break;
                        case 2373:
                            if (i02.equals("JO")) {
                                c10 = 'k';
                                break;
                            }
                            break;
                        case 2374:
                            if (i02.equals("JP")) {
                                c10 = 'l';
                                break;
                            }
                            break;
                        case 2394:
                            if (i02.equals("KE")) {
                                c10 = 'm';
                                break;
                            }
                            break;
                        case 2396:
                            if (i02.equals("KG")) {
                                c10 = 'n';
                                break;
                            }
                            break;
                        case 2397:
                            if (i02.equals("KH")) {
                                c10 = 'o';
                                break;
                            }
                            break;
                        case 2398:
                            if (i02.equals("KI")) {
                                c10 = 'p';
                                break;
                            }
                            break;
                        case 2402:
                            if (i02.equals("KM")) {
                                c10 = 'q';
                                break;
                            }
                            break;
                        case 2405:
                            if (i02.equals("KP")) {
                                c10 = 'r';
                                break;
                            }
                            break;
                        case 2407:
                            if (i02.equals("KR")) {
                                c10 = 's';
                                break;
                            }
                            break;
                        case 2412:
                            if (i02.equals("KW")) {
                                c10 = 't';
                                break;
                            }
                            break;
                        case 2414:
                            if (i02.equals("KY")) {
                                c10 = 'u';
                                break;
                            }
                            break;
                        case 2415:
                            if (i02.equals("KZ")) {
                                c10 = 'v';
                                break;
                            }
                            break;
                        case 2421:
                            if (i02.equals("LA")) {
                                c10 = 'w';
                                break;
                            }
                            break;
                        case 2422:
                            if (i02.equals("LB")) {
                                c10 = 'x';
                                break;
                            }
                            break;
                        case 2423:
                            if (i02.equals("LC")) {
                                c10 = 'y';
                                break;
                            }
                            break;
                        case 2429:
                            if (i02.equals("LI")) {
                                c10 = 'z';
                                break;
                            }
                            break;
                        case 2431:
                            if (i02.equals("LK")) {
                                c10 = '{';
                                break;
                            }
                            break;
                        case 2438:
                            if (i02.equals("LR")) {
                                c10 = '|';
                                break;
                            }
                            break;
                        case 2439:
                            if (i02.equals("LS")) {
                                c10 = '}';
                                break;
                            }
                            break;
                        case 2440:
                            if (i02.equals("LT")) {
                                c10 = '~';
                                break;
                            }
                            break;
                        case 2441:
                            if (i02.equals("LU")) {
                                c10 = 127;
                                break;
                            }
                            break;
                        case 2442:
                            if (i02.equals("LV")) {
                                c10 = 128;
                                break;
                            }
                            break;
                        case 2445:
                            if (i02.equals("LY")) {
                                c10 = 129;
                                break;
                            }
                            break;
                        case 2452:
                            if (i02.equals("MA")) {
                                c10 = 130;
                                break;
                            }
                            break;
                        case 2454:
                            if (i02.equals("MC")) {
                                c10 = 131;
                                break;
                            }
                            break;
                        case 2455:
                            if (i02.equals("MD")) {
                                c10 = 132;
                                break;
                            }
                            break;
                        case 2456:
                            if (i02.equals("ME")) {
                                c10 = 133;
                                break;
                            }
                            break;
                        case 2457:
                            if (i02.equals("MF")) {
                                c10 = 134;
                                break;
                            }
                            break;
                        case 2458:
                            if (i02.equals("MG")) {
                                c10 = 135;
                                break;
                            }
                            break;
                        case 2459:
                            if (i02.equals("MH")) {
                                c10 = 136;
                                break;
                            }
                            break;
                        case 2462:
                            if (i02.equals("MK")) {
                                c10 = 137;
                                break;
                            }
                            break;
                        case 2463:
                            if (i02.equals("ML")) {
                                c10 = 138;
                                break;
                            }
                            break;
                        case 2464:
                            if (i02.equals("MM")) {
                                c10 = 139;
                                break;
                            }
                            break;
                        case 2465:
                            if (i02.equals("MN")) {
                                c10 = 140;
                                break;
                            }
                            break;
                        case 2466:
                            if (i02.equals("MO")) {
                                c10 = 141;
                                break;
                            }
                            break;
                        case 2467:
                            if (i02.equals("MP")) {
                                c10 = 142;
                                break;
                            }
                            break;
                        case 2468:
                            if (i02.equals("MQ")) {
                                c10 = 143;
                                break;
                            }
                            break;
                        case 2469:
                            if (i02.equals("MR")) {
                                c10 = 144;
                                break;
                            }
                            break;
                        case 2470:
                            if (i02.equals("MS")) {
                                c10 = 145;
                                break;
                            }
                            break;
                        case 2471:
                            if (i02.equals("MT")) {
                                c10 = 146;
                                break;
                            }
                            break;
                        case 2472:
                            if (i02.equals("MU")) {
                                c10 = 147;
                                break;
                            }
                            break;
                        case 2473:
                            if (i02.equals("MV")) {
                                c10 = 148;
                                break;
                            }
                            break;
                        case 2474:
                            if (i02.equals("MW")) {
                                c10 = 149;
                                break;
                            }
                            break;
                        case 2475:
                            if (i02.equals("MX")) {
                                c10 = 150;
                                break;
                            }
                            break;
                        case 2476:
                            if (i02.equals("MY")) {
                                c10 = 151;
                                break;
                            }
                            break;
                        case 2477:
                            if (i02.equals("MZ")) {
                                c10 = 152;
                                break;
                            }
                            break;
                        case 2483:
                            if (i02.equals("NA")) {
                                c10 = 153;
                                break;
                            }
                            break;
                        case 2485:
                            if (i02.equals("NC")) {
                                c10 = 154;
                                break;
                            }
                            break;
                        case 2487:
                            if (i02.equals("NE")) {
                                c10 = 155;
                                break;
                            }
                            break;
                        case 2489:
                            if (i02.equals("NG")) {
                                c10 = 156;
                                break;
                            }
                            break;
                        case 2491:
                            if (i02.equals("NI")) {
                                c10 = 157;
                                break;
                            }
                            break;
                        case 2494:
                            if (i02.equals("NL")) {
                                c10 = 158;
                                break;
                            }
                            break;
                        case 2497:
                            if (i02.equals("NO")) {
                                c10 = 159;
                                break;
                            }
                            break;
                        case 2498:
                            if (i02.equals("NP")) {
                                c10 = 160;
                                break;
                            }
                            break;
                        case 2500:
                            if (i02.equals("NR")) {
                                c10 = 161;
                                break;
                            }
                            break;
                        case 2503:
                            if (i02.equals("NU")) {
                                c10 = 162;
                                break;
                            }
                            break;
                        case 2508:
                            if (i02.equals("NZ")) {
                                c10 = 163;
                                break;
                            }
                            break;
                        case 2526:
                            if (i02.equals("OM")) {
                                c10 = 164;
                                break;
                            }
                            break;
                        case 2545:
                            if (i02.equals("PA")) {
                                c10 = 165;
                                break;
                            }
                            break;
                        case 2549:
                            if (i02.equals("PE")) {
                                c10 = 166;
                                break;
                            }
                            break;
                        case 2550:
                            if (i02.equals("PF")) {
                                c10 = 167;
                                break;
                            }
                            break;
                        case 2551:
                            if (i02.equals("PG")) {
                                c10 = 168;
                                break;
                            }
                            break;
                        case 2552:
                            if (i02.equals("PH")) {
                                c10 = 169;
                                break;
                            }
                            break;
                        case 2555:
                            if (i02.equals("PK")) {
                                c10 = 170;
                                break;
                            }
                            break;
                        case 2556:
                            if (i02.equals("PL")) {
                                c10 = 171;
                                break;
                            }
                            break;
                        case 2557:
                            if (i02.equals("PM")) {
                                c10 = 172;
                                break;
                            }
                            break;
                        case 2562:
                            if (i02.equals("PR")) {
                                c10 = 173;
                                break;
                            }
                            break;
                        case 2563:
                            if (i02.equals("PS")) {
                                c10 = 174;
                                break;
                            }
                            break;
                        case 2564:
                            if (i02.equals("PT")) {
                                c10 = 175;
                                break;
                            }
                            break;
                        case 2567:
                            if (i02.equals("PW")) {
                                c10 = 176;
                                break;
                            }
                            break;
                        case 2569:
                            if (i02.equals("PY")) {
                                c10 = 177;
                                break;
                            }
                            break;
                        case 2576:
                            if (i02.equals("QA")) {
                                c10 = 178;
                                break;
                            }
                            break;
                        case 2611:
                            if (i02.equals("RE")) {
                                c10 = 179;
                                break;
                            }
                            break;
                        case 2621:
                            if (i02.equals("RO")) {
                                c10 = 180;
                                break;
                            }
                            break;
                        case 2625:
                            if (i02.equals("RS")) {
                                c10 = 181;
                                break;
                            }
                            break;
                        case 2627:
                            if (i02.equals("RU")) {
                                c10 = 182;
                                break;
                            }
                            break;
                        case 2629:
                            if (i02.equals("RW")) {
                                c10 = 183;
                                break;
                            }
                            break;
                        case 2638:
                            if (i02.equals("SA")) {
                                c10 = 184;
                                break;
                            }
                            break;
                        case 2639:
                            if (i02.equals("SB")) {
                                c10 = 185;
                                break;
                            }
                            break;
                        case 2640:
                            if (i02.equals("SC")) {
                                c10 = 186;
                                break;
                            }
                            break;
                        case 2641:
                            if (i02.equals("SD")) {
                                c10 = 187;
                                break;
                            }
                            break;
                        case 2642:
                            if (i02.equals("SE")) {
                                c10 = 188;
                                break;
                            }
                            break;
                        case 2644:
                            if (i02.equals("SG")) {
                                c10 = 189;
                                break;
                            }
                            break;
                        case 2645:
                            if (i02.equals("SH")) {
                                c10 = 190;
                                break;
                            }
                            break;
                        case 2646:
                            if (i02.equals("SI")) {
                                c10 = 191;
                                break;
                            }
                            break;
                        case 2647:
                            if (i02.equals("SJ")) {
                                c10 = 192;
                                break;
                            }
                            break;
                        case 2648:
                            if (i02.equals("SK")) {
                                c10 = 193;
                                break;
                            }
                            break;
                        case 2649:
                            if (i02.equals("SL")) {
                                c10 = 194;
                                break;
                            }
                            break;
                        case 2650:
                            if (i02.equals("SM")) {
                                c10 = 195;
                                break;
                            }
                            break;
                        case 2651:
                            if (i02.equals("SN")) {
                                c10 = 196;
                                break;
                            }
                            break;
                        case 2652:
                            if (i02.equals("SO")) {
                                c10 = 197;
                                break;
                            }
                            break;
                        case 2655:
                            if (i02.equals("SR")) {
                                c10 = 198;
                                break;
                            }
                            break;
                        case 2656:
                            if (i02.equals("SS")) {
                                c10 = 199;
                                break;
                            }
                            break;
                        case 2657:
                            if (i02.equals("ST")) {
                                c10 = 200;
                                break;
                            }
                            break;
                        case 2659:
                            if (i02.equals("SV")) {
                                c10 = 201;
                                break;
                            }
                            break;
                        case 2661:
                            if (i02.equals("SX")) {
                                c10 = 202;
                                break;
                            }
                            break;
                        case 2662:
                            if (i02.equals("SY")) {
                                c10 = 203;
                                break;
                            }
                            break;
                        case 2663:
                            if (i02.equals("SZ")) {
                                c10 = 204;
                                break;
                            }
                            break;
                        case 2671:
                            if (i02.equals("TC")) {
                                c10 = 205;
                                break;
                            }
                            break;
                        case 2672:
                            if (i02.equals("TD")) {
                                c10 = 206;
                                break;
                            }
                            break;
                        case 2675:
                            if (i02.equals("TG")) {
                                c10 = 207;
                                break;
                            }
                            break;
                        case 2676:
                            if (i02.equals("TH")) {
                                c10 = 208;
                                break;
                            }
                            break;
                        case 2678:
                            if (i02.equals("TJ")) {
                                c10 = 209;
                                break;
                            }
                            break;
                        case 2680:
                            if (i02.equals("TL")) {
                                c10 = 210;
                                break;
                            }
                            break;
                        case 2681:
                            if (i02.equals("TM")) {
                                c10 = 211;
                                break;
                            }
                            break;
                        case 2682:
                            if (i02.equals("TN")) {
                                c10 = 212;
                                break;
                            }
                            break;
                        case 2683:
                            if (i02.equals("TO")) {
                                c10 = 213;
                                break;
                            }
                            break;
                        case 2686:
                            if (i02.equals("TR")) {
                                c10 = 214;
                                break;
                            }
                            break;
                        case 2688:
                            if (i02.equals("TT")) {
                                c10 = 215;
                                break;
                            }
                            break;
                        case 2690:
                            if (i02.equals("TV")) {
                                c10 = 216;
                                break;
                            }
                            break;
                        case 2691:
                            if (i02.equals("TW")) {
                                c10 = 217;
                                break;
                            }
                            break;
                        case 2694:
                            if (i02.equals("TZ")) {
                                c10 = 218;
                                break;
                            }
                            break;
                        case 2700:
                            if (i02.equals("UA")) {
                                c10 = 219;
                                break;
                            }
                            break;
                        case 2706:
                            if (i02.equals("UG")) {
                                c10 = 220;
                                break;
                            }
                            break;
                        case 2718:
                            if (i02.equals("US")) {
                                c10 = 221;
                                break;
                            }
                            break;
                        case 2724:
                            if (i02.equals("UY")) {
                                c10 = 222;
                                break;
                            }
                            break;
                        case 2725:
                            if (i02.equals("UZ")) {
                                c10 = 223;
                                break;
                            }
                            break;
                        case 2733:
                            if (i02.equals("VC")) {
                                c10 = 224;
                                break;
                            }
                            break;
                        case 2735:
                            if (i02.equals("VE")) {
                                c10 = 225;
                                break;
                            }
                            break;
                        case 2737:
                            if (i02.equals("VG")) {
                                c10 = 226;
                                break;
                            }
                            break;
                        case 2739:
                            if (i02.equals("VI")) {
                                c10 = 227;
                                break;
                            }
                            break;
                        case 2744:
                            if (i02.equals("VN")) {
                                c10 = 228;
                                break;
                            }
                            break;
                        case 2751:
                            if (i02.equals("VU")) {
                                c10 = 229;
                                break;
                            }
                            break;
                        case 2767:
                            if (i02.equals("WF")) {
                                c10 = 230;
                                break;
                            }
                            break;
                        case 2780:
                            if (i02.equals("WS")) {
                                c10 = 231;
                                break;
                            }
                            break;
                        case 2803:
                            if (i02.equals("XK")) {
                                c10 = 232;
                                break;
                            }
                            break;
                        case 2828:
                            if (i02.equals("YE")) {
                                c10 = 233;
                                break;
                            }
                            break;
                        case 2843:
                            if (i02.equals("YT")) {
                                c10 = 234;
                                break;
                            }
                            break;
                        case 2855:
                            if (i02.equals("ZA")) {
                                c10 = 235;
                                break;
                            }
                            break;
                        case 2867:
                            if (i02.equals("ZM")) {
                                c10 = 236;
                                break;
                            }
                            break;
                        case 2877:
                            if (i02.equals("ZW")) {
                                c10 = 237;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                        case 26:
                        case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                        case R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
                            iArr = new int[]{1, 2, 0, 0, 2, 2};
                            break;
                        case 1:
                            iArr = new int[]{1, 4, 4, 4, 3, 2};
                            break;
                        case 2:
                        case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                        case 155:
                        case 187:
                        case 196:
                        case 206:
                        case 225:
                        case 233:
                            iArr = new int[]{4, 4, 4, 4, 2, 2};
                            break;
                        case 3:
                            iArr = new int[]{2, 3, 1, 2, 2, 2};
                            break;
                        case 4:
                        case 25:
                        case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                        case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                        case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                        case 145:
                        case 224:
                            iArr = new int[]{1, 2, 2, 2, 2, 2};
                            break;
                        case 5:
                        case 16:
                        case R.styleable.AppCompatTheme_windowActionBar /* 117 */:
                            iArr = new int[]{1, 2, 0, 1, 2, 2};
                            break;
                        case 6:
                            iArr = new int[]{2, 3, 2, 4, 2, 2};
                            break;
                        case 7:
                        case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                            iArr = new int[]{3, 4, 3, 2, 2, 2};
                            break;
                        case '\b':
                        case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                        case 'd':
                        case 162:
                        case 190:
                        case 199:
                        case 216:
                            iArr = new int[]{4, 2, 2, 2, 2, 2};
                            break;
                        case '\t':
                            iArr = new int[]{2, 4, 1, 1, 2, 2};
                            break;
                        case '\n':
                            iArr = new int[]{2, 2, 2, 3, 2, 2};
                            break;
                        case 11:
                        case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                        case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                        case 188:
                        case 193:
                            iArr = new int[]{0, 0, 0, 0, 0, 2};
                            break;
                        case '\f':
                            iArr = new int[]{0, 1, 0, 1, 2, 2};
                            break;
                        case '\r':
                        case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                            iArr = new int[]{1, 2, 4, 4, 2, 2};
                            break;
                        case 14:
                        case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                        case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                        case 142:
                        case 172:
                        case 192:
                        case 195:
                            iArr = new int[]{0, 2, 2, 2, 2, 2};
                            break;
                        case 15:
                        case 154:
                            iArr = new int[]{3, 2, 4, 4, 2, 2};
                            break;
                        case 17:
                        case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                        case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                            iArr = new int[]{0, 2, 0, 0, 2, 2};
                            break;
                        case 18:
                        case 151:
                            iArr = new int[]{2, 1, 3, 3, 2, 2};
                            break;
                        case 19:
                            iArr = new int[]{0, 0, 3, 3, 2, 2};
                            break;
                        case 20:
                            iArr = new int[]{4, 3, 4, 3, 2, 2};
                            break;
                        case 21:
                        case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                        case 191:
                            iArr = new int[]{0, 0, 0, 0, 1, 2};
                            break;
                        case 22:
                            iArr = new int[]{1, 2, 2, 4, 4, 2};
                            break;
                        case 23:
                        case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        case 203:
                        case 210:
                            iArr = new int[]{4, 3, 4, 4, 2, 2};
                            break;
                        case 24:
                            iArr = new int[]{4, 4, 3, 4, 2, 2};
                            break;
                        case 27:
                            iArr = new int[]{3, 2, 1, 1, 2, 2};
                            break;
                        case 28:
                            iArr = new int[]{1, 3, 3, 2, 2, 2};
                            break;
                        case 29:
                            iArr = new int[]{1, 2, 2, 0, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                        case 198:
                            iArr = new int[]{2, 3, 2, 2, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                            iArr = new int[]{4, 2, 2, 3, 2, 2};
                            break;
                        case ' ':
                            iArr = new int[]{3, 1, 3, 2, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                            iArr = new int[]{3, 4, 1, 0, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                            iArr = new int[]{0, 1, 1, 3, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                            iArr = new int[]{2, 4, 2, 2, 2, 2};
                            break;
                        case '$':
                            iArr = new int[]{0, 2, 1, 2, 4, 1};
                            break;
                        case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                            iArr = new int[]{4, 2, 3, 1, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                            iArr = new int[]{4, 2, 3, 2, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                        case 150:
                            iArr = new int[]{2, 4, 3, 4, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                            iArr = new int[]{3, 3, 3, 4, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                            iArr = new int[]{2, 2, 2, 1, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                        case 171:
                        case 221:
                            iArr = new int[]{1, 1, 2, 2, 3, 2};
                            break;
                        case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                            iArr = new int[]{2, 0, 2, 2, 3, 1};
                            break;
                        case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                            iArr = new int[]{2, 2, 4, 2, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                            iArr = new int[]{2, 2, 4, 4, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                        case 168:
                            iArr = new int[]{4, 4, 3, 2, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                            iArr = new int[]{2, 3, 1, 0, 2, 2};
                            break;
                        case '2':
                            iArr = new int[]{2, 2, 0, 0, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                            iArr = new int[]{1, 0, 0, 0, 1, 2};
                            break;
                        case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                            iArr = new int[]{0, 0, 2, 2, 1, 2};
                            break;
                        case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                            iArr = new int[]{4, 1, 4, 4, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_colorError /* 56 */:
                            iArr = new int[]{0, 0, 1, 0, 0, 2};
                            break;
                        case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                        case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                            iArr = new int[]{3, 4, 4, 4, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                            iArr = new int[]{2, 4, 2, 1, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                        case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                        case 128:
                        case 146:
                            iArr = new int[]{0, 0, 0, 0, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                            iArr = new int[]{3, 4, 2, 3, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                        case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                            iArr = new int[]{0, 1, 1, 1, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                            iArr = new int[]{4, 4, 3, 1, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                            iArr = new int[]{0, 0, 0, 1, 0, 2};
                            break;
                        case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                            iArr = new int[]{3, 1, 3, 3, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                        case R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
                        case 130:
                        case 152:
                        case k.d.DEFAULT_DRAG_ANIMATION_DURATION /* 200 */:
                            iArr = new int[]{3, 2, 2, 2, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                            iArr = new int[]{3, 2, 4, 2, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                            iArr = new int[]{1, 1, 2, 1, 1, 1};
                            break;
                        case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                            iArr = new int[]{2, 3, 1, 1, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                            iArr = new int[]{0, 0, 1, 1, 2, 3};
                            break;
                        case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                            iArr = new int[]{1, 1, 1, 3, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                        case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                        case 143:
                            iArr = new int[]{2, 1, 2, 3, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                            iArr = new int[]{3, 2, 3, 2, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                        case 230:
                            iArr = new int[]{4, 2, 2, 4, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                            iArr = new int[]{4, 3, 4, 2, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                            iArr = new int[]{4, 2, 3, 4, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                        case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                        case 132:
                        case 137:
                        case 181:
                            iArr = new int[]{1, 0, 0, 0, 2, 2};
                            break;
                        case 'V':
                            iArr = new int[]{2, 3, 2, 1, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                        case 218:
                            iArr = new int[]{3, 4, 3, 3, 2, 2};
                            break;
                        case 'Z':
                            iArr = new int[]{0, 1, 2, 3, 2, 0};
                            break;
                        case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                        case 170:
                        case 197:
                            iArr = new int[]{3, 2, 3, 3, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                            iArr = new int[]{0, 0, 0, 1, 3, 2};
                            break;
                        case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                            iArr = new int[]{3, 2, 3, 3, 3, 2};
                            break;
                        case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                            iArr = new int[]{1, 1, 2, 3, 4, 2};
                            break;
                        case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                            iArr = new int[]{0, 2, 0, 1, 2, 2};
                            break;
                        case 'c':
                            iArr = new int[]{1, 1, 3, 2, 4, 3};
                            break;
                        case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                        case 220:
                            iArr = new int[]{3, 3, 3, 3, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
                            iArr = new int[]{3, 0, 1, 1, 3, 0};
                            break;
                        case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                            iArr = new int[]{0, 1, 0, 1, 1, 2};
                            break;
                        case R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 105 */:
                            iArr = new int[]{3, 2, 1, 2, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                        case 133:
                            iArr = new int[]{1, 0, 0, 1, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
                            iArr = new int[]{0, 1, 0, 1, 1, 1};
                            break;
                        case R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
                            iArr = new int[]{3, 3, 2, 2, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 110 */:
                            iArr = new int[]{2, 1, 1, 1, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_textColorSearchUrl /* 111 */:
                            iArr = new int[]{1, 1, 4, 2, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 112 */:
                        case R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
                        case 129:
                        case 185:
                            iArr = new int[]{4, 2, 4, 3, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                            iArr = new int[]{0, 0, 1, 3, 4, 4};
                            break;
                        case R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
                            iArr = new int[]{1, 1, 0, 0, 0, 2};
                            break;
                        case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                            iArr = new int[]{1, 1, 2, 2, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                        case 222:
                            iArr = new int[]{2, 2, 1, 2, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                            iArr = new int[]{3, 2, 1, 4, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                            iArr = new int[]{3, 1, 3, 4, 4, 2};
                            break;
                        case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                            iArr = new int[]{3, 4, 4, 3, 2, 2};
                            break;
                        case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                            iArr = new int[]{3, 3, 4, 3, 2, 2};
                            break;
                        case 127:
                            iArr = new int[]{1, 0, 2, 2, 2, 2};
                            break;
                        case 131:
                            iArr = new int[]{0, 2, 2, 0, 2, 2};
                            break;
                        case 134:
                            iArr = new int[]{1, 2, 1, 0, 2, 2};
                            break;
                        case 135:
                            iArr = new int[]{3, 4, 2, 2, 2, 2};
                            break;
                        case 136:
                            iArr = new int[]{3, 2, 2, 4, 2, 2};
                            break;
                        case 138:
                            iArr = new int[]{4, 3, 3, 1, 2, 2};
                            break;
                        case 139:
                            iArr = new int[]{2, 4, 3, 3, 2, 2};
                            break;
                        case 140:
                            iArr = new int[]{2, 0, 1, 2, 2, 2};
                            break;
                        case 141:
                            iArr = new int[]{0, 2, 4, 4, 2, 2};
                            break;
                        case 144:
                            iArr = new int[]{4, 1, 3, 4, 2, 2};
                            break;
                        case 147:
                            iArr = new int[]{3, 1, 1, 2, 2, 2};
                            break;
                        case 148:
                            iArr = new int[]{3, 4, 1, 4, 2, 2};
                            break;
                        case 149:
                            iArr = new int[]{4, 2, 1, 0, 2, 2};
                            break;
                        case 153:
                            iArr = new int[]{4, 3, 2, 2, 2, 2};
                            break;
                        case 156:
                            iArr = new int[]{3, 4, 1, 1, 2, 2};
                            break;
                        case 157:
                            iArr = new int[]{2, 3, 4, 3, 2, 2};
                            break;
                        case 158:
                            iArr = new int[]{0, 0, 3, 2, 0, 4};
                            break;
                        case 159:
                            iArr = new int[]{0, 0, 2, 0, 0, 2};
                            break;
                        case 160:
                            iArr = new int[]{2, 1, 4, 3, 2, 2};
                            break;
                        case 161:
                            iArr = new int[]{3, 2, 2, 0, 2, 2};
                            break;
                        case 163:
                            iArr = new int[]{1, 0, 1, 2, 4, 2};
                            break;
                        case 164:
                            iArr = new int[]{2, 3, 1, 3, 4, 2};
                            break;
                        case 165:
                            iArr = new int[]{1, 3, 3, 3, 2, 2};
                            break;
                        case 166:
                            iArr = new int[]{2, 3, 4, 4, 4, 2};
                            break;
                        case 167:
                            iArr = new int[]{2, 3, 3, 1, 2, 2};
                            break;
                        case 169:
                            iArr = new int[]{2, 2, 3, 3, 3, 2};
                            break;
                        case 173:
                            iArr = new int[]{2, 3, 2, 2, 3, 3};
                            break;
                        case 174:
                            iArr = new int[]{3, 4, 1, 2, 2, 2};
                            break;
                        case 175:
                            iArr = new int[]{0, 1, 0, 0, 2, 2};
                            break;
                        case 176:
                            iArr = new int[]{2, 2, 4, 1, 2, 2};
                            break;
                        case 177:
                            iArr = new int[]{2, 2, 3, 2, 2, 2};
                            break;
                        case 178:
                            iArr = new int[]{2, 4, 2, 4, 4, 2};
                            break;
                        case 179:
                            iArr = new int[]{1, 1, 1, 2, 2, 2};
                            break;
                        case SubsamplingScaleImageView.ORIENTATION_180 /* 180 */:
                            iArr = new int[]{0, 0, 1, 1, 1, 2};
                            break;
                        case 182:
                            iArr = new int[]{0, 0, 0, 1, 2, 2};
                            break;
                        case 183:
                            iArr = new int[]{3, 4, 3, 0, 2, 2};
                            break;
                        case 184:
                        case 212:
                        case 226:
                            iArr = new int[]{2, 2, 1, 1, 2, 2};
                            break;
                        case 186:
                            iArr = new int[]{4, 3, 0, 2, 2, 2};
                            break;
                        case 189:
                            iArr = new int[]{1, 1, 2, 3, 1, 4};
                            break;
                        case 194:
                            iArr = new int[]{4, 3, 4, 1, 2, 2};
                            break;
                        case 201:
                            iArr = new int[]{2, 2, 3, 3, 2, 2};
                            break;
                        case 202:
                        case 205:
                            iArr = new int[]{2, 2, 1, 0, 2, 2};
                            break;
                        case 204:
                            iArr = new int[]{4, 3, 2, 4, 2, 2};
                            break;
                        case 207:
                            iArr = new int[]{3, 3, 2, 0, 2, 2};
                            break;
                        case 208:
                            iArr = new int[]{0, 3, 2, 3, 3, 0};
                            break;
                        case 209:
                            iArr = new int[]{4, 2, 4, 4, 2, 2};
                            break;
                        case 211:
                            iArr = new int[]{4, 2, 4, 2, 2, 2};
                            break;
                        case 213:
                            iArr = new int[]{4, 2, 3, 3, 2, 2};
                            break;
                        case 214:
                            iArr = new int[]{1, 1, 0, 1, 2, 2};
                            break;
                        case 215:
                            iArr = new int[]{1, 4, 1, 1, 2, 2};
                            break;
                        case 217:
                            iArr = new int[]{0, 0, 0, 0, 0, 0};
                            break;
                        case 219:
                            iArr = new int[]{0, 3, 1, 1, 2, 2};
                            break;
                        case 223:
                            iArr = new int[]{2, 2, 3, 4, 2, 2};
                            break;
                        case 227:
                            iArr = new int[]{1, 2, 1, 3, 2, 2};
                            break;
                        case 228:
                            iArr = new int[]{0, 3, 3, 4, 2, 2};
                            break;
                        case 229:
                            iArr = new int[]{4, 2, 2, 1, 2, 2};
                            break;
                        case 231:
                            iArr = new int[]{3, 1, 2, 1, 2, 2};
                            break;
                        case 232:
                            iArr = new int[]{1, 1, 1, 1, 2, 2};
                            break;
                        case 234:
                            iArr = new int[]{4, 1, 1, 1, 2, 2};
                            break;
                        case 235:
                            iArr = new int[]{3, 3, 1, 1, 1, 2};
                            break;
                        case 236:
                            iArr = new int[]{3, 3, 4, 2, 2, 2};
                            break;
                        case 237:
                            iArr = new int[]{3, 2, 4, 3, 2, 2};
                            break;
                        default:
                            iArr = new int[]{2, 2, 2, 2, 2, 2};
                            break;
                    }
                    HashMap hashMap = new HashMap(8);
                    hashMap.put(0, 1000000L);
                    l0 l0Var2 = k.f4144n;
                    hashMap.put(2, (Long) l0Var2.get(iArr[0]));
                    hashMap.put(3, (Long) k.f4145o.get(iArr[1]));
                    hashMap.put(4, (Long) k.f4146p.get(iArr[2]));
                    hashMap.put(5, (Long) k.f4147q.get(iArr[3]));
                    hashMap.put(10, (Long) k.r.get(iArr[4]));
                    hashMap.put(9, (Long) k.f4148s.get(iArr[5]));
                    hashMap.put(7, (Long) l0Var2.get(iArr[0]));
                    this.f4163b = hashMap;
                    this.f4164c = 2000;
                    this.f4165d = c9.b.f5126a;
                    this.f4166e = true;
                }
            }
            i02 = sc.b.i0(Locale.getDefault().getCountry());
            l0 l0Var3 = k.f4144n;
            i02.getClass();
            c10 = 65535;
            switch (i02.hashCode()) {
                case 2083:
                    break;
                case 2084:
                    break;
                case 2085:
                    break;
                case 2086:
                    break;
                case 2088:
                    break;
                case 2091:
                    break;
                case 2092:
                    break;
                case 2094:
                    break;
                case 2096:
                    break;
                case 2097:
                    break;
                case 2098:
                    break;
                case 2099:
                    break;
                case 2100:
                    break;
                case 2102:
                    break;
                case 2103:
                    break;
                case 2105:
                    break;
                case 2111:
                    break;
                case 2112:
                    break;
                case 2114:
                    break;
                case 2115:
                    break;
                case 2116:
                    break;
                case 2117:
                    break;
                case 2118:
                    break;
                case 2119:
                    break;
                case 2120:
                    break;
                case 2122:
                    break;
                case 2123:
                    break;
                case 2124:
                    break;
                case 2125:
                    break;
                case 2127:
                    break;
                case 2128:
                    break;
                case 2129:
                    break;
                case 2130:
                    break;
                case 2133:
                    break;
                case 2135:
                    break;
                case 2136:
                    break;
                case 2142:
                    break;
                case 2145:
                    break;
                case 2147:
                    break;
                case 2148:
                    break;
                case 2149:
                    break;
                case 2150:
                    break;
                case 2152:
                    break;
                case 2153:
                    break;
                case 2154:
                    break;
                case 2155:
                    break;
                case 2156:
                    break;
                case 2159:
                    break;
                case 2162:
                    break;
                case 2163:
                    break;
                case 2164:
                    break;
                case 2165:
                    break;
                case 2166:
                    break;
                case 2167:
                    break;
                case 2177:
                    break;
                case 2182:
                    break;
                case 2183:
                    break;
                case 2185:
                    break;
                case 2187:
                    break;
                case 2198:
                    break;
                case 2206:
                    break;
                case 2208:
                    break;
                case 2210:
                    break;
                case 2221:
                    break;
                case 2222:
                    break;
                case 2223:
                    break;
                case 2243:
                    break;
                case 2244:
                    break;
                case 2245:
                    break;
                case 2247:
                    break;
                case 2249:
                    break;
                case 2252:
                    break;
                case 2266:
                    break;
                case 2267:
                    break;
                case 2269:
                    break;
                case 2270:
                    break;
                case 2271:
                    break;
                case 2272:
                    break;
                case 2273:
                    break;
                case 2274:
                    break;
                case 2277:
                    break;
                case 2278:
                    break;
                case 2279:
                    break;
                case 2281:
                    break;
                case 2282:
                    break;
                case 2283:
                    break;
                case 2285:
                    break;
                case 2286:
                    break;
                case 2288:
                    break;
                case 2290:
                    break;
                case 2307:
                    break;
                case 2310:
                    break;
                case 2314:
                    break;
                case 2316:
                    break;
                case 2317:
                    break;
                case 2331:
                    break;
                case 2332:
                    break;
                case 2339:
                    break;
                case 2340:
                    break;
                case 2341:
                    break;
                case 2342:
                    break;
                case 2344:
                    break;
                case 2345:
                    break;
                case 2346:
                    break;
                case 2347:
                    break;
                case 2363:
                    break;
                case 2371:
                    break;
                case 2373:
                    break;
                case 2374:
                    break;
                case 2394:
                    break;
                case 2396:
                    break;
                case 2397:
                    break;
                case 2398:
                    break;
                case 2402:
                    break;
                case 2405:
                    break;
                case 2407:
                    break;
                case 2412:
                    break;
                case 2414:
                    break;
                case 2415:
                    break;
                case 2421:
                    break;
                case 2422:
                    break;
                case 2423:
                    break;
                case 2429:
                    break;
                case 2431:
                    break;
                case 2438:
                    break;
                case 2439:
                    break;
                case 2440:
                    break;
                case 2441:
                    break;
                case 2442:
                    break;
                case 2445:
                    break;
                case 2452:
                    break;
                case 2454:
                    break;
                case 2455:
                    break;
                case 2456:
                    break;
                case 2457:
                    break;
                case 2458:
                    break;
                case 2459:
                    break;
                case 2462:
                    break;
                case 2463:
                    break;
                case 2464:
                    break;
                case 2465:
                    break;
                case 2466:
                    break;
                case 2467:
                    break;
                case 2468:
                    break;
                case 2469:
                    break;
                case 2470:
                    break;
                case 2471:
                    break;
                case 2472:
                    break;
                case 2473:
                    break;
                case 2474:
                    break;
                case 2475:
                    break;
                case 2476:
                    break;
                case 2477:
                    break;
                case 2483:
                    break;
                case 2485:
                    break;
                case 2487:
                    break;
                case 2489:
                    break;
                case 2491:
                    break;
                case 2494:
                    break;
                case 2497:
                    break;
                case 2498:
                    break;
                case 2500:
                    break;
                case 2503:
                    break;
                case 2508:
                    break;
                case 2526:
                    break;
                case 2545:
                    break;
                case 2549:
                    break;
                case 2550:
                    break;
                case 2551:
                    break;
                case 2552:
                    break;
                case 2555:
                    break;
                case 2556:
                    break;
                case 2557:
                    break;
                case 2562:
                    break;
                case 2563:
                    break;
                case 2564:
                    break;
                case 2567:
                    break;
                case 2569:
                    break;
                case 2576:
                    break;
                case 2611:
                    break;
                case 2621:
                    break;
                case 2625:
                    break;
                case 2627:
                    break;
                case 2629:
                    break;
                case 2638:
                    break;
                case 2639:
                    break;
                case 2640:
                    break;
                case 2641:
                    break;
                case 2642:
                    break;
                case 2644:
                    break;
                case 2645:
                    break;
                case 2646:
                    break;
                case 2647:
                    break;
                case 2648:
                    break;
                case 2649:
                    break;
                case 2650:
                    break;
                case 2651:
                    break;
                case 2652:
                    break;
                case 2655:
                    break;
                case 2656:
                    break;
                case 2657:
                    break;
                case 2659:
                    break;
                case 2661:
                    break;
                case 2662:
                    break;
                case 2663:
                    break;
                case 2671:
                    break;
                case 2672:
                    break;
                case 2675:
                    break;
                case 2676:
                    break;
                case 2678:
                    break;
                case 2680:
                    break;
                case 2681:
                    break;
                case 2682:
                    break;
                case 2683:
                    break;
                case 2686:
                    break;
                case 2688:
                    break;
                case 2690:
                    break;
                case 2691:
                    break;
                case 2694:
                    break;
                case 2700:
                    break;
                case 2706:
                    break;
                case 2718:
                    break;
                case 2724:
                    break;
                case 2725:
                    break;
                case 2733:
                    break;
                case 2735:
                    break;
                case 2737:
                    break;
                case 2739:
                    break;
                case 2744:
                    break;
                case 2751:
                    break;
                case 2767:
                    break;
                case 2780:
                    break;
                case 2803:
                    break;
                case 2828:
                    break;
                case 2843:
                    break;
                case 2855:
                    break;
                case 2867:
                    break;
                case 2877:
                    break;
            }
            switch (c10) {
            }
            HashMap hashMap2 = new HashMap(8);
            hashMap2.put(0, 1000000L);
            l0 l0Var22 = k.f4144n;
            hashMap2.put(2, (Long) l0Var22.get(iArr[0]));
            hashMap2.put(3, (Long) k.f4145o.get(iArr[1]));
            hashMap2.put(4, (Long) k.f4146p.get(iArr[2]));
            hashMap2.put(5, (Long) k.f4147q.get(iArr[3]));
            hashMap2.put(10, (Long) k.r.get(iArr[4]));
            hashMap2.put(9, (Long) k.f4148s.get(iArr[5]));
            hashMap2.put(7, (Long) l0Var22.get(iArr[0]));
            this.f4163b = hashMap2;
            this.f4164c = 2000;
            this.f4165d = c9.b.f5126a;
            this.f4166e = true;
        }
    }

    public k(Context context, HashMap hashMap, int i6, c9.s sVar, boolean z10) {
        c9.n nVar;
        this.f4150a = com.google.common.collect.t.a(hashMap);
        this.f4152c = new s(i6);
        this.f4153d = sVar;
        this.f4154e = z10;
        if (context != null) {
            synchronized (c9.n.class) {
                if (c9.n.f5179e == null) {
                    c9.n.f5179e = new c9.n(context);
                }
                nVar = c9.n.f5179e;
            }
            int b10 = nVar.b();
            this.f4157i = b10;
            this.f4160l = h(b10);
            n.a aVar = new n.a() { // from class: b9.j
                @Override // c9.n.a
                public final void a(int i10) {
                    int i11;
                    k kVar = k.this;
                    synchronized (kVar) {
                        int i12 = kVar.f4157i;
                        if (i12 == 0 || kVar.f4154e) {
                            if (i12 != i10) {
                                kVar.f4157i = i10;
                                if (i10 != 1 && i10 != 0 && i10 != 8) {
                                    kVar.f4160l = kVar.h(i10);
                                    long d10 = kVar.f4153d.d();
                                    if (kVar.f > 0) {
                                        i11 = (int) (d10 - kVar.f4155g);
                                    } else {
                                        i11 = 0;
                                    }
                                    kVar.i(i11, kVar.f4156h, kVar.f4160l);
                                    kVar.f4155g = d10;
                                    kVar.f4156h = 0L;
                                    kVar.f4159k = 0L;
                                    kVar.f4158j = 0L;
                                    s sVar2 = kVar.f4152c;
                                    sVar2.f4204b.clear();
                                    sVar2.f4206d = -1;
                                    sVar2.f4207e = 0;
                                    sVar2.f = 0;
                                }
                            }
                        }
                    }
                }
            };
            CopyOnWriteArrayList<WeakReference<n.a>> copyOnWriteArrayList = nVar.f5181b;
            Iterator<WeakReference<n.a>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference<n.a> next = it.next();
                if (next.get() == null) {
                    copyOnWriteArrayList.remove(next);
                }
            }
            copyOnWriteArrayList.add(new WeakReference<>(aVar));
            nVar.f5180a.post(new q7.f(nVar, 5, aVar));
            return;
        }
        this.f4157i = 0;
        this.f4160l = h(0);
    }

    @Override // b9.u
    public final synchronized void a(h hVar, boolean z10, int i6) {
        boolean z11;
        boolean z12 = false;
        if (z10) {
            if ((hVar.f4135i & 8) == 8) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                z12 = true;
            }
        }
        if (!z12) {
            return;
        }
        this.f4156h += i6;
    }

    @Override // b9.b
    public final void c(Handler handler, b.a aVar) {
        aVar.getClass();
        b.a.C0079a c0079a = this.f4151b;
        c0079a.getClass();
        c0079a.a(aVar);
        c0079a.f4111a.add(new b.a.C0079a.C0080a(handler, aVar));
    }

    @Override // b9.b
    public final void e(p7.n nVar) {
        this.f4151b.a(nVar);
    }

    @Override // b9.u
    public final synchronized void f(h hVar, boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (z10) {
            if ((hVar.f4135i & 8) == 8) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                z12 = true;
            }
        }
        if (!z12) {
            return;
        }
        if (this.f == 0) {
            this.f4155g = this.f4153d.d();
        }
        this.f++;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0016 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0018 A[Catch: all -> 0x007b, TRY_ENTER, TryCatch #0 {, blocks: (B:5:0x0005, B:16:0x0018, B:19:0x001d, B:21:0x003a, B:23:0x0054, B:26:0x0066, B:25:0x005d, B:27:0x0074), top: B:33:0x0005 }] */
    @Override // b9.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void g(h hVar, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13 = false;
        if (z10) {
            if ((hVar.f4135i & 8) == 8) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                z12 = true;
                if (z12) {
                    return;
                }
                if (this.f > 0) {
                    z13 = true;
                }
                sc.b.C(z13);
                long d10 = this.f4153d.d();
                int i6 = (int) (d10 - this.f4155g);
                this.f4158j += i6;
                long j10 = this.f4159k;
                long j11 = this.f4156h;
                this.f4159k = j10 + j11;
                if (i6 > 0) {
                    this.f4152c.a((((float) j11) * 8000.0f) / i6, (int) Math.sqrt(j11));
                    if (this.f4158j >= 2000 || this.f4159k >= 524288) {
                        this.f4160l = this.f4152c.b();
                    }
                    i(i6, this.f4156h, this.f4160l);
                    this.f4155g = d10;
                    this.f4156h = 0L;
                }
                this.f--;
                return;
            }
        }
        z12 = false;
        if (z12) {
        }
    }

    public final long h(int i6) {
        Integer valueOf = Integer.valueOf(i6);
        com.google.common.collect.t<Integer, Long> tVar = this.f4150a;
        Long l2 = tVar.get(valueOf);
        if (l2 == null) {
            l2 = tVar.get(0);
        }
        if (l2 == null) {
            l2 = 1000000L;
        }
        return l2.longValue();
    }

    public final void i(int i6, long j10, long j11) {
        if (i6 == 0 && j10 == 0 && j11 == this.f4161m) {
            return;
        }
        this.f4161m = j11;
        Iterator<b.a.C0079a.C0080a> it = this.f4151b.f4111a.iterator();
        while (it.hasNext()) {
            b.a.C0079a.C0080a next = it.next();
            if (!next.f4114c) {
                next.f4112a.post(new q7.l(next, i6, j10, j11, 1));
            }
        }
    }

    @Override // b9.u
    public final void b() {
    }

    @Override // b9.b
    public final k d() {
        return this;
    }
}
