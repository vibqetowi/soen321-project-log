package cm;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.widget.SwitchCompat;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.AddCustomGoalsActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f5314u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ g f5315v;

    public /* synthetic */ c(g gVar, int i6) {
        this.f5314u = i6;
        this.f5315v = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a6 A[Catch: Exception -> 0x04b0, TryCatch #0 {Exception -> 0x04b0, blocks: (B:6:0x001f, B:23:0x0055, B:27:0x0062, B:29:0x0068, B:37:0x0083, B:39:0x008b, B:45:0x0097, B:47:0x00a8, B:48:0x00b7, B:50:0x00bf, B:51:0x00c4, B:52:0x00de, B:55:0x00e8, B:57:0x00f6, B:59:0x0102, B:61:0x0108, B:63:0x0115, B:68:0x0120, B:70:0x012b, B:71:0x012f, B:74:0x0165, B:76:0x0171, B:78:0x0182, B:80:0x018a, B:82:0x0193, B:84:0x0199, B:86:0x01a7, B:87:0x01b1, B:89:0x01cb, B:95:0x01d7, B:96:0x01f1, B:98:0x01f6, B:100:0x0253, B:104:0x0272, B:116:0x0296, B:143:0x030d, B:140:0x02f6, B:142:0x02fd, B:124:0x02bd, B:126:0x02c4, B:127:0x02d2, B:137:0x02ed, B:119:0x02a6, B:121:0x02ac, B:112:0x028a, B:107:0x027e, B:145:0x032a, B:147:0x0392, B:148:0x03e5, B:152:0x0402, B:164:0x0426, B:191:0x049e, B:188:0x0484, B:190:0x048b, B:172:0x044b, B:174:0x0452, B:175:0x0462, B:185:0x047d, B:167:0x0434, B:169:0x043a, B:160:0x041a, B:155:0x040e, B:36:0x007e, B:33:0x0073, B:35:0x0079, B:19:0x004b, B:14:0x003f, B:9:0x0033), top: B:237:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02bd A[Catch: Exception -> 0x04b0, TryCatch #0 {Exception -> 0x04b0, blocks: (B:6:0x001f, B:23:0x0055, B:27:0x0062, B:29:0x0068, B:37:0x0083, B:39:0x008b, B:45:0x0097, B:47:0x00a8, B:48:0x00b7, B:50:0x00bf, B:51:0x00c4, B:52:0x00de, B:55:0x00e8, B:57:0x00f6, B:59:0x0102, B:61:0x0108, B:63:0x0115, B:68:0x0120, B:70:0x012b, B:71:0x012f, B:74:0x0165, B:76:0x0171, B:78:0x0182, B:80:0x018a, B:82:0x0193, B:84:0x0199, B:86:0x01a7, B:87:0x01b1, B:89:0x01cb, B:95:0x01d7, B:96:0x01f1, B:98:0x01f6, B:100:0x0253, B:104:0x0272, B:116:0x0296, B:143:0x030d, B:140:0x02f6, B:142:0x02fd, B:124:0x02bd, B:126:0x02c4, B:127:0x02d2, B:137:0x02ed, B:119:0x02a6, B:121:0x02ac, B:112:0x028a, B:107:0x027e, B:145:0x032a, B:147:0x0392, B:148:0x03e5, B:152:0x0402, B:164:0x0426, B:191:0x049e, B:188:0x0484, B:190:0x048b, B:172:0x044b, B:174:0x0452, B:175:0x0462, B:185:0x047d, B:167:0x0434, B:169:0x043a, B:160:0x041a, B:155:0x040e, B:36:0x007e, B:33:0x0073, B:35:0x0079, B:19:0x004b, B:14:0x003f, B:9:0x0033), top: B:237:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02fd A[Catch: Exception -> 0x04b0, TryCatch #0 {Exception -> 0x04b0, blocks: (B:6:0x001f, B:23:0x0055, B:27:0x0062, B:29:0x0068, B:37:0x0083, B:39:0x008b, B:45:0x0097, B:47:0x00a8, B:48:0x00b7, B:50:0x00bf, B:51:0x00c4, B:52:0x00de, B:55:0x00e8, B:57:0x00f6, B:59:0x0102, B:61:0x0108, B:63:0x0115, B:68:0x0120, B:70:0x012b, B:71:0x012f, B:74:0x0165, B:76:0x0171, B:78:0x0182, B:80:0x018a, B:82:0x0193, B:84:0x0199, B:86:0x01a7, B:87:0x01b1, B:89:0x01cb, B:95:0x01d7, B:96:0x01f1, B:98:0x01f6, B:100:0x0253, B:104:0x0272, B:116:0x0296, B:143:0x030d, B:140:0x02f6, B:142:0x02fd, B:124:0x02bd, B:126:0x02c4, B:127:0x02d2, B:137:0x02ed, B:119:0x02a6, B:121:0x02ac, B:112:0x028a, B:107:0x027e, B:145:0x032a, B:147:0x0392, B:148:0x03e5, B:152:0x0402, B:164:0x0426, B:191:0x049e, B:188:0x0484, B:190:0x048b, B:172:0x044b, B:174:0x0452, B:175:0x0462, B:185:0x047d, B:167:0x0434, B:169:0x043a, B:160:0x041a, B:155:0x040e, B:36:0x007e, B:33:0x0073, B:35:0x0079, B:19:0x004b, B:14:0x003f, B:9:0x0033), top: B:237:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0434 A[Catch: Exception -> 0x04b0, TryCatch #0 {Exception -> 0x04b0, blocks: (B:6:0x001f, B:23:0x0055, B:27:0x0062, B:29:0x0068, B:37:0x0083, B:39:0x008b, B:45:0x0097, B:47:0x00a8, B:48:0x00b7, B:50:0x00bf, B:51:0x00c4, B:52:0x00de, B:55:0x00e8, B:57:0x00f6, B:59:0x0102, B:61:0x0108, B:63:0x0115, B:68:0x0120, B:70:0x012b, B:71:0x012f, B:74:0x0165, B:76:0x0171, B:78:0x0182, B:80:0x018a, B:82:0x0193, B:84:0x0199, B:86:0x01a7, B:87:0x01b1, B:89:0x01cb, B:95:0x01d7, B:96:0x01f1, B:98:0x01f6, B:100:0x0253, B:104:0x0272, B:116:0x0296, B:143:0x030d, B:140:0x02f6, B:142:0x02fd, B:124:0x02bd, B:126:0x02c4, B:127:0x02d2, B:137:0x02ed, B:119:0x02a6, B:121:0x02ac, B:112:0x028a, B:107:0x027e, B:145:0x032a, B:147:0x0392, B:148:0x03e5, B:152:0x0402, B:164:0x0426, B:191:0x049e, B:188:0x0484, B:190:0x048b, B:172:0x044b, B:174:0x0452, B:175:0x0462, B:185:0x047d, B:167:0x0434, B:169:0x043a, B:160:0x041a, B:155:0x040e, B:36:0x007e, B:33:0x0073, B:35:0x0079, B:19:0x004b, B:14:0x003f, B:9:0x0033), top: B:237:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x044a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x044b A[Catch: Exception -> 0x04b0, TryCatch #0 {Exception -> 0x04b0, blocks: (B:6:0x001f, B:23:0x0055, B:27:0x0062, B:29:0x0068, B:37:0x0083, B:39:0x008b, B:45:0x0097, B:47:0x00a8, B:48:0x00b7, B:50:0x00bf, B:51:0x00c4, B:52:0x00de, B:55:0x00e8, B:57:0x00f6, B:59:0x0102, B:61:0x0108, B:63:0x0115, B:68:0x0120, B:70:0x012b, B:71:0x012f, B:74:0x0165, B:76:0x0171, B:78:0x0182, B:80:0x018a, B:82:0x0193, B:84:0x0199, B:86:0x01a7, B:87:0x01b1, B:89:0x01cb, B:95:0x01d7, B:96:0x01f1, B:98:0x01f6, B:100:0x0253, B:104:0x0272, B:116:0x0296, B:143:0x030d, B:140:0x02f6, B:142:0x02fd, B:124:0x02bd, B:126:0x02c4, B:127:0x02d2, B:137:0x02ed, B:119:0x02a6, B:121:0x02ac, B:112:0x028a, B:107:0x027e, B:145:0x032a, B:147:0x0392, B:148:0x03e5, B:152:0x0402, B:164:0x0426, B:191:0x049e, B:188:0x0484, B:190:0x048b, B:172:0x044b, B:174:0x0452, B:175:0x0462, B:185:0x047d, B:167:0x0434, B:169:0x043a, B:160:0x041a, B:155:0x040e, B:36:0x007e, B:33:0x0073, B:35:0x0079, B:19:0x004b, B:14:0x003f, B:9:0x0033), top: B:237:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x048b A[Catch: Exception -> 0x04b0, TryCatch #0 {Exception -> 0x04b0, blocks: (B:6:0x001f, B:23:0x0055, B:27:0x0062, B:29:0x0068, B:37:0x0083, B:39:0x008b, B:45:0x0097, B:47:0x00a8, B:48:0x00b7, B:50:0x00bf, B:51:0x00c4, B:52:0x00de, B:55:0x00e8, B:57:0x00f6, B:59:0x0102, B:61:0x0108, B:63:0x0115, B:68:0x0120, B:70:0x012b, B:71:0x012f, B:74:0x0165, B:76:0x0171, B:78:0x0182, B:80:0x018a, B:82:0x0193, B:84:0x0199, B:86:0x01a7, B:87:0x01b1, B:89:0x01cb, B:95:0x01d7, B:96:0x01f1, B:98:0x01f6, B:100:0x0253, B:104:0x0272, B:116:0x0296, B:143:0x030d, B:140:0x02f6, B:142:0x02fd, B:124:0x02bd, B:126:0x02c4, B:127:0x02d2, B:137:0x02ed, B:119:0x02a6, B:121:0x02ac, B:112:0x028a, B:107:0x027e, B:145:0x032a, B:147:0x0392, B:148:0x03e5, B:152:0x0402, B:164:0x0426, B:191:0x049e, B:188:0x0484, B:190:0x048b, B:172:0x044b, B:174:0x0452, B:175:0x0462, B:185:0x047d, B:167:0x0434, B:169:0x043a, B:160:0x041a, B:155:0x040e, B:36:0x007e, B:33:0x0073, B:35:0x0079, B:19:0x004b, B:14:0x003f, B:9:0x0033), top: B:237:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062 A[Catch: Exception -> 0x04b0, TRY_ENTER, TryCatch #0 {Exception -> 0x04b0, blocks: (B:6:0x001f, B:23:0x0055, B:27:0x0062, B:29:0x0068, B:37:0x0083, B:39:0x008b, B:45:0x0097, B:47:0x00a8, B:48:0x00b7, B:50:0x00bf, B:51:0x00c4, B:52:0x00de, B:55:0x00e8, B:57:0x00f6, B:59:0x0102, B:61:0x0108, B:63:0x0115, B:68:0x0120, B:70:0x012b, B:71:0x012f, B:74:0x0165, B:76:0x0171, B:78:0x0182, B:80:0x018a, B:82:0x0193, B:84:0x0199, B:86:0x01a7, B:87:0x01b1, B:89:0x01cb, B:95:0x01d7, B:96:0x01f1, B:98:0x01f6, B:100:0x0253, B:104:0x0272, B:116:0x0296, B:143:0x030d, B:140:0x02f6, B:142:0x02fd, B:124:0x02bd, B:126:0x02c4, B:127:0x02d2, B:137:0x02ed, B:119:0x02a6, B:121:0x02ac, B:112:0x028a, B:107:0x027e, B:145:0x032a, B:147:0x0392, B:148:0x03e5, B:152:0x0402, B:164:0x0426, B:191:0x049e, B:188:0x0484, B:190:0x048b, B:172:0x044b, B:174:0x0452, B:175:0x0462, B:185:0x047d, B:167:0x0434, B:169:0x043a, B:160:0x041a, B:155:0x040e, B:36:0x007e, B:33:0x0073, B:35:0x0079, B:19:0x004b, B:14:0x003f, B:9:0x0033), top: B:237:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073 A[Catch: Exception -> 0x04b0, TryCatch #0 {Exception -> 0x04b0, blocks: (B:6:0x001f, B:23:0x0055, B:27:0x0062, B:29:0x0068, B:37:0x0083, B:39:0x008b, B:45:0x0097, B:47:0x00a8, B:48:0x00b7, B:50:0x00bf, B:51:0x00c4, B:52:0x00de, B:55:0x00e8, B:57:0x00f6, B:59:0x0102, B:61:0x0108, B:63:0x0115, B:68:0x0120, B:70:0x012b, B:71:0x012f, B:74:0x0165, B:76:0x0171, B:78:0x0182, B:80:0x018a, B:82:0x0193, B:84:0x0199, B:86:0x01a7, B:87:0x01b1, B:89:0x01cb, B:95:0x01d7, B:96:0x01f1, B:98:0x01f6, B:100:0x0253, B:104:0x0272, B:116:0x0296, B:143:0x030d, B:140:0x02f6, B:142:0x02fd, B:124:0x02bd, B:126:0x02c4, B:127:0x02d2, B:137:0x02ed, B:119:0x02a6, B:121:0x02ac, B:112:0x028a, B:107:0x027e, B:145:0x032a, B:147:0x0392, B:148:0x03e5, B:152:0x0402, B:164:0x0426, B:191:0x049e, B:188:0x0484, B:190:0x048b, B:172:0x044b, B:174:0x0452, B:175:0x0462, B:185:0x047d, B:167:0x0434, B:169:0x043a, B:160:0x041a, B:155:0x040e, B:36:0x007e, B:33:0x0073, B:35:0x0079, B:19:0x004b, B:14:0x003f, B:9:0x0033), top: B:237:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b A[Catch: Exception -> 0x04b0, TryCatch #0 {Exception -> 0x04b0, blocks: (B:6:0x001f, B:23:0x0055, B:27:0x0062, B:29:0x0068, B:37:0x0083, B:39:0x008b, B:45:0x0097, B:47:0x00a8, B:48:0x00b7, B:50:0x00bf, B:51:0x00c4, B:52:0x00de, B:55:0x00e8, B:57:0x00f6, B:59:0x0102, B:61:0x0108, B:63:0x0115, B:68:0x0120, B:70:0x012b, B:71:0x012f, B:74:0x0165, B:76:0x0171, B:78:0x0182, B:80:0x018a, B:82:0x0193, B:84:0x0199, B:86:0x01a7, B:87:0x01b1, B:89:0x01cb, B:95:0x01d7, B:96:0x01f1, B:98:0x01f6, B:100:0x0253, B:104:0x0272, B:116:0x0296, B:143:0x030d, B:140:0x02f6, B:142:0x02fd, B:124:0x02bd, B:126:0x02c4, B:127:0x02d2, B:137:0x02ed, B:119:0x02a6, B:121:0x02ac, B:112:0x028a, B:107:0x027e, B:145:0x032a, B:147:0x0392, B:148:0x03e5, B:152:0x0402, B:164:0x0426, B:191:0x049e, B:188:0x0484, B:190:0x048b, B:172:0x044b, B:174:0x0452, B:175:0x0462, B:185:0x047d, B:167:0x0434, B:169:0x043a, B:160:0x041a, B:155:0x040e, B:36:0x007e, B:33:0x0073, B:35:0x0079, B:19:0x004b, B:14:0x003f, B:9:0x0033), top: B:237:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097 A[Catch: Exception -> 0x04b0, TryCatch #0 {Exception -> 0x04b0, blocks: (B:6:0x001f, B:23:0x0055, B:27:0x0062, B:29:0x0068, B:37:0x0083, B:39:0x008b, B:45:0x0097, B:47:0x00a8, B:48:0x00b7, B:50:0x00bf, B:51:0x00c4, B:52:0x00de, B:55:0x00e8, B:57:0x00f6, B:59:0x0102, B:61:0x0108, B:63:0x0115, B:68:0x0120, B:70:0x012b, B:71:0x012f, B:74:0x0165, B:76:0x0171, B:78:0x0182, B:80:0x018a, B:82:0x0193, B:84:0x0199, B:86:0x01a7, B:87:0x01b1, B:89:0x01cb, B:95:0x01d7, B:96:0x01f1, B:98:0x01f6, B:100:0x0253, B:104:0x0272, B:116:0x0296, B:143:0x030d, B:140:0x02f6, B:142:0x02fd, B:124:0x02bd, B:126:0x02c4, B:127:0x02d2, B:137:0x02ed, B:119:0x02a6, B:121:0x02ac, B:112:0x028a, B:107:0x027e, B:145:0x032a, B:147:0x0392, B:148:0x03e5, B:152:0x0402, B:164:0x0426, B:191:0x049e, B:188:0x0484, B:190:0x048b, B:172:0x044b, B:174:0x0452, B:175:0x0462, B:185:0x047d, B:167:0x0434, B:169:0x043a, B:160:0x041a, B:155:0x040e, B:36:0x007e, B:33:0x0073, B:35:0x0079, B:19:0x004b, B:14:0x003f, B:9:0x0033), top: B:237:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0120 A[Catch: Exception -> 0x04b0, TryCatch #0 {Exception -> 0x04b0, blocks: (B:6:0x001f, B:23:0x0055, B:27:0x0062, B:29:0x0068, B:37:0x0083, B:39:0x008b, B:45:0x0097, B:47:0x00a8, B:48:0x00b7, B:50:0x00bf, B:51:0x00c4, B:52:0x00de, B:55:0x00e8, B:57:0x00f6, B:59:0x0102, B:61:0x0108, B:63:0x0115, B:68:0x0120, B:70:0x012b, B:71:0x012f, B:74:0x0165, B:76:0x0171, B:78:0x0182, B:80:0x018a, B:82:0x0193, B:84:0x0199, B:86:0x01a7, B:87:0x01b1, B:89:0x01cb, B:95:0x01d7, B:96:0x01f1, B:98:0x01f6, B:100:0x0253, B:104:0x0272, B:116:0x0296, B:143:0x030d, B:140:0x02f6, B:142:0x02fd, B:124:0x02bd, B:126:0x02c4, B:127:0x02d2, B:137:0x02ed, B:119:0x02a6, B:121:0x02ac, B:112:0x028a, B:107:0x027e, B:145:0x032a, B:147:0x0392, B:148:0x03e5, B:152:0x0402, B:164:0x0426, B:191:0x049e, B:188:0x0484, B:190:0x048b, B:172:0x044b, B:174:0x0452, B:175:0x0462, B:185:0x047d, B:167:0x0434, B:169:0x043a, B:160:0x041a, B:155:0x040e, B:36:0x007e, B:33:0x0073, B:35:0x0079, B:19:0x004b, B:14:0x003f, B:9:0x0033), top: B:237:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d7 A[Catch: Exception -> 0x04b0, TryCatch #0 {Exception -> 0x04b0, blocks: (B:6:0x001f, B:23:0x0055, B:27:0x0062, B:29:0x0068, B:37:0x0083, B:39:0x008b, B:45:0x0097, B:47:0x00a8, B:48:0x00b7, B:50:0x00bf, B:51:0x00c4, B:52:0x00de, B:55:0x00e8, B:57:0x00f6, B:59:0x0102, B:61:0x0108, B:63:0x0115, B:68:0x0120, B:70:0x012b, B:71:0x012f, B:74:0x0165, B:76:0x0171, B:78:0x0182, B:80:0x018a, B:82:0x0193, B:84:0x0199, B:86:0x01a7, B:87:0x01b1, B:89:0x01cb, B:95:0x01d7, B:96:0x01f1, B:98:0x01f6, B:100:0x0253, B:104:0x0272, B:116:0x0296, B:143:0x030d, B:140:0x02f6, B:142:0x02fd, B:124:0x02bd, B:126:0x02c4, B:127:0x02d2, B:137:0x02ed, B:119:0x02a6, B:121:0x02ac, B:112:0x028a, B:107:0x027e, B:145:0x032a, B:147:0x0392, B:148:0x03e5, B:152:0x0402, B:164:0x0426, B:191:0x049e, B:188:0x0484, B:190:0x048b, B:172:0x044b, B:174:0x0452, B:175:0x0462, B:185:0x047d, B:167:0x0434, B:169:0x043a, B:160:0x041a, B:155:0x040e, B:36:0x007e, B:33:0x0073, B:35:0x0079, B:19:0x004b, B:14:0x003f, B:9:0x0033), top: B:237:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f6 A[Catch: Exception -> 0x04b0, TryCatch #0 {Exception -> 0x04b0, blocks: (B:6:0x001f, B:23:0x0055, B:27:0x0062, B:29:0x0068, B:37:0x0083, B:39:0x008b, B:45:0x0097, B:47:0x00a8, B:48:0x00b7, B:50:0x00bf, B:51:0x00c4, B:52:0x00de, B:55:0x00e8, B:57:0x00f6, B:59:0x0102, B:61:0x0108, B:63:0x0115, B:68:0x0120, B:70:0x012b, B:71:0x012f, B:74:0x0165, B:76:0x0171, B:78:0x0182, B:80:0x018a, B:82:0x0193, B:84:0x0199, B:86:0x01a7, B:87:0x01b1, B:89:0x01cb, B:95:0x01d7, B:96:0x01f1, B:98:0x01f6, B:100:0x0253, B:104:0x0272, B:116:0x0296, B:143:0x030d, B:140:0x02f6, B:142:0x02fd, B:124:0x02bd, B:126:0x02c4, B:127:0x02d2, B:137:0x02ed, B:119:0x02a6, B:121:0x02ac, B:112:0x028a, B:107:0x027e, B:145:0x032a, B:147:0x0392, B:148:0x03e5, B:152:0x0402, B:164:0x0426, B:191:0x049e, B:188:0x0484, B:190:0x048b, B:172:0x044b, B:174:0x0452, B:175:0x0462, B:185:0x047d, B:167:0x0434, B:169:0x043a, B:160:0x041a, B:155:0x040e, B:36:0x007e, B:33:0x0073, B:35:0x0079, B:19:0x004b, B:14:0x003f, B:9:0x0033), top: B:237:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024d  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        String str;
        Integer num;
        Calendar calendar;
        Calendar calendar2;
        long timeInMillis;
        String str2;
        boolean z10;
        boolean z11;
        String str3;
        Integer num2;
        String str4;
        Iterator it;
        String str5;
        String str6;
        String str7;
        boolean z12;
        long j10;
        Calendar calendar3;
        Calendar calendar4;
        ArrayList<String> arrayList;
        String str8;
        boolean z13;
        Integer num3;
        String str9;
        Integer num4;
        Calendar calendar5;
        String str10;
        boolean z14;
        String str11;
        boolean z15;
        String str12;
        boolean z16;
        int i6 = this.f5314u;
        String str13 = "";
        g this$0 = this.f5315v;
        switch (i6) {
            case 0:
                int i10 = g.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ((RobertoEditText) this$0._$_findCachedViewById(R.id.editTextGoalName)).setText("");
                this$0.Y(false);
                return;
            case 1:
                int i11 = g.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.K().finish();
                return;
            case 2:
                int i12 = g.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.Y(true);
                return;
            case 3:
                int i13 = g.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    this$0.K().finish();
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f5336u, e10);
                    return;
                }
            case 4:
                int i14 = g.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    boolean isChecked = ((SwitchCompat) this$0._$_findCachedViewById(R.id.notificationToggle)).isChecked();
                    Integer num5 = this$0.K().G;
                    if (num5 != null && num5.intValue() == 0) {
                        str = Constants.GOAL_TYPE_DAILY_ACTIVITY;
                        num = this$0.K().G;
                        calendar = this$0.A;
                        calendar2 = this$0.f5341z;
                        if (num != null && num.intValue() == 0) {
                            timeInMillis = this$0.f5340y.getTimeInMillis();
                        } else {
                            if (num != null && num.intValue() == 1) {
                                timeInMillis = calendar2.getTimeInMillis();
                            }
                            timeInMillis = calendar.getTimeInMillis();
                        }
                        long j11 = timeInMillis;
                        str2 = this$0.K().F;
                        if (str2 != null && !gv.n.B0(str2)) {
                            z10 = false;
                            if (!z10) {
                                Toast.makeText(this$0.K(), "Goal name cannot be empty!", 0).show();
                                return;
                            } else if (str == null) {
                                Toast.makeText(this$0.K(), "Please select a goal type", 0).show();
                                return;
                            } else if (this$0.K().D) {
                                this$0.J(str, j11, isChecked);
                                return;
                            } else {
                                FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                                ArrayList<Goal> userGoals = firebasePersistence.getUser().getUserGoals();
                                kotlin.jvm.internal.i.f(userGoals, "user.userGoals");
                                ArrayList arrayList2 = new ArrayList();
                                Iterator<T> it2 = userGoals.iterator();
                                while (true) {
                                    Calendar calendar6 = calendar;
                                    if (it2.hasNext()) {
                                        Object next = it2.next();
                                        Goal goal = (Goal) next;
                                        if (!goal.isVisible() && kotlin.jvm.internal.i.b(goal.getCourseId(), "independent")) {
                                            String goalId = goal.getGoalId();
                                            if (goalId != null) {
                                                str11 = goalId.substring(0, 7);
                                                kotlin.jvm.internal.i.f(str11, "this as java.lang.String…ing(startIndex, endIndex)");
                                            } else {
                                                str11 = null;
                                            }
                                            if (kotlin.jvm.internal.i.b(str11, "custom_")) {
                                                z14 = true;
                                                if (!z14) {
                                                    arrayList2.add(next);
                                                }
                                                calendar = calendar6;
                                            }
                                        }
                                        z14 = false;
                                        if (!z14) {
                                        }
                                        calendar = calendar6;
                                    } else {
                                        Iterator it3 = arrayList2.iterator();
                                        while (true) {
                                            String str14 = str13;
                                            Calendar calendar7 = calendar2;
                                            if (it3.hasNext()) {
                                                Goal goal2 = (Goal) it3.next();
                                                String goalName = goal2.getGoalName();
                                                if (goalName != null) {
                                                    it = it3;
                                                    str6 = goalName.toLowerCase();
                                                    kotlin.jvm.internal.i.f(str6, "this as java.lang.String).toLowerCase()");
                                                    str5 = "day";
                                                } else {
                                                    it = it3;
                                                    str5 = "day";
                                                    str6 = null;
                                                }
                                                String str15 = this$0.K().F;
                                                if (str15 != null) {
                                                    str7 = str15.toLowerCase();
                                                    kotlin.jvm.internal.i.f(str7, "this as java.lang.String).toLowerCase()");
                                                } else {
                                                    str7 = null;
                                                }
                                                if (kotlin.jvm.internal.i.b(str6, str7)) {
                                                    goal2.setVisible(true);
                                                    if (!kotlin.jvm.internal.i.b(goal2.getType(), str)) {
                                                        goal2.getTrackList().clear();
                                                        goal2.setType(str);
                                                    }
                                                    goal2.setNotificationScheduled(isChecked);
                                                    long j12 = 1000;
                                                    goal2.getScheduledDate().setTime(j11 / j12);
                                                    String goalId2 = goal2.getGoalId();
                                                    if (goalId2 != null && !gv.n.B0(goalId2)) {
                                                        z12 = false;
                                                        if (z12) {
                                                            goal2.setGoalId("custom_" + Calendar.getInstance().getTimeInMillis());
                                                        }
                                                        firebasePersistence.updateUserOnFirebase();
                                                        if (!isChecked) {
                                                            Utils utils = Utils.INSTANCE;
                                                            AddCustomGoalsActivity K = this$0.K();
                                                            String goalId3 = goal2.getGoalId();
                                                            kotlin.jvm.internal.i.d(goalId3);
                                                            String str16 = this$0.K().F;
                                                            kotlin.jvm.internal.i.d(str16);
                                                            String string = this$0.getString(R.string.customGoalNotifiationHeader);
                                                            kotlin.jvm.internal.i.f(string, "getString(R.string.customGoalNotifiationHeader)");
                                                            String str17 = this$0.K().F;
                                                            kotlin.jvm.internal.i.d(str17);
                                                            String string2 = this$0.getString(R.string.customGoalNotifiationBody, str17);
                                                            kotlin.jvm.internal.i.f(string2, "getString(R.string.custo…ody, activity.goalName!!)");
                                                            j10 = j11;
                                                            calendar4 = calendar7;
                                                            calendar3 = calendar6;
                                                            utils.updateV3ActivityNotification(K, true, j10, str, goalId3, str16, "independent", string, string2);
                                                        } else {
                                                            j10 = j11;
                                                            calendar3 = calendar6;
                                                            calendar4 = calendar7;
                                                        }
                                                        Bundle bundle = new Bundle();
                                                        arrayList = this$0.K().f10298y;
                                                        str8 = this$0.K().F;
                                                        kotlin.jvm.internal.i.d(str8);
                                                        if (arrayList.contains(str8)) {
                                                            z13 = true;
                                                        } else {
                                                            z13 = false;
                                                        }
                                                        bundle.putBoolean("custom_entry", z13);
                                                        num3 = this$0.K().G;
                                                        if (num3 != null && num3.intValue() == 0) {
                                                            str9 = "daily";
                                                            bundle.putString("frequency", str9);
                                                            num4 = this$0.K().G;
                                                            if (num4 != null && num4.intValue() == 0) {
                                                                bundle.putInt("hour", this$0.f5340y.get(11));
                                                            } else {
                                                                if (num4 == null && num4.intValue() == 1) {
                                                                    calendar5 = calendar4;
                                                                    bundle.putInt("hour", calendar5.get(11));
                                                                    switch (calendar5.get(7)) {
                                                                        case 1:
                                                                            str10 = "Sunday";
                                                                            break;
                                                                        case 2:
                                                                            str10 = "Monday";
                                                                            break;
                                                                        case 3:
                                                                            str10 = "Tuesday";
                                                                            break;
                                                                        case 4:
                                                                            str10 = "Wednesday";
                                                                            break;
                                                                        case 5:
                                                                            str10 = "Thursday";
                                                                            break;
                                                                        case 6:
                                                                            str10 = "Friday";
                                                                            break;
                                                                        case 7:
                                                                            str10 = "Saturday";
                                                                            break;
                                                                        default:
                                                                            str10 = str14;
                                                                            break;
                                                                    }
                                                                    bundle.putString(str5, str10);
                                                                }
                                                                if (num4.intValue() == 2) {
                                                                    bundle.putInt("hour", calendar3.get(11));
                                                                    bundle.putLong("date", j10 / j12);
                                                                }
                                                            }
                                                            bundle.putBoolean("reminder", isChecked);
                                                            gk.a.b(bundle, "custom_goal_added");
                                                            this$0.K().n0();
                                                            return;
                                                        }
                                                        if (num3.intValue() == 1) {
                                                            str9 = "weekly";
                                                            bundle.putString("frequency", str9);
                                                            num4 = this$0.K().G;
                                                            if (num4 != null) {
                                                                bundle.putInt("hour", this$0.f5340y.get(11));
                                                                bundle.putBoolean("reminder", isChecked);
                                                                gk.a.b(bundle, "custom_goal_added");
                                                                this$0.K().n0();
                                                                return;
                                                            }
                                                            if (num4 == null) {
                                                                calendar5 = calendar4;
                                                                bundle.putInt("hour", calendar5.get(11));
                                                                switch (calendar5.get(7)) {
                                                                }
                                                                bundle.putString(str5, str10);
                                                                bundle.putBoolean("reminder", isChecked);
                                                                gk.a.b(bundle, "custom_goal_added");
                                                                this$0.K().n0();
                                                                return;
                                                            }
                                                            if (num4.intValue() == 2) {
                                                            }
                                                            bundle.putBoolean("reminder", isChecked);
                                                            gk.a.b(bundle, "custom_goal_added");
                                                            this$0.K().n0();
                                                            return;
                                                        }
                                                        str9 = "one_time";
                                                        bundle.putString("frequency", str9);
                                                        num4 = this$0.K().G;
                                                        if (num4 != null) {
                                                        }
                                                        if (num4 == null) {
                                                        }
                                                        if (num4.intValue() == 2) {
                                                        }
                                                        bundle.putBoolean("reminder", isChecked);
                                                        gk.a.b(bundle, "custom_goal_added");
                                                        this$0.K().n0();
                                                        return;
                                                    }
                                                    z12 = true;
                                                    if (z12) {
                                                    }
                                                    firebasePersistence.updateUserOnFirebase();
                                                    if (!isChecked) {
                                                    }
                                                    Bundle bundle2 = new Bundle();
                                                    arrayList = this$0.K().f10298y;
                                                    str8 = this$0.K().F;
                                                    kotlin.jvm.internal.i.d(str8);
                                                    if (arrayList.contains(str8)) {
                                                    }
                                                    bundle2.putBoolean("custom_entry", z13);
                                                    num3 = this$0.K().G;
                                                    if (num3 != null) {
                                                        str9 = "daily";
                                                        bundle2.putString("frequency", str9);
                                                        num4 = this$0.K().G;
                                                        if (num4 != null) {
                                                        }
                                                        if (num4 == null) {
                                                        }
                                                        if (num4.intValue() == 2) {
                                                        }
                                                        bundle2.putBoolean("reminder", isChecked);
                                                        gk.a.b(bundle2, "custom_goal_added");
                                                        this$0.K().n0();
                                                        return;
                                                    }
                                                    if (num3.intValue() == 1) {
                                                    }
                                                    str9 = "one_time";
                                                    bundle2.putString("frequency", str9);
                                                    num4 = this$0.K().G;
                                                    if (num4 != null) {
                                                    }
                                                    if (num4 == null) {
                                                    }
                                                    if (num4.intValue() == 2) {
                                                    }
                                                    bundle2.putBoolean("reminder", isChecked);
                                                    gk.a.b(bundle2, "custom_goal_added");
                                                    this$0.K().n0();
                                                    return;
                                                }
                                                calendar2 = calendar7;
                                                it3 = it;
                                                str13 = str14;
                                            } else {
                                                String str18 = str;
                                                long timeInMillis2 = Calendar.getInstance().getTimeInMillis();
                                                FirebasePersistence.getInstance().addNewGoalBasic("custom_" + timeInMillis2, "independent", this$0.K().F, "independent", true, str18, "custom_goal", isChecked, j11);
                                                if (isChecked) {
                                                    Utils utils2 = Utils.INSTANCE;
                                                    AddCustomGoalsActivity K2 = this$0.K();
                                                    String str19 = "custom_" + timeInMillis2;
                                                    String str20 = this$0.K().F;
                                                    kotlin.jvm.internal.i.d(str20);
                                                    String string3 = this$0.getString(R.string.customGoalNotifiationHeader);
                                                    kotlin.jvm.internal.i.f(string3, "getString(R.string.customGoalNotifiationHeader)");
                                                    String str21 = this$0.K().F;
                                                    kotlin.jvm.internal.i.d(str21);
                                                    String string4 = this$0.getString(R.string.customGoalNotifiationBody, str21);
                                                    kotlin.jvm.internal.i.f(string4, "getString(R.string.custo…ody, activity.goalName!!)");
                                                    utils2.updateV3ActivityNotification(K2, true, j11, str18, str19, str20, "independent", string3, string4);
                                                }
                                                Bundle bundle3 = new Bundle();
                                                ArrayList<String> arrayList3 = this$0.K().f10298y;
                                                String str22 = this$0.K().F;
                                                kotlin.jvm.internal.i.d(str22);
                                                if (!arrayList3.contains(str22)) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                bundle3.putBoolean("custom_entry", z11);
                                                Integer num6 = this$0.K().G;
                                                if (num6 != null && num6.intValue() == 0) {
                                                    str3 = "daily";
                                                    bundle3.putString("frequency", str3);
                                                    num2 = this$0.K().G;
                                                    if (num2 != null && num2.intValue() == 0) {
                                                        bundle3.putInt("hour", this$0.f5340y.get(11));
                                                    } else {
                                                        if (num2 == null && num2.intValue() == 1) {
                                                            bundle3.putInt("hour", calendar7.get(11));
                                                            switch (calendar7.get(7)) {
                                                                case 1:
                                                                    str4 = "Sunday";
                                                                    break;
                                                                case 2:
                                                                    str4 = "Monday";
                                                                    break;
                                                                case 3:
                                                                    str4 = "Tuesday";
                                                                    break;
                                                                case 4:
                                                                    str4 = "Wednesday";
                                                                    break;
                                                                case 5:
                                                                    str4 = "Thursday";
                                                                    break;
                                                                case 6:
                                                                    str4 = "Friday";
                                                                    break;
                                                                case 7:
                                                                    str4 = "Saturday";
                                                                    break;
                                                                default:
                                                                    str4 = str14;
                                                                    break;
                                                            }
                                                            bundle3.putString("day", str4);
                                                        }
                                                        if (num2.intValue() == 2) {
                                                            bundle3.putInt("hour", calendar6.get(11));
                                                            bundle3.putLong("date", j11 / 1000);
                                                        }
                                                    }
                                                    bundle3.putBoolean("reminder", isChecked);
                                                    gk.a.b(bundle3, "custom_goal_added");
                                                    this$0.K().n0();
                                                    return;
                                                }
                                                if (num6.intValue() == 1) {
                                                    str3 = "weekly";
                                                    bundle3.putString("frequency", str3);
                                                    num2 = this$0.K().G;
                                                    if (num2 != null) {
                                                        bundle3.putInt("hour", this$0.f5340y.get(11));
                                                        bundle3.putBoolean("reminder", isChecked);
                                                        gk.a.b(bundle3, "custom_goal_added");
                                                        this$0.K().n0();
                                                        return;
                                                    }
                                                    if (num2 == null) {
                                                        bundle3.putInt("hour", calendar7.get(11));
                                                        switch (calendar7.get(7)) {
                                                        }
                                                        bundle3.putString("day", str4);
                                                        bundle3.putBoolean("reminder", isChecked);
                                                        gk.a.b(bundle3, "custom_goal_added");
                                                        this$0.K().n0();
                                                        return;
                                                    }
                                                    if (num2.intValue() == 2) {
                                                    }
                                                    bundle3.putBoolean("reminder", isChecked);
                                                    gk.a.b(bundle3, "custom_goal_added");
                                                    this$0.K().n0();
                                                    return;
                                                }
                                                str3 = "one_time";
                                                bundle3.putString("frequency", str3);
                                                num2 = this$0.K().G;
                                                if (num2 != null) {
                                                }
                                                if (num2 == null) {
                                                }
                                                if (num2.intValue() == 2) {
                                                }
                                                bundle3.putBoolean("reminder", isChecked);
                                                gk.a.b(bundle3, "custom_goal_added");
                                                this$0.K().n0();
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        z10 = true;
                        if (!z10) {
                        }
                    }
                    if (num5.intValue() == 1) {
                        str = Constants.GOAL_TYPE_ACTIVITY_WEEKLY;
                        num = this$0.K().G;
                        calendar = this$0.A;
                        calendar2 = this$0.f5341z;
                        if (num != null) {
                            timeInMillis = this$0.f5340y.getTimeInMillis();
                            long j112 = timeInMillis;
                            str2 = this$0.K().F;
                            if (str2 != null) {
                                z10 = false;
                                if (!z10) {
                                }
                            }
                            z10 = true;
                            if (!z10) {
                            }
                        }
                        if (num != null) {
                            timeInMillis = calendar2.getTimeInMillis();
                            long j1122 = timeInMillis;
                            str2 = this$0.K().F;
                            if (str2 != null) {
                            }
                            z10 = true;
                            if (!z10) {
                            }
                        }
                        timeInMillis = calendar.getTimeInMillis();
                        long j11222 = timeInMillis;
                        str2 = this$0.K().F;
                        if (str2 != null) {
                        }
                        z10 = true;
                        if (!z10) {
                        }
                    }
                    if (num5 != null && num5.intValue() == 2) {
                        str = Constants.GOAL_TYPE_ACTIVITY_ONCE;
                        num = this$0.K().G;
                        calendar = this$0.A;
                        calendar2 = this$0.f5341z;
                        if (num != null) {
                        }
                        if (num != null) {
                        }
                        timeInMillis = calendar.getTimeInMillis();
                        long j112222 = timeInMillis;
                        str2 = this$0.K().F;
                        if (str2 != null) {
                        }
                        z10 = true;
                        if (!z10) {
                        }
                    }
                    str = null;
                    num = this$0.K().G;
                    calendar = this$0.A;
                    calendar2 = this$0.f5341z;
                    if (num != null) {
                    }
                    if (num != null) {
                    }
                    timeInMillis = calendar.getTimeInMillis();
                    long j1122222 = timeInMillis;
                    str2 = this$0.K().F;
                    if (str2 != null) {
                    }
                    z10 = true;
                    if (!z10) {
                    }
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$0.f5336u, e11);
                    return;
                }
                break;
            default:
                int i15 = g.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                String valueOf = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.editTextGoalName)).getText());
                if (valueOf.length() == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (z15) {
                    Toast.makeText(this$0.K(), "The goal name cannot be empty!", 0).show();
                    return;
                } else if (valueOf.length() > 250) {
                    Toast.makeText(this$0.K(), "The goal name is too long!", 0).show();
                    return;
                } else {
                    ArrayList<Goal> arrayList4 = this$0.K().f10299z;
                    if (!(arrayList4 instanceof Collection) || !arrayList4.isEmpty()) {
                        Iterator<Goal> it4 = arrayList4.iterator();
                        while (it4.hasNext()) {
                            String goalName2 = it4.next().getGoalName();
                            if (goalName2 != null) {
                                str12 = goalName2.toLowerCase();
                                kotlin.jvm.internal.i.f(str12, "this as java.lang.String).toLowerCase()");
                            } else {
                                str12 = null;
                            }
                            String lowerCase = valueOf.toLowerCase();
                            kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
                            if (kotlin.jvm.internal.i.b(str12, lowerCase)) {
                                z16 = true;
                                if (!z16) {
                                    Toast.makeText(this$0.K(), "You've already added this goal.", 0).show();
                                    return;
                                }
                                this$0.M();
                                this$0.K().F = valueOf;
                                this$0.Y(false);
                                return;
                            }
                        }
                    }
                    z16 = false;
                    if (!z16) {
                    }
                }
                break;
        }
    }
}
