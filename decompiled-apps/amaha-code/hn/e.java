package hn;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.LocationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
/* compiled from: LoginSignupReworkRepository.kt */
/* loaded from: classes2.dex */
public final class e<TResult> implements ya.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f17847a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f17848b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ nf.b f17849c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ HashMap<String, String> f17850d;

    public e(ls.h hVar, b bVar, nf.b bVar2, HashMap hashMap) {
        this.f17847a = hVar;
        this.f17848b = bVar;
        this.f17849c = bVar2;
        this.f17850d = hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x05a5 A[Catch: Exception -> 0x06d0, TryCatch #0 {Exception -> 0x06d0, blocks: (B:5:0x002f, B:8:0x0099, B:79:0x03ae, B:81:0x0461, B:83:0x0466, B:85:0x048b, B:86:0x048f, B:87:0x04c3, B:89:0x04c9, B:90:0x0525, B:93:0x052f, B:95:0x0541, B:97:0x0552, B:99:0x055c, B:101:0x0578, B:103:0x0588, B:105:0x058f, B:106:0x0595, B:108:0x05a5, B:109:0x05c4, B:112:0x05d4, B:113:0x05e1, B:115:0x05e7, B:116:0x0600, B:119:0x0630, B:121:0x0642, B:123:0x064b, B:125:0x0660, B:127:0x068f, B:129:0x069b, B:130:0x06b6, B:131:0x06bd, B:122:0x0647, B:12:0x00b6, B:14:0x00c4, B:17:0x00d6, B:19:0x00e0, B:21:0x00e8, B:23:0x0144, B:25:0x015e, B:28:0x0182, B:59:0x0292, B:61:0x029a, B:63:0x02a8, B:64:0x02c6, B:66:0x030d, B:69:0x0314, B:71:0x034f, B:73:0x0371, B:75:0x0376, B:77:0x039c, B:78:0x03a0, B:70:0x032f, B:26:0x016d, B:27:0x0178, B:29:0x0199, B:31:0x01a1, B:32:0x01c2, B:34:0x021d, B:36:0x0222, B:39:0x0242, B:41:0x0248, B:55:0x026d, B:58:0x0275, B:44:0x0250, B:46:0x0256, B:49:0x025e, B:51:0x0264), top: B:143:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x05d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x05e7 A[Catch: Exception -> 0x06d0, LOOP:0: B:113:0x05e1->B:115:0x05e7, LOOP_END, TryCatch #0 {Exception -> 0x06d0, blocks: (B:5:0x002f, B:8:0x0099, B:79:0x03ae, B:81:0x0461, B:83:0x0466, B:85:0x048b, B:86:0x048f, B:87:0x04c3, B:89:0x04c9, B:90:0x0525, B:93:0x052f, B:95:0x0541, B:97:0x0552, B:99:0x055c, B:101:0x0578, B:103:0x0588, B:105:0x058f, B:106:0x0595, B:108:0x05a5, B:109:0x05c4, B:112:0x05d4, B:113:0x05e1, B:115:0x05e7, B:116:0x0600, B:119:0x0630, B:121:0x0642, B:123:0x064b, B:125:0x0660, B:127:0x068f, B:129:0x069b, B:130:0x06b6, B:131:0x06bd, B:122:0x0647, B:12:0x00b6, B:14:0x00c4, B:17:0x00d6, B:19:0x00e0, B:21:0x00e8, B:23:0x0144, B:25:0x015e, B:28:0x0182, B:59:0x0292, B:61:0x029a, B:63:0x02a8, B:64:0x02c6, B:66:0x030d, B:69:0x0314, B:71:0x034f, B:73:0x0371, B:75:0x0376, B:77:0x039c, B:78:0x03a0, B:70:0x032f, B:26:0x016d, B:27:0x0178, B:29:0x0199, B:31:0x01a1, B:32:0x01c2, B:34:0x021d, B:36:0x0222, B:39:0x0242, B:41:0x0248, B:55:0x026d, B:58:0x0275, B:44:0x0250, B:46:0x0256, B:49:0x025e, B:51:0x0264), top: B:143:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0630 A[Catch: Exception -> 0x06d0, TRY_ENTER, TryCatch #0 {Exception -> 0x06d0, blocks: (B:5:0x002f, B:8:0x0099, B:79:0x03ae, B:81:0x0461, B:83:0x0466, B:85:0x048b, B:86:0x048f, B:87:0x04c3, B:89:0x04c9, B:90:0x0525, B:93:0x052f, B:95:0x0541, B:97:0x0552, B:99:0x055c, B:101:0x0578, B:103:0x0588, B:105:0x058f, B:106:0x0595, B:108:0x05a5, B:109:0x05c4, B:112:0x05d4, B:113:0x05e1, B:115:0x05e7, B:116:0x0600, B:119:0x0630, B:121:0x0642, B:123:0x064b, B:125:0x0660, B:127:0x068f, B:129:0x069b, B:130:0x06b6, B:131:0x06bd, B:122:0x0647, B:12:0x00b6, B:14:0x00c4, B:17:0x00d6, B:19:0x00e0, B:21:0x00e8, B:23:0x0144, B:25:0x015e, B:28:0x0182, B:59:0x0292, B:61:0x029a, B:63:0x02a8, B:64:0x02c6, B:66:0x030d, B:69:0x0314, B:71:0x034f, B:73:0x0371, B:75:0x0376, B:77:0x039c, B:78:0x03a0, B:70:0x032f, B:26:0x016d, B:27:0x0178, B:29:0x0199, B:31:0x01a1, B:32:0x01c2, B:34:0x021d, B:36:0x0222, B:39:0x0242, B:41:0x0248, B:55:0x026d, B:58:0x0275, B:44:0x0250, B:46:0x0256, B:49:0x025e, B:51:0x0264), top: B:143:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0660 A[Catch: Exception -> 0x06d0, TryCatch #0 {Exception -> 0x06d0, blocks: (B:5:0x002f, B:8:0x0099, B:79:0x03ae, B:81:0x0461, B:83:0x0466, B:85:0x048b, B:86:0x048f, B:87:0x04c3, B:89:0x04c9, B:90:0x0525, B:93:0x052f, B:95:0x0541, B:97:0x0552, B:99:0x055c, B:101:0x0578, B:103:0x0588, B:105:0x058f, B:106:0x0595, B:108:0x05a5, B:109:0x05c4, B:112:0x05d4, B:113:0x05e1, B:115:0x05e7, B:116:0x0600, B:119:0x0630, B:121:0x0642, B:123:0x064b, B:125:0x0660, B:127:0x068f, B:129:0x069b, B:130:0x06b6, B:131:0x06bd, B:122:0x0647, B:12:0x00b6, B:14:0x00c4, B:17:0x00d6, B:19:0x00e0, B:21:0x00e8, B:23:0x0144, B:25:0x015e, B:28:0x0182, B:59:0x0292, B:61:0x029a, B:63:0x02a8, B:64:0x02c6, B:66:0x030d, B:69:0x0314, B:71:0x034f, B:73:0x0371, B:75:0x0376, B:77:0x039c, B:78:0x03a0, B:70:0x032f, B:26:0x016d, B:27:0x0178, B:29:0x0199, B:31:0x01a1, B:32:0x01c2, B:34:0x021d, B:36:0x0222, B:39:0x0242, B:41:0x0248, B:55:0x026d, B:58:0x0275, B:44:0x0250, B:46:0x0256, B:49:0x025e, B:51:0x0264), top: B:143:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0371 A[Catch: Exception -> 0x06d0, TryCatch #0 {Exception -> 0x06d0, blocks: (B:5:0x002f, B:8:0x0099, B:79:0x03ae, B:81:0x0461, B:83:0x0466, B:85:0x048b, B:86:0x048f, B:87:0x04c3, B:89:0x04c9, B:90:0x0525, B:93:0x052f, B:95:0x0541, B:97:0x0552, B:99:0x055c, B:101:0x0578, B:103:0x0588, B:105:0x058f, B:106:0x0595, B:108:0x05a5, B:109:0x05c4, B:112:0x05d4, B:113:0x05e1, B:115:0x05e7, B:116:0x0600, B:119:0x0630, B:121:0x0642, B:123:0x064b, B:125:0x0660, B:127:0x068f, B:129:0x069b, B:130:0x06b6, B:131:0x06bd, B:122:0x0647, B:12:0x00b6, B:14:0x00c4, B:17:0x00d6, B:19:0x00e0, B:21:0x00e8, B:23:0x0144, B:25:0x015e, B:28:0x0182, B:59:0x0292, B:61:0x029a, B:63:0x02a8, B:64:0x02c6, B:66:0x030d, B:69:0x0314, B:71:0x034f, B:73:0x0371, B:75:0x0376, B:77:0x039c, B:78:0x03a0, B:70:0x032f, B:26:0x016d, B:27:0x0178, B:29:0x0199, B:31:0x01a1, B:32:0x01c2, B:34:0x021d, B:36:0x0222, B:39:0x0242, B:41:0x0248, B:55:0x026d, B:58:0x0275, B:44:0x0250, B:46:0x0256, B:49:0x025e, B:51:0x0264), top: B:143:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x039c A[Catch: Exception -> 0x06d0, TryCatch #0 {Exception -> 0x06d0, blocks: (B:5:0x002f, B:8:0x0099, B:79:0x03ae, B:81:0x0461, B:83:0x0466, B:85:0x048b, B:86:0x048f, B:87:0x04c3, B:89:0x04c9, B:90:0x0525, B:93:0x052f, B:95:0x0541, B:97:0x0552, B:99:0x055c, B:101:0x0578, B:103:0x0588, B:105:0x058f, B:106:0x0595, B:108:0x05a5, B:109:0x05c4, B:112:0x05d4, B:113:0x05e1, B:115:0x05e7, B:116:0x0600, B:119:0x0630, B:121:0x0642, B:123:0x064b, B:125:0x0660, B:127:0x068f, B:129:0x069b, B:130:0x06b6, B:131:0x06bd, B:122:0x0647, B:12:0x00b6, B:14:0x00c4, B:17:0x00d6, B:19:0x00e0, B:21:0x00e8, B:23:0x0144, B:25:0x015e, B:28:0x0182, B:59:0x0292, B:61:0x029a, B:63:0x02a8, B:64:0x02c6, B:66:0x030d, B:69:0x0314, B:71:0x034f, B:73:0x0371, B:75:0x0376, B:77:0x039c, B:78:0x03a0, B:70:0x032f, B:26:0x016d, B:27:0x0178, B:29:0x0199, B:31:0x01a1, B:32:0x01c2, B:34:0x021d, B:36:0x0222, B:39:0x0242, B:41:0x0248, B:55:0x026d, B:58:0x0275, B:44:0x0250, B:46:0x0256, B:49:0x025e, B:51:0x0264), top: B:143:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0461 A[Catch: Exception -> 0x06d0, TryCatch #0 {Exception -> 0x06d0, blocks: (B:5:0x002f, B:8:0x0099, B:79:0x03ae, B:81:0x0461, B:83:0x0466, B:85:0x048b, B:86:0x048f, B:87:0x04c3, B:89:0x04c9, B:90:0x0525, B:93:0x052f, B:95:0x0541, B:97:0x0552, B:99:0x055c, B:101:0x0578, B:103:0x0588, B:105:0x058f, B:106:0x0595, B:108:0x05a5, B:109:0x05c4, B:112:0x05d4, B:113:0x05e1, B:115:0x05e7, B:116:0x0600, B:119:0x0630, B:121:0x0642, B:123:0x064b, B:125:0x0660, B:127:0x068f, B:129:0x069b, B:130:0x06b6, B:131:0x06bd, B:122:0x0647, B:12:0x00b6, B:14:0x00c4, B:17:0x00d6, B:19:0x00e0, B:21:0x00e8, B:23:0x0144, B:25:0x015e, B:28:0x0182, B:59:0x0292, B:61:0x029a, B:63:0x02a8, B:64:0x02c6, B:66:0x030d, B:69:0x0314, B:71:0x034f, B:73:0x0371, B:75:0x0376, B:77:0x039c, B:78:0x03a0, B:70:0x032f, B:26:0x016d, B:27:0x0178, B:29:0x0199, B:31:0x01a1, B:32:0x01c2, B:34:0x021d, B:36:0x0222, B:39:0x0242, B:41:0x0248, B:55:0x026d, B:58:0x0275, B:44:0x0250, B:46:0x0256, B:49:0x025e, B:51:0x0264), top: B:143:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x048b A[Catch: Exception -> 0x06d0, TryCatch #0 {Exception -> 0x06d0, blocks: (B:5:0x002f, B:8:0x0099, B:79:0x03ae, B:81:0x0461, B:83:0x0466, B:85:0x048b, B:86:0x048f, B:87:0x04c3, B:89:0x04c9, B:90:0x0525, B:93:0x052f, B:95:0x0541, B:97:0x0552, B:99:0x055c, B:101:0x0578, B:103:0x0588, B:105:0x058f, B:106:0x0595, B:108:0x05a5, B:109:0x05c4, B:112:0x05d4, B:113:0x05e1, B:115:0x05e7, B:116:0x0600, B:119:0x0630, B:121:0x0642, B:123:0x064b, B:125:0x0660, B:127:0x068f, B:129:0x069b, B:130:0x06b6, B:131:0x06bd, B:122:0x0647, B:12:0x00b6, B:14:0x00c4, B:17:0x00d6, B:19:0x00e0, B:21:0x00e8, B:23:0x0144, B:25:0x015e, B:28:0x0182, B:59:0x0292, B:61:0x029a, B:63:0x02a8, B:64:0x02c6, B:66:0x030d, B:69:0x0314, B:71:0x034f, B:73:0x0371, B:75:0x0376, B:77:0x039c, B:78:0x03a0, B:70:0x032f, B:26:0x016d, B:27:0x0178, B:29:0x0199, B:31:0x01a1, B:32:0x01c2, B:34:0x021d, B:36:0x0222, B:39:0x0242, B:41:0x0248, B:55:0x026d, B:58:0x0275, B:44:0x0250, B:46:0x0256, B:49:0x025e, B:51:0x0264), top: B:143:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04c9 A[Catch: Exception -> 0x06d0, TryCatch #0 {Exception -> 0x06d0, blocks: (B:5:0x002f, B:8:0x0099, B:79:0x03ae, B:81:0x0461, B:83:0x0466, B:85:0x048b, B:86:0x048f, B:87:0x04c3, B:89:0x04c9, B:90:0x0525, B:93:0x052f, B:95:0x0541, B:97:0x0552, B:99:0x055c, B:101:0x0578, B:103:0x0588, B:105:0x058f, B:106:0x0595, B:108:0x05a5, B:109:0x05c4, B:112:0x05d4, B:113:0x05e1, B:115:0x05e7, B:116:0x0600, B:119:0x0630, B:121:0x0642, B:123:0x064b, B:125:0x0660, B:127:0x068f, B:129:0x069b, B:130:0x06b6, B:131:0x06bd, B:122:0x0647, B:12:0x00b6, B:14:0x00c4, B:17:0x00d6, B:19:0x00e0, B:21:0x00e8, B:23:0x0144, B:25:0x015e, B:28:0x0182, B:59:0x0292, B:61:0x029a, B:63:0x02a8, B:64:0x02c6, B:66:0x030d, B:69:0x0314, B:71:0x034f, B:73:0x0371, B:75:0x0376, B:77:0x039c, B:78:0x03a0, B:70:0x032f, B:26:0x016d, B:27:0x0178, B:29:0x0199, B:31:0x01a1, B:32:0x01c2, B:34:0x021d, B:36:0x0222, B:39:0x0242, B:41:0x0248, B:55:0x026d, B:58:0x0275, B:44:0x0250, B:46:0x0256, B:49:0x025e, B:51:0x0264), top: B:143:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x052f A[Catch: Exception -> 0x06d0, TRY_ENTER, TryCatch #0 {Exception -> 0x06d0, blocks: (B:5:0x002f, B:8:0x0099, B:79:0x03ae, B:81:0x0461, B:83:0x0466, B:85:0x048b, B:86:0x048f, B:87:0x04c3, B:89:0x04c9, B:90:0x0525, B:93:0x052f, B:95:0x0541, B:97:0x0552, B:99:0x055c, B:101:0x0578, B:103:0x0588, B:105:0x058f, B:106:0x0595, B:108:0x05a5, B:109:0x05c4, B:112:0x05d4, B:113:0x05e1, B:115:0x05e7, B:116:0x0600, B:119:0x0630, B:121:0x0642, B:123:0x064b, B:125:0x0660, B:127:0x068f, B:129:0x069b, B:130:0x06b6, B:131:0x06bd, B:122:0x0647, B:12:0x00b6, B:14:0x00c4, B:17:0x00d6, B:19:0x00e0, B:21:0x00e8, B:23:0x0144, B:25:0x015e, B:28:0x0182, B:59:0x0292, B:61:0x029a, B:63:0x02a8, B:64:0x02c6, B:66:0x030d, B:69:0x0314, B:71:0x034f, B:73:0x0371, B:75:0x0376, B:77:0x039c, B:78:0x03a0, B:70:0x032f, B:26:0x016d, B:27:0x0178, B:29:0x0199, B:31:0x01a1, B:32:0x01c2, B:34:0x021d, B:36:0x0222, B:39:0x0242, B:41:0x0248, B:55:0x026d, B:58:0x0275, B:44:0x0250, B:46:0x0256, B:49:0x025e, B:51:0x0264), top: B:143:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x055c A[Catch: Exception -> 0x06d0, TryCatch #0 {Exception -> 0x06d0, blocks: (B:5:0x002f, B:8:0x0099, B:79:0x03ae, B:81:0x0461, B:83:0x0466, B:85:0x048b, B:86:0x048f, B:87:0x04c3, B:89:0x04c9, B:90:0x0525, B:93:0x052f, B:95:0x0541, B:97:0x0552, B:99:0x055c, B:101:0x0578, B:103:0x0588, B:105:0x058f, B:106:0x0595, B:108:0x05a5, B:109:0x05c4, B:112:0x05d4, B:113:0x05e1, B:115:0x05e7, B:116:0x0600, B:119:0x0630, B:121:0x0642, B:123:0x064b, B:125:0x0660, B:127:0x068f, B:129:0x069b, B:130:0x06b6, B:131:0x06bd, B:122:0x0647, B:12:0x00b6, B:14:0x00c4, B:17:0x00d6, B:19:0x00e0, B:21:0x00e8, B:23:0x0144, B:25:0x015e, B:28:0x0182, B:59:0x0292, B:61:0x029a, B:63:0x02a8, B:64:0x02c6, B:66:0x030d, B:69:0x0314, B:71:0x034f, B:73:0x0371, B:75:0x0376, B:77:0x039c, B:78:0x03a0, B:70:0x032f, B:26:0x016d, B:27:0x0178, B:29:0x0199, B:31:0x01a1, B:32:0x01c2, B:34:0x021d, B:36:0x0222, B:39:0x0242, B:41:0x0248, B:55:0x026d, B:58:0x0275, B:44:0x0250, B:46:0x0256, B:49:0x025e, B:51:0x0264), top: B:143:0x002f }] */
    @Override // ya.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ya.h<Boolean> it) {
        ls.d<Boolean> dVar;
        String str;
        HashMap<String, String> hashMap;
        String str2;
        Object obj;
        String str3;
        String str4;
        boolean z10;
        String str5;
        String str6;
        String str7;
        Object obj2;
        String str8;
        Object obj3;
        String str9;
        LocationPersistence locationPersistence;
        String str10;
        Object obj4;
        Bundle bundle;
        String str11;
        Object obj5;
        String str12;
        Object obj6;
        ls.d<Boolean> dVar2 = this.f17847a;
        kotlin.jvm.internal.i.g(it, "it");
        try {
            User user = FirebasePersistence.getInstance().getUser();
            nf.b bVar = this.f17849c;
            try {
                HashMap<String, String> hashMap2 = this.f17850d;
                HashMap<String, Object> appConfig = user.getAppConfig();
                kotlin.jvm.internal.i.f(appConfig, "appConfig");
                hashMap = hashMap2;
                Boolean bool = Boolean.TRUE;
                appConfig.put("tracker_mini_selling", bool);
                HashMap<String, Object> appConfig2 = user.getAppConfig();
                kotlin.jvm.internal.i.f(appConfig2, "appConfig");
                appConfig2.put("profile_experiment", bool);
                HashMap<String, Object> appConfig3 = user.getAppConfig();
                kotlin.jvm.internal.i.f(appConfig3, "appConfig");
                appConfig3.put(Constants.ONBOARDING_EXPERIMENT, Constants.ONBOARDING_VARIANT);
                str2 = null;
            } catch (Exception e10) {
                e = e10;
                dVar = dVar2;
            }
            try {
                if (kotlin.jvm.internal.i.b(bVar.f(Constants.DASHBOARD_LIBRARY_EXPERIMENT), "default")) {
                    if (!kotlin.jvm.internal.i.b(bVar.f(Constants.LIBRARY_EXPERIMENT_V3), "default")) {
                    }
                    str3 = SessionManager.KEY_USERTYPE;
                    obj = "patient";
                    str7 = "version";
                    HashMap<String, Object> appConfig4 = user.getAppConfig();
                    kotlin.jvm.internal.i.f(appConfig4, "appConfig");
                    str9 = "default";
                    appConfig4.put(Constants.A3_ONBOARDING_EXPERIMENT, Boolean.FALSE);
                    String str13 = gk.a.f16573a;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(str7, FirebasePersistence.getInstance().getUser().getVersion());
                    bundle2.putString("variant", "post_domain");
                    bundle2.putBoolean("value", false);
                    hs.k kVar = hs.k.f19476a;
                    gk.a.b(bundle2, Constants.A3_ONBOARDING_EXPERIMENT);
                    HashMap<String, Object> appConfig5 = user.getAppConfig();
                    kotlin.jvm.internal.i.f(appConfig5, "appConfig");
                    appConfig5.put(Constants.IH_RESOURCES_EXPERIMENT, Boolean.valueOf(bVar.d(Constants.IH_RESOURCES_EXPERIMENT)));
                    Bundle bundle3 = new Bundle();
                    Object obj7 = user.getAppConfig().get(Constants.IH_RESOURCES_EXPERIMENT);
                    kotlin.jvm.internal.i.e(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                    bundle3.putBoolean("value", ((Boolean) obj7).booleanValue());
                    gk.a.b(bundle3, Constants.IH_RESOURCES_EXPERIMENT);
                    HashMap<String, Object> appConfig6 = user.getAppConfig();
                    kotlin.jvm.internal.i.f(appConfig6, "appConfig");
                    appConfig6.put(Constants.DASHBOARD_INTEGRATED_TELECONSULTATION_EXP, Boolean.valueOf(bVar.d(Constants.DASHBOARD_INTEGRATED_TELECONSULTATION_EXP)));
                    Bundle bundle4 = new Bundle();
                    bundle4.putBoolean("value", bVar.d(Constants.DASHBOARD_INTEGRATED_TELECONSULTATION_EXP));
                    gk.a.b(bundle4, Constants.DASHBOARD_INTEGRATED_TELECONSULTATION_EXP);
                    HashMap<String, Object> appConfig7 = user.getAppConfig();
                    kotlin.jvm.internal.i.f(appConfig7, "appConfig");
                    appConfig7.put(Constants.TELE_ENTRY_POINT_EXPERIMENT, bVar.f(Constants.TELE_ENTRY_POINT_EXPERIMENT));
                    Bundle bundle5 = new Bundle();
                    bundle5.putString(str7, FirebasePersistence.getInstance().getUser().getVersion());
                    obj5 = user.getAppConfig().get(Constants.TELE_ENTRY_POINT_EXPERIMENT);
                    if (!(obj5 instanceof String)) {
                        str12 = (String) obj5;
                    } else {
                        str12 = null;
                    }
                    bundle5.putString("variant", str12);
                    gk.a.b(bundle5, "db_tele_experiment_v3");
                    HashMap<String, Object> appConfig8 = user.getAppConfig();
                    kotlin.jvm.internal.i.f(appConfig8, "appConfig");
                    appConfig8.put(Constants.DASHBOARD_PLAN_CARD_EXPERIMENT, bVar.f(Constants.DASHBOARD_PLAN_CARD_EXPERIMENT));
                    Bundle bundle6 = new Bundle();
                    obj6 = user.getAppConfig().get(Constants.DASHBOARD_PLAN_CARD_EXPERIMENT);
                    if (obj6 instanceof String) {
                        str2 = (String) obj6;
                    }
                    bundle6.putString("variant", str2);
                    gk.a.b(bundle6, Constants.DASHBOARD_PLAN_CARD_EXPERIMENT);
                    HashMap<String, Object> appConfig9 = user.getAppConfig();
                    kotlin.jvm.internal.i.f(appConfig9, "appConfig");
                    appConfig9.put(Constants.COMMUNITY_ENTRY_POINT_EXPERIMENT, bVar.f(Constants.COMMUNITY_ENTRY_POINT_EXPERIMENT));
                    Bundle bundle7 = new Bundle();
                    bundle7.putString(str7, FirebasePersistence.getInstance().getUser().getVersion());
                    bundle7.putString("variant", bVar.f(Constants.COMMUNITY_ENTRY_POINT_EXPERIMENT));
                    gk.a.b(bundle7, Constants.COMMUNITY_ENTRY_POINT_EXPERIMENT);
                    if (Build.VERSION.SDK_INT >= 33) {
                        HashMap<String, Object> appConfig10 = user.getAppConfig();
                        kotlin.jvm.internal.i.f(appConfig10, "appConfig");
                        appConfig10.put(Constants.NOTIF_PERMIT_ASSESSMENT_EXPERIMENT, bVar.f(Constants.NOTIF_PERMIT_ASSESSMENT_EXPERIMENT));
                        HashMap<String, Object> appConfig11 = user.getAppConfig();
                        kotlin.jvm.internal.i.f(appConfig11, "appConfig");
                        appConfig11.put(Constants.NOTIF_PERMIT_DESCRIPTION_EXPERIMENT, bVar.f(Constants.NOTIF_PERMIT_DESCRIPTION_EXPERIMENT));
                        Bundle bundle8 = new Bundle();
                        bundle8.putString(str7, FirebasePersistence.getInstance().getUser().getVersion());
                        bundle8.putString("variant", bVar.f(Constants.NOTIF_PERMIT_ASSESSMENT_EXPERIMENT));
                        gk.a.b(bundle8, Constants.NOTIF_PERMIT_ASSESSMENT_EXPERIMENT);
                        Bundle bundle9 = new Bundle();
                        bundle9.putString(str7, FirebasePersistence.getInstance().getUser().getVersion());
                        bundle9.putString("variant", bVar.f(Constants.NOTIF_PERMIT_DESCRIPTION_EXPERIMENT));
                        gk.a.b(bundle9, Constants.NOTIF_PERMIT_DESCRIPTION_EXPERIMENT);
                    }
                    locationPersistence = LocationPersistence.INSTANCE;
                    if (!locationPersistence.isIndianUser()) {
                        str10 = str3;
                        if (!Constants.B2B_USER_TYPES.contains(SessionManager.getInstance().getStringValue(str10))) {
                            HashMap<String, Object> appConfig12 = user.getAppConfig();
                            kotlin.jvm.internal.i.f(appConfig12, "appConfig");
                            appConfig12.put(Constants.A3_ONBOARDING_REVAMP, bVar.f(Constants.A3_ONBOARDING_REVAMP));
                        }
                    } else {
                        str10 = str3;
                    }
                    if (user.getAppConfig().containsKey(Constants.A3_ONBOARDING_REVAMP)) {
                        Bundle bundle10 = new Bundle();
                        bundle10.putString(str7, FirebasePersistence.getInstance().getUser().getVersion());
                        if (locationPersistence.isIndianUser() && !Constants.B2B_USER_TYPES.contains(SessionManager.getInstance().getStringValue(str10))) {
                            str11 = bVar.f(Constants.A3_ONBOARDING_REVAMP);
                        } else {
                            str11 = str9;
                        }
                        bundle10.putString("a3_value", str11);
                        gk.a.b(bundle10, Constants.A3_ONBOARDING_REVAMP);
                    }
                    obj4 = obj;
                    if (kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(str10), obj4)) {
                        HashMap<String, Object> appConfig13 = user.getAppConfig();
                        kotlin.jvm.internal.i.f(appConfig13, "appConfig");
                        appConfig13.put(Constants.JOURNAL_EXPERIMENT, bVar.f(Constants.JOURNAL_EXPERIMENT));
                        Bundle bundle11 = new Bundle();
                        bundle11.putString("variant", bVar.f(Constants.JOURNAL_EXPERIMENT));
                        gk.a.b(bundle11, Constants.JOURNAL_EXPERIMENT);
                    }
                    if (!kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(str10), obj4) && hashMap != null) {
                        Set<String> keySet = hashMap.keySet();
                        kotlin.jvm.internal.i.f(keySet, "overrideData.keys");
                        for (String str14 : keySet) {
                            HashMap<String, Object> appConfig14 = user.getAppConfig();
                            kotlin.jvm.internal.i.f(appConfig14, "appConfig");
                            HashMap<String, String> hashMap3 = hashMap;
                            appConfig14.put(str14, hashMap3.get(str14));
                            hashMap = hashMap3;
                        }
                    }
                    user.setVersion(Constants.USER_VERSION);
                    String str15 = gk.a.f16573a;
                    bundle = new Bundle();
                    bundle.putString(str7, user.getVersion());
                    bundle.putString(SessionManager.KEY_COUNTRY_CODE, LocationPersistence.INSTANCE.getCurrentCountry());
                    if (kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(str10), obj4) && kotlin.jvm.internal.i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE)) {
                        bundle.putBoolean("corporate", true);
                    } else {
                        bundle.putBoolean("corporate", false);
                    }
                    hs.k kVar2 = hs.k.f19476a;
                    gk.a.b(bundle, "assigned_version");
                    if (!kotlin.jvm.internal.i.b(ApplicationPersistence.getInstance().getStringValue(Constants.DYNAMIC_UTM_LINK), "")) {
                        lg.f d10 = MyApplication.V.a().d();
                        Uri parse = Uri.parse(ApplicationPersistence.getInstance().getStringValue(Constants.DYNAMIC_UTM_LINK));
                        List<String> campaignsList = parse.getQueryParameters("utm_campaign");
                        List<String> contentList = parse.getQueryParameters("utm_content");
                        kotlin.jvm.internal.i.f(campaignsList, "campaignsList");
                        if (!campaignsList.isEmpty()) {
                            kotlin.jvm.internal.i.f(contentList, "contentList");
                            if (!contentList.isEmpty()) {
                                d10.f().a(campaignsList.get(0), "UTM Campaigns");
                                d10.f().a(contentList.get(0), "UTM Content");
                            }
                        }
                        ApplicationPersistence.getInstance().deleteKey(Constants.DYNAMIC_UTM_LINK);
                    }
                    FirebasePersistence.getInstance().updateUserOnFirebase();
                    dVar = dVar2;
                    dVar.resumeWith(Boolean.TRUE);
                    return;
                }
                if (kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient")) {
                    boolean b10 = kotlin.jvm.internal.i.b(bVar.f(Constants.DASHBOARD_LIBRARY_EXPERIMENT), "default");
                    obj = "patient";
                    str3 = SessionManager.KEY_USERTYPE;
                    if (!b10 && (kotlin.jvm.internal.i.b(bVar.f(Constants.NEW_COURSES_EXPERIMENT), "default") || !LocationPersistence.INSTANCE.isIndianUser())) {
                        HashMap<String, Object> appConfig15 = user.getAppConfig();
                        kotlin.jvm.internal.i.f(appConfig15, "appConfig");
                        appConfig15.put(Constants.DASHBOARD_LIBRARY_EXPERIMENT, bVar.f(Constants.DASHBOARD_LIBRARY_EXPERIMENT));
                        String str16 = gk.a.f16573a;
                        Bundle bundle12 = new Bundle();
                        bundle12.putString("variant", bVar.f(Constants.DASHBOARD_LIBRARY_EXPERIMENT));
                        hs.k kVar3 = hs.k.f19476a;
                        gk.a.b(bundle12, Constants.DASHBOARD_LIBRARY_EXPERIMENT);
                        HashMap<String, Object> appConfig16 = user.getAppConfig();
                        kotlin.jvm.internal.i.f(appConfig16, "appConfig");
                        appConfig16.put(Constants.NO_FREE_SYMPTOM_EXPERIMENT_NOT_V4, Boolean.valueOf(bVar.d(Constants.NO_FREE_SYMPTOM_EXPERIMENT_NOT_V4)));
                        Bundle bundle13 = new Bundle();
                        bundle13.putBoolean("value", bVar.d(Constants.NO_FREE_SYMPTOM_EXPERIMENT_NOT_V4));
                        gk.a.b(bundle13, Constants.NO_FREE_SYMPTOM_EXPERIMENT_NOT_V4);
                        if (!ca.a.k("variant_a", "default").contains(gv.r.i1(bVar.f(Constants.DASHBOARD_LIBRARY_EXPERIMENT)).toString())) {
                            if (!ca.a.k("variant_a", "default").contains(gv.r.i1(bVar.f(Constants.LIBRARY_EXPERIMENT_V3)).toString())) {
                                HashMap<String, Object> appConfig17 = user.getAppConfig();
                                kotlin.jvm.internal.i.f(appConfig17, "appConfig");
                                appConfig17.put(Constants.LIBRARY_EXPERIMENT_V3, bVar.f(Constants.LIBRARY_EXPERIMENT_V3));
                            } else {
                                HashMap<String, Object> appConfig18 = user.getAppConfig();
                                kotlin.jvm.internal.i.f(appConfig18, "appConfig");
                                appConfig18.put(Constants.LIBRARY_EXPERIMENT_V3, "variant_b");
                            }
                        } else {
                            HashMap<String, Object> appConfig19 = user.getAppConfig();
                            kotlin.jvm.internal.i.f(appConfig19, "appConfig");
                            appConfig19.put(Constants.LIBRARY_EXPERIMENT_V3, "variant_a");
                        }
                        Bundle bundle14 = new Bundle();
                        bundle14.putString("variant", (String) user.getAppConfig().get(Constants.LIBRARY_EXPERIMENT_V3));
                        gk.a.b(bundle14, Constants.LIBRARY_EXPERIMENT_V3);
                    } else {
                        LocationPersistence locationPersistence2 = LocationPersistence.INSTANCE;
                        if (locationPersistence2.isIndianUser()) {
                            HashMap<String, Object> appConfig20 = user.getAppConfig();
                            kotlin.jvm.internal.i.f(appConfig20, "appConfig");
                            appConfig20.put(Constants.APP_PROMPTS_EXPERIMENT, bVar.f(Constants.APP_PROMPTS_EXPERIMENT));
                            String str17 = gk.a.f16573a;
                            Bundle bundle15 = new Bundle();
                            bundle15.putString("variant", bVar.f(Constants.APP_PROMPTS_EXPERIMENT));
                            hs.k kVar4 = hs.k.f19476a;
                            gk.a.b(bundle15, Constants.APP_PROMPTS_EXPERIMENT);
                        }
                        HashMap<String, Object> appConfig21 = user.getAppConfig();
                        kotlin.jvm.internal.i.f(appConfig21, "appConfig");
                        appConfig21.put(Constants.DASHBOARD_LIBRARY_EXPERIMENT, "default");
                        String str18 = gk.a.f16573a;
                        Bundle bundle16 = new Bundle();
                        bundle16.putString("variant", "default");
                        hs.k kVar5 = hs.k.f19476a;
                        gk.a.b(bundle16, Constants.DASHBOARD_LIBRARY_EXPERIMENT);
                        HashMap<String, Object> appConfig22 = user.getAppConfig();
                        kotlin.jvm.internal.i.f(appConfig22, "appConfig");
                        appConfig22.put(Constants.LIBRARY_EXPERIMENT_V3, bVar.f(Constants.LIBRARY_EXPERIMENT_V3));
                        Bundle bundle17 = new Bundle();
                        bundle17.putString("variant", (String) user.getAppConfig().get(Constants.LIBRARY_EXPERIMENT_V3));
                        gk.a.b(bundle17, Constants.LIBRARY_EXPERIMENT_V3);
                        HashMap<String, Object> appConfig23 = user.getAppConfig();
                        kotlin.jvm.internal.i.f(appConfig23, "appConfig");
                        appConfig23.put(Constants.DASHBOARD_PLAN_CARD_EXPERIMENT, bVar.f(Constants.DASHBOARD_PLAN_CARD_EXPERIMENT));
                        Bundle bundle18 = new Bundle();
                        Object obj8 = user.getAppConfig().get(Constants.DASHBOARD_PLAN_CARD_EXPERIMENT);
                        if (obj8 instanceof String) {
                            str4 = (String) obj8;
                        } else {
                            str4 = null;
                        }
                        bundle18.putString("variant", str4);
                        gk.a.b(bundle18, Constants.DASHBOARD_PLAN_CARD_EXPERIMENT);
                        SessionManager sessionManager = SessionManager.getInstance();
                        String stringValue = sessionManager.getStringValue(SessionManager.KEY_MYTHERAPIST);
                        String stringValue2 = sessionManager.getStringValue(SessionManager.KEY_MYCOUPLESTHERAPIST);
                        String stringValue3 = sessionManager.getStringValue(SessionManager.KEY_MYPSYCHIATRIST);
                        if ((stringValue != null && !kotlin.jvm.internal.i.b(stringValue, "null") && !kotlin.jvm.internal.i.b(stringValue, "")) || ((stringValue3 != null && !kotlin.jvm.internal.i.b(stringValue3, "null") && !kotlin.jvm.internal.i.b(stringValue3, "")) || (stringValue2 != null && !kotlin.jvm.internal.i.b(stringValue2, "null") && !kotlin.jvm.internal.i.b(stringValue2, "")))) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (locationPersistence2.isIndianUser() && !z10) {
                            HashMap<String, Object> appConfig24 = user.getAppConfig();
                            kotlin.jvm.internal.i.f(appConfig24, "appConfig");
                            appConfig24.put(Constants.NEW_COURSES_EXPERIMENT, bVar.f(Constants.NEW_COURSES_EXPERIMENT));
                            Bundle bundle19 = new Bundle();
                            bundle19.putString("variant", bVar.f(Constants.NEW_COURSES_EXPERIMENT));
                            gk.a.b(bundle19, Constants.NEW_COURSES_EXPERIMENT);
                        }
                    }
                    LocationPersistence locationPersistence3 = LocationPersistence.INSTANCE;
                    if (locationPersistence3.isIndianUser() && (!gv.n.B0(bVar.f(Constants.KEY_PR_COUPON)))) {
                        ApplicationPersistence.getInstance().setStringValue(Constants.PR_COUPON_CODE, bVar.f(Constants.KEY_PR_COUPON));
                        Bundle bundle20 = new Bundle();
                        bundle20.putString("variant", bVar.f(Constants.KEY_PR_COUPON));
                        gk.a.b(bundle20, Constants.PR_APP_NEW_SUB_FREE_EXPERIMENT);
                    }
                    HashMap<String, Object> appConfig25 = user.getAppConfig();
                    kotlin.jvm.internal.i.f(appConfig25, "appConfig");
                    appConfig25.put(Constants.IH_RESOURCES_EXPERIMENT, Boolean.FALSE);
                    Bundle bundle21 = new Bundle();
                    bundle21.putBoolean("value", false);
                    gk.a.b(bundle21, Constants.IH_RESOURCES_EXPERIMENT);
                    HashMap<String, Object> appConfig26 = user.getAppConfig();
                    kotlin.jvm.internal.i.f(appConfig26, "appConfig");
                    appConfig26.put(Constants.DASHBOARD_INTEGRATED_TELECONSULTATION_EXP, Boolean.valueOf(bVar.d(Constants.DASHBOARD_INTEGRATED_TELECONSULTATION_EXP)));
                    Bundle bundle22 = new Bundle();
                    bundle22.putBoolean("value", bVar.d(Constants.DASHBOARD_INTEGRATED_TELECONSULTATION_EXP));
                    gk.a.b(bundle22, Constants.DASHBOARD_INTEGRATED_TELECONSULTATION_EXP);
                    if (!kotlin.jvm.internal.i.b(bVar.f(Constants.NEW_COURSES_EXPERIMENT), "default") && locationPersistence3.isIndianUser()) {
                        HashMap<String, Object> appConfig27 = user.getAppConfig();
                        kotlin.jvm.internal.i.f(appConfig27, "appConfig");
                        str5 = Constants.TELE_ENTRY_POINT_EXPERIMENT;
                        appConfig27.put(str5, "d");
                        HashMap<String, Object> appConfig28 = user.getAppConfig();
                        kotlin.jvm.internal.i.f(appConfig28, "appConfig");
                        str6 = Constants.COMMUNITY_ENTRY_POINT_EXPERIMENT;
                        appConfig28.put(str6, "variant_b");
                        Bundle bundle23 = new Bundle();
                        str7 = "version";
                        bundle23.putString(str7, FirebasePersistence.getInstance().getUser().getVersion());
                        obj2 = user.getAppConfig().get(str6);
                        if (!(obj2 instanceof String)) {
                            str8 = (String) obj2;
                        } else {
                            str8 = null;
                        }
                        bundle23.putString("variant", str8);
                        gk.a.b(bundle23, str6);
                        Bundle bundle24 = new Bundle();
                        bundle24.putString(str7, FirebasePersistence.getInstance().getUser().getVersion());
                        obj3 = user.getAppConfig().get(str5);
                        if (obj3 instanceof String) {
                            str2 = (String) obj3;
                        }
                        bundle24.putString("variant", str2);
                        gk.a.b(bundle24, "db_tele_experiment_v3");
                        str9 = "default";
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                        locationPersistence = LocationPersistence.INSTANCE;
                        if (!locationPersistence.isIndianUser()) {
                        }
                        if (user.getAppConfig().containsKey(Constants.A3_ONBOARDING_REVAMP)) {
                        }
                        obj4 = obj;
                        if (kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(str10), obj4)) {
                        }
                        if (!kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(str10), obj4)) {
                            Set<String> keySet2 = hashMap.keySet();
                            kotlin.jvm.internal.i.f(keySet2, "overrideData.keys");
                            while (r0.hasNext()) {
                            }
                        }
                        user.setVersion(Constants.USER_VERSION);
                        String str152 = gk.a.f16573a;
                        bundle = new Bundle();
                        bundle.putString(str7, user.getVersion());
                        bundle.putString(SessionManager.KEY_COUNTRY_CODE, LocationPersistence.INSTANCE.getCurrentCountry());
                        if (kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(str10), obj4)) {
                        }
                        bundle.putBoolean("corporate", false);
                        hs.k kVar22 = hs.k.f19476a;
                        gk.a.b(bundle, "assigned_version");
                        if (!kotlin.jvm.internal.i.b(ApplicationPersistence.getInstance().getStringValue(Constants.DYNAMIC_UTM_LINK), "")) {
                        }
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                        dVar = dVar2;
                        dVar.resumeWith(Boolean.TRUE);
                        return;
                    }
                    str5 = Constants.TELE_ENTRY_POINT_EXPERIMENT;
                    str6 = Constants.COMMUNITY_ENTRY_POINT_EXPERIMENT;
                    HashMap<String, Object> appConfig29 = user.getAppConfig();
                    kotlin.jvm.internal.i.f(appConfig29, "appConfig");
                    appConfig29.put(str5, bVar.f(str5));
                    HashMap<String, Object> appConfig30 = user.getAppConfig();
                    kotlin.jvm.internal.i.f(appConfig30, "appConfig");
                    appConfig30.put(str6, bVar.f(str6));
                    Bundle bundle232 = new Bundle();
                    str7 = "version";
                    bundle232.putString(str7, FirebasePersistence.getInstance().getUser().getVersion());
                    obj2 = user.getAppConfig().get(str6);
                    if (!(obj2 instanceof String)) {
                    }
                    bundle232.putString("variant", str8);
                    gk.a.b(bundle232, str6);
                    Bundle bundle242 = new Bundle();
                    bundle242.putString(str7, FirebasePersistence.getInstance().getUser().getVersion());
                    obj3 = user.getAppConfig().get(str5);
                    if (obj3 instanceof String) {
                    }
                    bundle242.putString("variant", str2);
                    gk.a.b(bundle242, "db_tele_experiment_v3");
                    str9 = "default";
                    if (Build.VERSION.SDK_INT >= 33) {
                    }
                    locationPersistence = LocationPersistence.INSTANCE;
                    if (!locationPersistence.isIndianUser()) {
                    }
                    if (user.getAppConfig().containsKey(Constants.A3_ONBOARDING_REVAMP)) {
                    }
                    obj4 = obj;
                    if (kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(str10), obj4)) {
                    }
                    if (!kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(str10), obj4)) {
                    }
                    user.setVersion(Constants.USER_VERSION);
                    String str1522 = gk.a.f16573a;
                    bundle = new Bundle();
                    bundle.putString(str7, user.getVersion());
                    bundle.putString(SessionManager.KEY_COUNTRY_CODE, LocationPersistence.INSTANCE.getCurrentCountry());
                    if (kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(str10), obj4)) {
                    }
                    bundle.putBoolean("corporate", false);
                    hs.k kVar222 = hs.k.f19476a;
                    gk.a.b(bundle, "assigned_version");
                    if (!kotlin.jvm.internal.i.b(ApplicationPersistence.getInstance().getStringValue(Constants.DYNAMIC_UTM_LINK), "")) {
                    }
                    FirebasePersistence.getInstance().updateUserOnFirebase();
                    dVar = dVar2;
                    dVar.resumeWith(Boolean.TRUE);
                    return;
                }
                dVar.resumeWith(Boolean.TRUE);
                return;
            } catch (Exception e11) {
                e = e11;
                LogHelper logHelper = LogHelper.INSTANCE;
                str = this.f17848b.f17789a;
                logHelper.e(str, "exception", e);
                dVar.resumeWith(Boolean.FALSE);
                return;
            }
            str3 = SessionManager.KEY_USERTYPE;
            obj = "patient";
            str7 = "version";
            HashMap<String, Object> appConfig42 = user.getAppConfig();
            kotlin.jvm.internal.i.f(appConfig42, "appConfig");
            str9 = "default";
            appConfig42.put(Constants.A3_ONBOARDING_EXPERIMENT, Boolean.FALSE);
            String str132 = gk.a.f16573a;
            Bundle bundle25 = new Bundle();
            bundle25.putString(str7, FirebasePersistence.getInstance().getUser().getVersion());
            bundle25.putString("variant", "post_domain");
            bundle25.putBoolean("value", false);
            hs.k kVar6 = hs.k.f19476a;
            gk.a.b(bundle25, Constants.A3_ONBOARDING_EXPERIMENT);
            HashMap<String, Object> appConfig52 = user.getAppConfig();
            kotlin.jvm.internal.i.f(appConfig52, "appConfig");
            appConfig52.put(Constants.IH_RESOURCES_EXPERIMENT, Boolean.valueOf(bVar.d(Constants.IH_RESOURCES_EXPERIMENT)));
            Bundle bundle32 = new Bundle();
            Object obj72 = user.getAppConfig().get(Constants.IH_RESOURCES_EXPERIMENT);
            kotlin.jvm.internal.i.e(obj72, "null cannot be cast to non-null type kotlin.Boolean");
            bundle32.putBoolean("value", ((Boolean) obj72).booleanValue());
            gk.a.b(bundle32, Constants.IH_RESOURCES_EXPERIMENT);
            HashMap<String, Object> appConfig62 = user.getAppConfig();
            kotlin.jvm.internal.i.f(appConfig62, "appConfig");
            appConfig62.put(Constants.DASHBOARD_INTEGRATED_TELECONSULTATION_EXP, Boolean.valueOf(bVar.d(Constants.DASHBOARD_INTEGRATED_TELECONSULTATION_EXP)));
            Bundle bundle42 = new Bundle();
            bundle42.putBoolean("value", bVar.d(Constants.DASHBOARD_INTEGRATED_TELECONSULTATION_EXP));
            gk.a.b(bundle42, Constants.DASHBOARD_INTEGRATED_TELECONSULTATION_EXP);
            HashMap<String, Object> appConfig72 = user.getAppConfig();
            kotlin.jvm.internal.i.f(appConfig72, "appConfig");
            appConfig72.put(Constants.TELE_ENTRY_POINT_EXPERIMENT, bVar.f(Constants.TELE_ENTRY_POINT_EXPERIMENT));
            Bundle bundle52 = new Bundle();
            bundle52.putString(str7, FirebasePersistence.getInstance().getUser().getVersion());
            obj5 = user.getAppConfig().get(Constants.TELE_ENTRY_POINT_EXPERIMENT);
            if (!(obj5 instanceof String)) {
            }
            bundle52.putString("variant", str12);
            gk.a.b(bundle52, "db_tele_experiment_v3");
            HashMap<String, Object> appConfig82 = user.getAppConfig();
            kotlin.jvm.internal.i.f(appConfig82, "appConfig");
            appConfig82.put(Constants.DASHBOARD_PLAN_CARD_EXPERIMENT, bVar.f(Constants.DASHBOARD_PLAN_CARD_EXPERIMENT));
            Bundle bundle62 = new Bundle();
            obj6 = user.getAppConfig().get(Constants.DASHBOARD_PLAN_CARD_EXPERIMENT);
            if (obj6 instanceof String) {
            }
            bundle62.putString("variant", str2);
            gk.a.b(bundle62, Constants.DASHBOARD_PLAN_CARD_EXPERIMENT);
            HashMap<String, Object> appConfig92 = user.getAppConfig();
            kotlin.jvm.internal.i.f(appConfig92, "appConfig");
            appConfig92.put(Constants.COMMUNITY_ENTRY_POINT_EXPERIMENT, bVar.f(Constants.COMMUNITY_ENTRY_POINT_EXPERIMENT));
            Bundle bundle72 = new Bundle();
            bundle72.putString(str7, FirebasePersistence.getInstance().getUser().getVersion());
            bundle72.putString("variant", bVar.f(Constants.COMMUNITY_ENTRY_POINT_EXPERIMENT));
            gk.a.b(bundle72, Constants.COMMUNITY_ENTRY_POINT_EXPERIMENT);
            if (Build.VERSION.SDK_INT >= 33) {
            }
            locationPersistence = LocationPersistence.INSTANCE;
            if (!locationPersistence.isIndianUser()) {
            }
            if (user.getAppConfig().containsKey(Constants.A3_ONBOARDING_REVAMP)) {
            }
            obj4 = obj;
            if (kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(str10), obj4)) {
            }
            if (!kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(str10), obj4)) {
            }
            user.setVersion(Constants.USER_VERSION);
            String str15222 = gk.a.f16573a;
            bundle = new Bundle();
            bundle.putString(str7, user.getVersion());
            bundle.putString(SessionManager.KEY_COUNTRY_CODE, LocationPersistence.INSTANCE.getCurrentCountry());
            if (kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(str10), obj4)) {
            }
            bundle.putBoolean("corporate", false);
            hs.k kVar2222 = hs.k.f19476a;
            gk.a.b(bundle, "assigned_version");
            if (!kotlin.jvm.internal.i.b(ApplicationPersistence.getInstance().getStringValue(Constants.DYNAMIC_UTM_LINK), "")) {
            }
            FirebasePersistence.getInstance().updateUserOnFirebase();
            dVar = dVar2;
        } catch (Exception e12) {
            e = e12;
            dVar = dVar2;
        }
    }
}
