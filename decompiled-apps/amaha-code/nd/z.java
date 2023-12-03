package nd;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.gson.JsonIOException;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.AcceptingUncertaintyActivity;
import com.theinnerhour.b2b.activity.ActivitiesActivity;
import com.theinnerhour.b2b.activity.ActivitiesInfoActivity;
import com.theinnerhour.b2b.activity.ActivityScheduling;
import com.theinnerhour.b2b.activity.BenefitsOfSleepActivity;
import com.theinnerhour.b2b.activity.BlogActivity;
import com.theinnerhour.b2b.activity.BotPwaActivity;
import com.theinnerhour.b2b.activity.CausesActivity;
import com.theinnerhour.b2b.activity.CopingActivity;
import com.theinnerhour.b2b.activity.DealingRacingMindActivity;
import com.theinnerhour.b2b.activity.DepressionExerciseActivity;
import com.theinnerhour.b2b.activity.DepressionGoodthingsActivity;
import com.theinnerhour.b2b.activity.DepressionHopeActivity;
import com.theinnerhour.b2b.activity.DepressionMasteryActivity;
import com.theinnerhour.b2b.activity.DepressionPleasurableActivity;
import com.theinnerhour.b2b.activity.DepressionThoughtsActivity;
import com.theinnerhour.b2b.activity.DepressionTimeoutActivity;
import com.theinnerhour.b2b.activity.DesigningHappinessActivity;
import com.theinnerhour.b2b.activity.EnduringActivity;
import com.theinnerhour.b2b.activity.GratitudeJournalComponentActivity;
import com.theinnerhour.b2b.activity.HappinessAndEnviromentActivity;
import com.theinnerhour.b2b.activity.HappinessLocusOfControlActivity;
import com.theinnerhour.b2b.activity.HappinessMindfulnessActivity;
import com.theinnerhour.b2b.activity.MapProgressActivity;
import com.theinnerhour.b2b.activity.MiniCourseActivity;
import com.theinnerhour.b2b.activity.MultipleActivitiesActivity;
import com.theinnerhour.b2b.activity.ProblemSolvingActivity;
import com.theinnerhour.b2b.activity.PushActivity;
import com.theinnerhour.b2b.activity.QuizActivity;
import com.theinnerhour.b2b.activity.RelaxationActivity;
import com.theinnerhour.b2b.activity.SleepChecklistActivity;
import com.theinnerhour.b2b.activity.SleepDosDontsActivity;
import com.theinnerhour.b2b.activity.SleepTimeTableActivity;
import com.theinnerhour.b2b.activity.SymptomsActivity;
import com.theinnerhour.b2b.activity.T1Activity;
import com.theinnerhour.b2b.activity.T2AActivity;
import com.theinnerhour.b2b.activity.T4CActivity;
import com.theinnerhour.b2b.activity.T5Activity;
import com.theinnerhour.b2b.activity.ThoughtsActivity;
import com.theinnerhour.b2b.activity.TipsActivity;
import com.theinnerhour.b2b.activity.VideoActivity;
import com.theinnerhour.b2b.activity.WebviewActivity;
import com.theinnerhour.b2b.adapter.GoalsAssessmentActivity;
import com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity;
import com.theinnerhour.b2b.components.chat.model.ChatUser;
import com.theinnerhour.b2b.components.community.activity.CommunitiesPwaActivity;
import com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity;
import com.theinnerhour.b2b.components.goals.activity.V2GoalsActivity;
import com.theinnerhour.b2b.components.monetization.activitiy.MonetizationActivity;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentProfileActivity;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.model.CourseDayModel;
import com.theinnerhour.b2b.model.CourseHeroBannerModel;
import com.theinnerhour.b2b.model.LearningHubFieldModel;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.PostsRead;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.LocationPersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseUtilKt;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.PaymentUtils;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import lv.e0;
import qt.h;
/* compiled from: CrashlyticsFileMarker.java */
/* loaded from: classes.dex */
public final class z implements dw.f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26147a;

    /* renamed from: b  reason: collision with root package name */
    public Object f26148b;

    /* renamed from: c  reason: collision with root package name */
    public Object f26149c;

    public z(JobParameters jobParameters, fh.b jobCompleteListener) {
        this.f26147a = 9;
        kotlin.jvm.internal.i.g(jobParameters, "jobParameters");
        kotlin.jvm.internal.i.g(jobCompleteListener, "jobCompleteListener");
        this.f26148b = jobParameters;
        this.f26149c = jobCompleteListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static z b(Context context) {
        Throwable e10;
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
                try {
                    return new z(fileChannel, 6, fileLock);
                } catch (IOException e11) {
                    e10 = e11;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e10);
                    if (fileLock != null) {
                        try {
                            fileLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                } catch (Error e12) {
                    e10 = e12;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e10);
                    if (fileLock != null) {
                    }
                    if (fileChannel != null) {
                    }
                    return null;
                } catch (OverlappingFileLockException e13) {
                    e10 = e13;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e10);
                    if (fileLock != null) {
                    }
                    if (fileChannel != null) {
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e14) {
                e10 = e14;
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e15) {
            e10 = e15;
            fileChannel = null;
            fileLock = null;
        }
    }

    public static void c(String str, String str2, Bundle bundle, Bundle bundle2) {
        String string = bundle.getString(str);
        if (!TextUtils.isEmpty(string)) {
            bundle2.putString(str2, string);
        }
    }

    public static boolean h(Object obj) {
        try {
            try {
                new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(obj.toString());
                return true;
            } catch (ParseException unused) {
                Double.parseDouble(obj.toString());
                return true;
            }
        } catch (NumberFormatException unused2) {
            return false;
        }
    }

    @Override // dw.f
    public final Object a(Object obj) {
        Charset a10;
        lv.e0 e0Var = (lv.e0) obj;
        sf.i iVar = (sf.i) this.f26148b;
        e0.a aVar = e0Var.f24601u;
        if (aVar == null) {
            zv.h g5 = e0Var.g();
            lv.v e10 = e0Var.e();
            if (e10 == null) {
                a10 = null;
            } else {
                a10 = e10.a(gv.a.f16927b);
            }
            if (a10 == null) {
                a10 = gv.a.f16927b;
            }
            aVar = new e0.a(g5, a10);
            e0Var.f24601u = aVar;
        }
        iVar.getClass();
        yf.a aVar2 = new yf.a(aVar);
        aVar2.f38536v = iVar.f31505k;
        try {
            Object a11 = ((sf.v) this.f26149c).a(aVar2);
            if (aVar2.y0() == 10) {
                return a11;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            e0Var.close();
        }
    }

    public final boolean d(ke.i iVar) {
        Iterator iteratorFrom = ((ImmutableSortedSet) this.f26148b).iteratorFrom(new je.c(0, iVar));
        if (!iteratorFrom.hasNext()) {
            return false;
        }
        return ((je.c) iteratorFrom.next()).f21804a.equals(iVar);
    }

    public final void e() {
        try {
            sd.b bVar = (sd.b) this.f26149c;
            bVar.getClass();
            new File(bVar.f31460b, (String) this.f26148b).createNewFile();
        } catch (IOException e10) {
            Log.e("FirebaseCrashlytics", "Error creating marker: " + ((String) this.f26148b), e10);
        }
    }

    public final void f(int[] iArr, int i6) {
        int[] iArr2;
        eg.b bVar;
        if (i6 != 0) {
            int length = iArr.length - i6;
            if (length > 0) {
                char c10 = 0;
                int i10 = 1;
                if (i6 >= ((List) this.f26149c).size()) {
                    List list = (List) this.f26149c;
                    eg.b bVar2 = (eg.b) list.get(list.size() - 1);
                    int size = ((List) this.f26149c).size();
                    while (size <= i6) {
                        eg.a aVar = (eg.a) this.f26148b;
                        int[] iArr3 = new int[2];
                        iArr3[c10] = i10;
                        iArr3[i10] = aVar.f13963a[(size - 1) + aVar.f];
                        eg.b bVar3 = new eg.b(aVar, iArr3);
                        bVar2.getClass();
                        eg.a aVar2 = bVar2.f13968a;
                        if (aVar2.equals(aVar)) {
                            if (!bVar2.b() && !bVar3.b()) {
                                int[] iArr4 = bVar2.f13969b;
                                int length2 = iArr4.length;
                                int[] iArr5 = bVar3.f13969b;
                                int length3 = iArr5.length;
                                int[] iArr6 = new int[(length2 + length3) - 1];
                                for (int i11 = 0; i11 < length2; i11++) {
                                    int i12 = iArr4[i11];
                                    for (int i13 = 0; i13 < length3; i13++) {
                                        int i14 = i11 + i13;
                                        iArr6[i14] = aVar2.a(i12, iArr5[i13]) ^ iArr6[i14];
                                    }
                                }
                                bVar2 = new eg.b(aVar2, iArr6);
                            } else {
                                bVar2 = aVar2.f13965c;
                            }
                            ((List) this.f26149c).add(bVar2);
                            size++;
                            c10 = 0;
                            i10 = 1;
                        } else {
                            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                        }
                    }
                }
                eg.b bVar4 = (eg.b) ((List) this.f26149c).get(i6);
                int[] iArr7 = new int[length];
                System.arraycopy(iArr, 0, iArr7, 0, length);
                eg.b c11 = new eg.b((eg.a) this.f26148b, iArr7).c(i6, 1);
                c11.getClass();
                eg.a aVar3 = bVar4.f13968a;
                eg.a aVar4 = c11.f13968a;
                if (aVar4.equals(aVar3)) {
                    if (!bVar4.b()) {
                        int[] iArr8 = bVar4.f13969b;
                        int i15 = iArr8[(iArr8.length - 1) - (iArr8.length - 1)];
                        if (i15 != 0) {
                            int i16 = aVar4.f13964b[i15];
                            int i17 = aVar4.f13963a[(aVar4.f13966d - i16) - 1];
                            eg.b bVar5 = aVar4.f13965c;
                            eg.b bVar6 = bVar5;
                            while (true) {
                                iArr2 = c11.f13969b;
                                if (iArr2.length - 1 < iArr8.length - 1 || c11.b()) {
                                    break;
                                }
                                int length4 = (iArr2.length - 1) - (iArr8.length - 1);
                                int[] iArr9 = c11.f13969b;
                                int a10 = aVar4.a(iArr9[(iArr9.length - 1) - (iArr2.length - 1)], i17);
                                eg.b c12 = bVar4.c(length4, a10);
                                if (length4 >= 0) {
                                    if (a10 == 0) {
                                        bVar = bVar5;
                                    } else {
                                        int[] iArr10 = new int[length4 + 1];
                                        iArr10[0] = a10;
                                        bVar = new eg.b(aVar4, iArr10);
                                    }
                                    bVar6 = bVar6.a(bVar);
                                    c11 = c11.a(c12);
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            }
                            int length5 = i6 - iArr2.length;
                            for (int i18 = 0; i18 < length5; i18++) {
                                iArr[length + i18] = 0;
                            }
                            System.arraycopy(iArr2, 0, iArr, length + length5, iArr2.length);
                            return;
                        }
                        throw new ArithmeticException();
                    }
                    throw new IllegalArgumentException("Divide by 0");
                }
                throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }

    public final V2DashboardActivity g() {
        V2DashboardActivity v2DashboardActivity = (V2DashboardActivity) this.f26149c;
        if (v2DashboardActivity != null) {
            return v2DashboardActivity;
        }
        kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:449:0x0c47 A[Catch: Exception -> 0x0c00, TryCatch #0 {Exception -> 0x0c00, blocks: (B:5:0x000f, B:8:0x001d, B:449:0x0c47, B:451:0x0c57, B:453:0x0c68, B:455:0x0c84, B:457:0x0caa, B:459:0x0ccd, B:460:0x0cf3, B:463:0x0d09, B:465:0x0d1d, B:467:0x0d30, B:469:0x0d39, B:471:0x0d4c, B:472:0x0d55, B:468:0x0d35, B:456:0x0c9b, B:473:0x0d5b, B:11:0x002e, B:14:0x0038, B:16:0x0052, B:17:0x0061, B:20:0x006b, B:21:0x0075, B:23:0x007d, B:24:0x0089, B:26:0x0091, B:27:0x009d, B:29:0x00a5, B:30:0x00b7, B:32:0x00bf, B:33:0x00e0, B:36:0x00ea, B:37:0x00f8, B:40:0x0104, B:41:0x0113, B:43:0x0119, B:45:0x012d, B:47:0x013f, B:49:0x0153, B:51:0x0167, B:52:0x0174, B:54:0x017a, B:56:0x018e, B:57:0x019b, B:60:0x01a7, B:61:0x01b9, B:64:0x01c3, B:65:0x01d6, B:68:0x01e2, B:69:0x01f2, B:71:0x01fa, B:72:0x0208, B:74:0x0211, B:75:0x0223, B:77:0x022b, B:78:0x0238, B:81:0x0244, B:82:0x0259, B:84:0x0261, B:85:0x026f, B:88:0x0278, B:91:0x0282, B:92:0x0296, B:94:0x029e, B:95:0x02a9, B:97:0x02b1, B:99:0x02b9, B:101:0x02c1, B:103:0x02c9, B:106:0x02d3, B:108:0x02db, B:109:0x02e8, B:111:0x02f0, B:112:0x02fd, B:114:0x0305, B:115:0x0312, B:117:0x031a, B:118:0x0327, B:120:0x032f, B:123:0x0339, B:125:0x033f, B:128:0x0347, B:130:0x034f, B:131:0x035c, B:133:0x0364, B:134:0x0371, B:136:0x0379, B:139:0x0383, B:142:0x0397, B:144:0x03a1, B:146:0x03a7, B:148:0x03ad, B:150:0x03b7, B:152:0x03cf, B:155:0x03db, B:157:0x03e5, B:159:0x03eb, B:161:0x03f1, B:163:0x03fb, B:166:0x0412, B:169:0x042e, B:171:0x0438, B:173:0x043e, B:175:0x0444, B:177:0x044e, B:179:0x045b, B:186:0x0497, B:180:0x046b, B:182:0x0479, B:185:0x048a, B:187:0x04b5, B:191:0x04cc, B:194:0x04f3, B:196:0x04fd, B:197:0x050a, B:199:0x0512, B:200:0x051f, B:202:0x0527, B:203:0x0534, B:206:0x053e, B:207:0x0549, B:209:0x0551, B:210:0x0560, B:212:0x0568, B:213:0x0575, B:215:0x057d, B:216:0x058a, B:219:0x0596, B:220:0x05b3, B:222:0x05bd, B:223:0x05c8, B:225:0x05d0, B:227:0x05e4, B:229:0x05ec, B:231:0x05f4, B:233:0x05fc, B:234:0x0609, B:236:0x0611, B:237:0x061e, B:240:0x062c, B:242:0x0636, B:243:0x0645, B:244:0x065f, B:246:0x0667, B:248:0x0671, B:249:0x0680, B:250:0x069a, B:252:0x06a2, B:254:0x06ac, B:255:0x06bb, B:256:0x06d5, B:258:0x06dd, B:259:0x06ea, B:261:0x06f2, B:262:0x06ff, B:264:0x0707, B:266:0x0715, B:267:0x0726, B:269:0x072e, B:271:0x0736, B:272:0x0743, B:274:0x074b, B:275:0x0758, B:277:0x0760, B:279:0x0768, B:281:0x0770, B:284:0x077a, B:286:0x0782, B:289:0x078c, B:291:0x0794, B:293:0x079c, B:295:0x07ae, B:297:0x07b4, B:300:0x07bb, B:302:0x07c9, B:303:0x0809, B:328:0x089b, B:327:0x0890, B:330:0x08a2, B:332:0x08aa, B:334:0x08bd, B:337:0x08c4, B:339:0x08cc, B:340:0x08d9, B:342:0x08e1, B:343:0x08ee, B:345:0x08f6, B:346:0x0903, B:348:0x090b, B:349:0x0918, B:351:0x0920, B:352:0x092d, B:354:0x0935, B:355:0x0942, B:357:0x094a, B:358:0x0957, B:360:0x095f, B:361:0x096c, B:363:0x0974, B:365:0x0982, B:367:0x0992, B:368:0x09a3, B:370:0x09ab, B:372:0x09b9, B:374:0x09c9, B:378:0x09e0, B:379:0x09f7, B:381:0x09ff, B:383:0x0a0d, B:385:0x0a1d, B:386:0x0a2e, B:388:0x0a36, B:390:0x0a44, B:392:0x0a54, B:393:0x0a65, B:395:0x0a6d, B:397:0x0a7b, B:399:0x0a8b, B:400:0x0a9c, B:402:0x0aa4, B:404:0x0ab2, B:406:0x0ac2, B:407:0x0ad3, B:409:0x0adb, B:411:0x0ae9, B:413:0x0af9, B:414:0x0b0a, B:416:0x0b12, B:417:0x0b23, B:419:0x0b2b, B:420:0x0b3b, B:422:0x0b43, B:423:0x0b53, B:425:0x0b5b, B:427:0x0b76, B:429:0x0b7b, B:428:0x0b79, B:430:0x0b87, B:432:0x0b8f, B:433:0x0ba8, B:435:0x0bb2, B:436:0x0bcd, B:438:0x0bd5, B:440:0x0be6, B:441:0x0bf3, B:444:0x0c04, B:445:0x0c15, B:446:0x0c2a, B:447:0x0c38), top: B:477:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0d4c A[Catch: Exception -> 0x0c00, TryCatch #0 {Exception -> 0x0c00, blocks: (B:5:0x000f, B:8:0x001d, B:449:0x0c47, B:451:0x0c57, B:453:0x0c68, B:455:0x0c84, B:457:0x0caa, B:459:0x0ccd, B:460:0x0cf3, B:463:0x0d09, B:465:0x0d1d, B:467:0x0d30, B:469:0x0d39, B:471:0x0d4c, B:472:0x0d55, B:468:0x0d35, B:456:0x0c9b, B:473:0x0d5b, B:11:0x002e, B:14:0x0038, B:16:0x0052, B:17:0x0061, B:20:0x006b, B:21:0x0075, B:23:0x007d, B:24:0x0089, B:26:0x0091, B:27:0x009d, B:29:0x00a5, B:30:0x00b7, B:32:0x00bf, B:33:0x00e0, B:36:0x00ea, B:37:0x00f8, B:40:0x0104, B:41:0x0113, B:43:0x0119, B:45:0x012d, B:47:0x013f, B:49:0x0153, B:51:0x0167, B:52:0x0174, B:54:0x017a, B:56:0x018e, B:57:0x019b, B:60:0x01a7, B:61:0x01b9, B:64:0x01c3, B:65:0x01d6, B:68:0x01e2, B:69:0x01f2, B:71:0x01fa, B:72:0x0208, B:74:0x0211, B:75:0x0223, B:77:0x022b, B:78:0x0238, B:81:0x0244, B:82:0x0259, B:84:0x0261, B:85:0x026f, B:88:0x0278, B:91:0x0282, B:92:0x0296, B:94:0x029e, B:95:0x02a9, B:97:0x02b1, B:99:0x02b9, B:101:0x02c1, B:103:0x02c9, B:106:0x02d3, B:108:0x02db, B:109:0x02e8, B:111:0x02f0, B:112:0x02fd, B:114:0x0305, B:115:0x0312, B:117:0x031a, B:118:0x0327, B:120:0x032f, B:123:0x0339, B:125:0x033f, B:128:0x0347, B:130:0x034f, B:131:0x035c, B:133:0x0364, B:134:0x0371, B:136:0x0379, B:139:0x0383, B:142:0x0397, B:144:0x03a1, B:146:0x03a7, B:148:0x03ad, B:150:0x03b7, B:152:0x03cf, B:155:0x03db, B:157:0x03e5, B:159:0x03eb, B:161:0x03f1, B:163:0x03fb, B:166:0x0412, B:169:0x042e, B:171:0x0438, B:173:0x043e, B:175:0x0444, B:177:0x044e, B:179:0x045b, B:186:0x0497, B:180:0x046b, B:182:0x0479, B:185:0x048a, B:187:0x04b5, B:191:0x04cc, B:194:0x04f3, B:196:0x04fd, B:197:0x050a, B:199:0x0512, B:200:0x051f, B:202:0x0527, B:203:0x0534, B:206:0x053e, B:207:0x0549, B:209:0x0551, B:210:0x0560, B:212:0x0568, B:213:0x0575, B:215:0x057d, B:216:0x058a, B:219:0x0596, B:220:0x05b3, B:222:0x05bd, B:223:0x05c8, B:225:0x05d0, B:227:0x05e4, B:229:0x05ec, B:231:0x05f4, B:233:0x05fc, B:234:0x0609, B:236:0x0611, B:237:0x061e, B:240:0x062c, B:242:0x0636, B:243:0x0645, B:244:0x065f, B:246:0x0667, B:248:0x0671, B:249:0x0680, B:250:0x069a, B:252:0x06a2, B:254:0x06ac, B:255:0x06bb, B:256:0x06d5, B:258:0x06dd, B:259:0x06ea, B:261:0x06f2, B:262:0x06ff, B:264:0x0707, B:266:0x0715, B:267:0x0726, B:269:0x072e, B:271:0x0736, B:272:0x0743, B:274:0x074b, B:275:0x0758, B:277:0x0760, B:279:0x0768, B:281:0x0770, B:284:0x077a, B:286:0x0782, B:289:0x078c, B:291:0x0794, B:293:0x079c, B:295:0x07ae, B:297:0x07b4, B:300:0x07bb, B:302:0x07c9, B:303:0x0809, B:328:0x089b, B:327:0x0890, B:330:0x08a2, B:332:0x08aa, B:334:0x08bd, B:337:0x08c4, B:339:0x08cc, B:340:0x08d9, B:342:0x08e1, B:343:0x08ee, B:345:0x08f6, B:346:0x0903, B:348:0x090b, B:349:0x0918, B:351:0x0920, B:352:0x092d, B:354:0x0935, B:355:0x0942, B:357:0x094a, B:358:0x0957, B:360:0x095f, B:361:0x096c, B:363:0x0974, B:365:0x0982, B:367:0x0992, B:368:0x09a3, B:370:0x09ab, B:372:0x09b9, B:374:0x09c9, B:378:0x09e0, B:379:0x09f7, B:381:0x09ff, B:383:0x0a0d, B:385:0x0a1d, B:386:0x0a2e, B:388:0x0a36, B:390:0x0a44, B:392:0x0a54, B:393:0x0a65, B:395:0x0a6d, B:397:0x0a7b, B:399:0x0a8b, B:400:0x0a9c, B:402:0x0aa4, B:404:0x0ab2, B:406:0x0ac2, B:407:0x0ad3, B:409:0x0adb, B:411:0x0ae9, B:413:0x0af9, B:414:0x0b0a, B:416:0x0b12, B:417:0x0b23, B:419:0x0b2b, B:420:0x0b3b, B:422:0x0b43, B:423:0x0b53, B:425:0x0b5b, B:427:0x0b76, B:429:0x0b7b, B:428:0x0b79, B:430:0x0b87, B:432:0x0b8f, B:433:0x0ba8, B:435:0x0bb2, B:436:0x0bcd, B:438:0x0bd5, B:440:0x0be6, B:441:0x0bf3, B:444:0x0c04, B:445:0x0c15, B:446:0x0c2a, B:447:0x0c38), top: B:477:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:495:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(String str, Bundle bundle, Integer num) {
        Object obj;
        String str2;
        Intent intent;
        String str3;
        Intent intent2;
        pp.c cVar;
        int i6;
        Exception exc;
        CourseDayModel courseDayModel;
        String str4;
        if (str == null) {
            return;
        }
        try {
            if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_PROGRESS)) {
                intent2 = new Intent(g(), MapProgressActivity.class);
            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_SLIDER_ASSESSMENT)) {
                intent2 = new Intent(g(), InitialAssessmentActivity.class);
                intent2.putExtra(Constants.API_COURSE_LINK, str);
                if (g().getIntent().getBooleanExtra(Constants.NEW_COURSE_FLAG, false)) {
                    intent2.putExtra(Constants.NEW_COURSE_FLAG, true);
                    g().getIntent().putExtra(Constants.NEW_COURSE_FLAG, false);
                }
            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_ENDURING_BEHAVIOUR)) {
                intent2 = new Intent(g(), EnduringActivity.class);
            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_THOUGHTS)) {
                intent2 = new Intent(g(), ThoughtsActivity.class);
            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_ACTIVITIES)) {
                intent2 = new Intent(g(), ActivitiesActivity.class);
            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_COPING)) {
                intent2 = new Intent(g(), CopingActivity.class);
                intent2.putExtra("enable_schedule", false);
            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_ARTICLE)) {
                intent2 = new Intent(g(), BlogActivity.class);
                CourseDayModel J0 = g().J0();
                kotlin.jvm.internal.i.d(J0);
                intent2.putExtra("course_position", J0.getPosition());
            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_ENDURING_ASSESSMENT)) {
                intent2 = new Intent(g(), GoalsAssessmentActivity.class);
                intent2.putExtra(Constants.API_COURSE_LINK, str);
            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_THOUGHTS_ARTICLE)) {
                intent2 = new Intent(g(), TipsActivity.class);
                intent2.putExtra("assesment_pos", 4);
            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_SYMPTOMS) && (kotlin.jvm.internal.i.b(g().I0().getCourseName(), Constants.COURSE_STRESS) || kotlin.jvm.internal.i.b(g().I0().getCourseName(), Constants.COURSE_DEPRESSION) || kotlin.jvm.internal.i.b(g().I0().getCourseName(), Constants.COURSE_WORRY) || kotlin.jvm.internal.i.b(g().I0().getCourseName(), Constants.COURSE_ANGER))) {
                intent2 = new Intent(g(), SymptomsActivity.class);
            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_SYMPTOMS) && kotlin.jvm.internal.i.b(g().I0().getCourseName(), Constants.COURSE_SLEEP)) {
                intent2 = new Intent(g(), CausesActivity.class);
            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_THOUGHTS_ACTIVITY)) {
                intent2 = new Intent(g(), RelaxationActivity.class);
                bundle.putString("activity_id", Constants.ACTIVITY_ID_STRESS_DEEP_BREATHING);
                hs.k kVar = hs.k.f19476a;
            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_FACTS)) {
                intent2 = new Intent(g(), TipsActivity.class);
                intent2.putExtra("assesment_pos", 0);
                intent2.putExtra("final_pos", 1);
            } else {
                boolean b10 = kotlin.jvm.internal.i.b(str, "physical_activity");
                obj = Constants.COURSE_DEPRESSION;
                if (b10) {
                    intent2 = new Intent(g(), RelaxationActivity.class);
                    bundle.putString("activity_id", Constants.ACTIVITY_ID_STRESS_CLIMBING_STAIRS);
                    hs.k kVar2 = hs.k.f19476a;
                } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_THOUGHTS_ASSESSMENT)) {
                    intent2 = new Intent(g(), GoalsAssessmentActivity.class);
                    intent2.putExtra(Constants.API_COURSE_LINK, str);
                } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_FACTS_DYK)) {
                    intent2 = new Intent(g(), TipsActivity.class);
                    intent2.putExtra("assesment_pos", 2);
                    intent2.putExtra("final_pos", 3);
                } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_QUIZ)) {
                    intent2 = new Intent(g(), QuizActivity.class);
                } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_ACTIVITY)) {
                    intent2 = new Intent(g(), MultipleActivitiesActivity.class);
                    intent2.putExtra(Constants.SCREEN_ACTIVITY_1, Constants.ACTIVITY_ID_STRESS_GUIDED_IMAGERY);
                    intent2.putExtra(Constants.SCREEN_ACTIVITY_2, Constants.ACTIVITY_ID_STRESS_CLIMBING_STAIRS);
                } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_SLIDER_ASSESSMENT_FINAL)) {
                    intent2 = new Intent(g(), InitialAssessmentActivity.class);
                    intent2.putExtra(Constants.API_COURSE_LINK, str);
                } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_TRAKCER)) {
                    return;
                } else {
                    if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_BROWSER)) {
                        intent2 = new Intent(g(), WebviewActivity.class);
                        intent2.putExtra(Constants.NOTIFICATION_URL, bundle.getString(Constants.NOTIFICATION_URL));
                    } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_POSITIVE_ENDURING_BEHAVIOUR)) {
                        intent2 = new Intent(g(), EnduringActivity.class);
                    } else {
                        if (!kotlin.jvm.internal.i.b(str, Constants.SCREEN_TIP_1) && !kotlin.jvm.internal.i.b(str, Constants.SCREEN_TIP_2) && !kotlin.jvm.internal.i.b(str, Constants.SCREEN_TIP_3) && !kotlin.jvm.internal.i.b(str, Constants.SCREEN_TIP_4) && !kotlin.jvm.internal.i.b(str, Constants.SCREEN_TIP_5)) {
                            if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_DOS_AND_DONTS)) {
                                intent2 = new Intent(g(), SleepDosDontsActivity.class);
                            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_RACING_MIND)) {
                                intent2 = new Intent(g(), DealingRacingMindActivity.class);
                            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_POSITIVE_AND_NEGATIVE)) {
                                intent2 = new Intent(g(), BenefitsOfSleepActivity.class);
                            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_TIME_TABLE)) {
                                intent2 = new Intent(g(), SleepTimeTableActivity.class);
                            } else {
                                if (!kotlin.jvm.internal.i.b(str, Constants.SCREEN_REASSESSMENT_1) && !kotlin.jvm.internal.i.b(str, Constants.SCREEN_REASSESSMENT_2)) {
                                    if (!kotlin.jvm.internal.i.b(str, Constants.SCREEN_ACTIVITY_1) && !kotlin.jvm.internal.i.b(str, Constants.SCREEN_ACTIVITY_2)) {
                                        if (kotlin.jvm.internal.i.b(str, "checklist")) {
                                            intent2 = new Intent(g(), SleepChecklistActivity.class);
                                        } else if (kotlin.jvm.internal.i.b(str, "activity_scheduling")) {
                                            intent2 = new Intent(g(), ActivityScheduling.class);
                                        } else {
                                            if (!kotlin.jvm.internal.i.b(str, Constants.SCREEN_MULTIPLE_TIPS_1) && !kotlin.jvm.internal.i.b(str, Constants.SCREEN_MULTIPLE_TIPS_2)) {
                                                boolean b11 = kotlin.jvm.internal.i.b(str, Constants.SCREEN_FIREBASE_CHAT);
                                                pp.c cVar2 = pp.c.FLOW_THERAPY;
                                                if (b11) {
                                                    String a10 = FirebaseAuth.getInstance().a();
                                                    if (a10 != null && !kotlin.jvm.internal.i.b(a10, "") && bundle.containsKey(Constants.FIREBASE_CHAT_TO_USER_ID) && kotlin.jvm.internal.i.b(bundle.getString(Constants.FIREBASE_CHAT_TO_USER_ID), a10)) {
                                                        intent2 = new Intent(g(), TelecommunicationsPWAActivity.class).putExtra("chat", true).putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar2);
                                                    } else {
                                                        str3 = Constants.API_COURSE_LINK;
                                                    }
                                                } else {
                                                    boolean b12 = kotlin.jvm.internal.i.b(str, Constants.SCREEN_PSYCHIATRIST_CHAT);
                                                    str3 = Constants.API_COURSE_LINK;
                                                    pp.c cVar3 = pp.c.FLOW_PSYCHIATRY;
                                                    if (b12) {
                                                        String a11 = FirebaseAuth.getInstance().a();
                                                        if (a11 != null && !kotlin.jvm.internal.i.b(a11, "") && bundle.containsKey(Constants.FIREBASE_CHAT_TO_USER_ID) && kotlin.jvm.internal.i.b(bundle.getString(Constants.FIREBASE_CHAT_TO_USER_ID), a11)) {
                                                            intent2 = new Intent(g(), TelecommunicationsPWAActivity.class).putExtra("chat", true).putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar3);
                                                            intent = intent2;
                                                            str2 = str3;
                                                            if (intent != null) {
                                                                intent.putExtras(bundle);
                                                                intent.putExtra(str2, str);
                                                                if (g().J0() != null) {
                                                                    CourseDayModel J02 = g().J0();
                                                                    kotlin.jvm.internal.i.d(J02);
                                                                    if (!J02.isCompleted()) {
                                                                        CourseDayModel J03 = g().J0();
                                                                        kotlin.jvm.internal.i.d(J03);
                                                                        CourseHeroBannerModel hero_banner = J03.getHero_banner();
                                                                        kotlin.jvm.internal.i.d(hero_banner);
                                                                        if (kotlin.jvm.internal.i.b(str, hero_banner.getLink())) {
                                                                            g().k1();
                                                                            g().startActivityForResult(intent, g().H0());
                                                                        } else {
                                                                            g().startActivityForResult(intent, g().K0());
                                                                        }
                                                                        Bundle bundle2 = new Bundle();
                                                                        bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                                                                        bundle2.putString(str2, str);
                                                                        User user = FirebasePersistence.getInstance().getUser();
                                                                        if (user != null) {
                                                                            Calendar calendar = Calendar.getInstance();
                                                                            calendar.setTimeInMillis(user.getCourseReminderTime() * 1000);
                                                                            bundle2.putString("reminder_time", new SimpleDateFormat("hh:mm").format(calendar.getTime()));
                                                                            hs.k kVar3 = hs.k.f19476a;
                                                                        }
                                                                        if (kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getVersion(), "v2.21") && kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getCurrentCourseName(), obj)) {
                                                                            CourseDayModel J04 = g().J0();
                                                                            kotlin.jvm.internal.i.d(J04);
                                                                            if (J04.getPosition() < 8) {
                                                                                bundle2.putBoolean("isNewActivities", true);
                                                                                bundle2.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                                                                                if (num != null) {
                                                                                    bundle2.putInt(Constants.DAYMODEL_POSITION, num.intValue());
                                                                                }
                                                                                UtilsKt.fireAnalytics("dashboard_component_start", bundle2);
                                                                                return;
                                                                            }
                                                                        }
                                                                        bundle2.putBoolean("isNewActivities", false);
                                                                        bundle2.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                                                                        if (num != null) {
                                                                        }
                                                                        UtilsKt.fireAnalytics("dashboard_component_start", bundle2);
                                                                        return;
                                                                    }
                                                                }
                                                                g().startActivityForResult(intent, g().K0());
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                    } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_COACH_CHAT)) {
                                                        String a12 = FirebaseAuth.getInstance().a();
                                                        if (a12 != null && !kotlin.jvm.internal.i.b(a12, "") && bundle.containsKey(Constants.FIREBASE_CHAT_TO_USER_ID) && kotlin.jvm.internal.i.b(bundle.getString(Constants.FIREBASE_CHAT_TO_USER_ID), a12)) {
                                                            Boolean SKIP_MONETIZATION = Constants.SKIP_MONETIZATION;
                                                            kotlin.jvm.internal.i.f(SKIP_MONETIZATION, "SKIP_MONETIZATION");
                                                            if (SKIP_MONETIZATION.booleanValue()) {
                                                                intent2 = new Intent(g(), ProInitialAssessmentActivity.class).putExtra("source", "chat");
                                                            } else if (!kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient") && kotlin.jvm.internal.i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE)) {
                                                                return;
                                                            } else {
                                                                intent2 = new Intent(g(), MonetizationActivity.class).putExtra("source", "chat");
                                                            }
                                                            ChatUser chatUser = new ChatUser();
                                                            chatUser.setKey(bundle.getString(Constants.FIREBASE_CHAT_FROM_USER_ID));
                                                            chatUser.setFirstName(bundle.getString(Constants.FIREBASE_CHAT_USERNAME));
                                                            intent2.putExtra("user", chatUser);
                                                            intent = intent2;
                                                            str2 = str3;
                                                            if (intent != null) {
                                                            }
                                                        }
                                                    } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_NOTIFICATION_ACTIVITY)) {
                                                        try {
                                                            Intent intent3 = new Intent(g(), ActivitiesInfoActivity.class);
                                                            LogHelper logHelper = LogHelper.INSTANCE;
                                                            String string = bundle.getString(Constants.GOAL_ID);
                                                            kotlin.jvm.internal.i.d(string);
                                                            logHelper.i((String) this.f26148b, "goal id of notification ".concat(string));
                                                            bundle.putString("activity_id", bundle.getString(Constants.GOAL_ID));
                                                            intent = intent3;
                                                            str2 = str3;
                                                            if (intent != null) {
                                                            }
                                                        } catch (Exception e10) {
                                                            e = e10;
                                                            LogHelper.INSTANCE.e(e);
                                                            return;
                                                        }
                                                    } else {
                                                        if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_GRATITUDE_JOURNAL)) {
                                                            intent2 = new Intent(g(), GratitudeJournalComponentActivity.class);
                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_DESIGNING_HAPPINESS)) {
                                                            intent2 = new Intent(g(), DesigningHappinessActivity.class);
                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_LOCUS_OF_CONTROL)) {
                                                            intent2 = new Intent(g(), HappinessLocusOfControlActivity.class);
                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_MINDFULNESS)) {
                                                            intent2 = new Intent(g(), HappinessMindfulnessActivity.class);
                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_MINDFULNESS_ACTIVITY)) {
                                                            intent2 = new Intent(g(), HappinessMindfulnessActivity.class);
                                                            intent2.putExtra("assesment_pos", 3);
                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_HAPPINESS_AND_ENVIROMENT)) {
                                                            intent2 = new Intent(g(), HappinessAndEnviromentActivity.class);
                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_THERAPIST_DETAIL)) {
                                                            intent2 = new Intent(g(), TelecommunicationsPWAActivity.class);
                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_THERAPIST_PACKAGES)) {
                                                            intent2 = new Intent(g(), TelecommunicationsPWAActivity.class);
                                                            intent2.putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.CROSS_PROVIDER);
                                                            intent2.putExtra("isTherapy", true);
                                                            intent2.putExtra("providerType", "therapist");
                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_THERAPY_PSYCHIATRY_CHOICE)) {
                                                            intent2 = new Intent(g(), TelecommunicationsPWAActivity.class);
                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_THERAPY_PSYCHIATRY_DRAWER_OPEN)) {
                                                            if (kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getVersion(), "v2.3") && LocationPersistence.INSTANCE.isIndianUser()) {
                                                                g().Z0();
                                                                return;
                                                            }
                                                            return;
                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_PROBLEM_SOLVING)) {
                                                            intent2 = new Intent(g(), ProblemSolvingActivity.class);
                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_ACCEPTING_UNCERTAINITY)) {
                                                            intent2 = new Intent(g(), AcceptingUncertaintyActivity.class);
                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_COACHMARKS_1)) {
                                                            if (g().E0()) {
                                                                intent2 = new Intent(g(), V2GoalsActivity.class).putExtra("source", Constants.SCREEN_DASHBOARD);
                                                            } else {
                                                                Extensions extensions = Extensions.INSTANCE;
                                                                V2DashboardActivity g5 = g();
                                                                String string2 = g().getString(R.string.goalMigrationProgress);
                                                                kotlin.jvm.internal.i.f(string2, "activity.getString(R.string.goalMigrationProgress)");
                                                                extensions.toast(g5, string2, 1);
                                                            }
                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_GOALS_LIST)) {
                                                            if (g().E0()) {
                                                                intent2 = new Intent(g(), V2GoalsActivity.class).putExtra("source", Constants.SCREEN_DASHBOARD);
                                                            } else {
                                                                Extensions extensions2 = Extensions.INSTANCE;
                                                                V2DashboardActivity g10 = g();
                                                                String string3 = g().getString(R.string.goalMigrationProgress);
                                                                kotlin.jvm.internal.i.f(string3, "activity.getString(R.string.goalMigrationProgress)");
                                                                extensions2.toast(g10, string3, 1);
                                                            }
                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_V3_ACTIVITY)) {
                                                            if (g().E0()) {
                                                                intent2 = new Intent(g(), V2GoalsActivity.class).putExtra("source", Constants.SCREEN_DASHBOARD);
                                                            } else {
                                                                Extensions extensions3 = Extensions.INSTANCE;
                                                                V2DashboardActivity g11 = g();
                                                                String string4 = g().getString(R.string.goalMigrationProgress);
                                                                kotlin.jvm.internal.i.f(string4, "activity.getString(R.string.goalMigrationProgress)");
                                                                extensions3.toast(g11, string4, 1);
                                                            }
                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_RELIEF_BOX)) {
                                                            intent2 = new Intent(g(), BotPwaActivity.class);
                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_PROFILE)) {
                                                            intent2 = new Intent(g(), ExperimentProfileActivity.class);
                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_CONTENT_MARKETING_LIST)) {
                                                            if (g().L0().size() > 0) {
                                                                ((RobertoButton) g().n0(R.id.buttonLearningHub)).performClick();
                                                                return;
                                                            } else {
                                                                g().n1();
                                                                return;
                                                            }
                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_T4C)) {
                                                            intent2 = new Intent(g(), T4CActivity.class);
                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_T2A)) {
                                                            intent2 = new Intent(g(), T2AActivity.class);
                                                        } else {
                                                            if (!kotlin.jvm.internal.i.b(str, Constants.SCREEN_T1F) && !kotlin.jvm.internal.i.b(str, Constants.SCREEN_T1I) && !kotlin.jvm.internal.i.b(str, Constants.SCREEN_T1H) && !kotlin.jvm.internal.i.b(str, Constants.SCREEN_T1G)) {
                                                                if (!kotlin.jvm.internal.i.b(str, Constants.SCREEN_COMMUNITY) && !kotlin.jvm.internal.i.b(str, Constants.SCREEN_COMMUNITY_POST)) {
                                                                    if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_CURRENT_ACTIVITY)) {
                                                                        if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                                                                            String[] strArr = {"v2.3", Constants.USER_VERSION};
                                                                            User user2 = FirebasePersistence.getInstance().getUser();
                                                                            if (user2 != null) {
                                                                                str4 = user2.getVersion();
                                                                            } else {
                                                                                str4 = null;
                                                                            }
                                                                            if (is.k.Q1(str4, strArr)) {
                                                                                if (!g().M0().isEmpty()) {
                                                                                    V2DashboardActivity g12 = g();
                                                                                    Intent putExtra = new Intent(g(), MiniCourseActivity.class).putExtra("data", "start");
                                                                                    String domain = g().M0().get(0).getDomain();
                                                                                    kotlin.jvm.internal.i.d(domain);
                                                                                    g12.startActivityForResult(putExtra.putExtra("mccourse", domain), g().G0());
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                        }
                                                                        V2DashboardActivity g13 = g();
                                                                        ArrayList<CourseDayModel> plan = g().I0().getPlan();
                                                                        long todayTimeInSeconds = Utils.INSTANCE.getTodayTimeInSeconds();
                                                                        try {
                                                                            int size = plan.size();
                                                                            courseDayModel = null;
                                                                            for (int i10 = 0; i10 < size; i10++) {
                                                                                try {
                                                                                    if (plan.get(i10).getPosition() != 1 && (plan.get(i10).getStart_date() == 0 || plan.get(i10).getStart_date() > todayTimeInSeconds)) {
                                                                                        if (i10 > 0 && plan.get(i10).getStart_date() == 0) {
                                                                                            int i11 = i10 - 1;
                                                                                            if (plan.get(i11).getStart_date() != 0) {
                                                                                                if (plan.get(i11).getStart_date() >= todayTimeInSeconds) {
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    courseDayModel = plan.get(i10);
                                                                                } catch (Exception e11) {
                                                                                    exc = e11;
                                                                                    LogHelper.INSTANCE.e(CourseUtilKt.getTAG_COURSEUTIL(), "exception", exc);
                                                                                    kotlin.jvm.internal.i.d(courseDayModel);
                                                                                    g13.o0(courseDayModel);
                                                                                    return;
                                                                                }
                                                                            }
                                                                        } catch (Exception e12) {
                                                                            exc = e12;
                                                                            courseDayModel = null;
                                                                        }
                                                                        kotlin.jvm.internal.i.d(courseDayModel);
                                                                        g13.o0(courseDayModel);
                                                                        return;
                                                                    } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_APP_FEEDBACK)) {
                                                                        g().x1(g());
                                                                        g().A0();
                                                                        return;
                                                                    } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_DASHBOARD)) {
                                                                        return;
                                                                    } else {
                                                                        if (kotlin.jvm.internal.i.b(str, Constants.NOTIFICATION_WORRY)) {
                                                                            intent2 = new Intent(g(), T5Activity.class);
                                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_PLEASURABLE_NEW)) {
                                                                            intent2 = new Intent(g(), DepressionPleasurableActivity.class);
                                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_HOPE_NEW)) {
                                                                            intent2 = new Intent(g(), DepressionHopeActivity.class);
                                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_TIMEOUT_NEW)) {
                                                                            intent2 = new Intent(g(), DepressionTimeoutActivity.class);
                                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_MASTERY_NEW)) {
                                                                            intent2 = new Intent(g(), DepressionMasteryActivity.class);
                                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_EXERCISES_NEW)) {
                                                                            intent2 = new Intent(g(), DepressionExerciseActivity.class);
                                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_THOUGHTS_NEW)) {
                                                                            intent2 = new Intent(g(), DepressionThoughtsActivity.class);
                                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_GOOD_THINGS_NEW)) {
                                                                            intent2 = new Intent(g(), DepressionGoodthingsActivity.class);
                                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_MONETIZATION) && (kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient") || !kotlin.jvm.internal.i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE))) {
                                                                            intent2 = new Intent(g(), MonetizationActivity.class).putExtra("source", "offer");
                                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_IN_REPURCHASE) && (kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient") || !kotlin.jvm.internal.i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE))) {
                                                                            if (kotlin.jvm.internal.i.b(PaymentUtils.INSTANCE.getSubscriptionType(SubscriptionPersistence.INSTANCE.getSubscriptionType()), "pro")) {
                                                                                i6 = 1;
                                                                            } else {
                                                                                i6 = 0;
                                                                            }
                                                                            intent2 = new Intent(g(), MonetizationActivity.class).putExtra("source", "repurchase").putExtra("tab", i6);
                                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.LINK_OFFER_PLUS_ANNUAL_PLUS_CLICK_4) && (kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient") || !kotlin.jvm.internal.i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE))) {
                                                                            intent2 = new Intent(g(), MonetizationActivity.class).putExtra("source", Constants.LINK_OFFER_PLUS_ANNUAL_PLUS_CLICK_4);
                                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.LINK_OFFER_PRO_QUARTERLY_PRO_CLICK_3) && (kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient") || !kotlin.jvm.internal.i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE))) {
                                                                            intent2 = new Intent(g(), MonetizationActivity.class).putExtra("source", Constants.LINK_OFFER_PRO_QUARTERLY_PRO_CLICK_3);
                                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.LINK_OFFER_PRO_QUARTERLY_FREE_TRIAL) && (kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient") || !kotlin.jvm.internal.i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE))) {
                                                                            intent2 = new Intent(g(), MonetizationActivity.class).putExtra("source", Constants.LINK_OFFER_PRO_QUARTERLY_FREE_TRIAL);
                                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.LINK_OFFER_PRO_QUARTERLY_PLUS_PURCHASE_CANCELLED) && (kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient") || !kotlin.jvm.internal.i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE))) {
                                                                            intent2 = new Intent(g(), MonetizationActivity.class).putExtra("source", Constants.LINK_OFFER_PRO_QUARTERLY_PLUS_PURCHASE_CANCELLED);
                                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.LINK_OFFER_60_PLUS_ANNUAL) && (kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient") || !kotlin.jvm.internal.i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE))) {
                                                                            intent2 = new Intent(g(), MonetizationActivity.class).putExtra("source", Constants.LINK_OFFER_60_PLUS_ANNUAL);
                                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.LINK_DYNAMIC_CAMPAIGN)) {
                                                                            intent2 = new Intent(g(), MonetizationActivity.class).putExtra("source", Constants.LINK_DYNAMIC_CAMPAIGN);
                                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.SESSION_DASHBOARD_THERAPY)) {
                                                                            intent2 = new Intent(g(), TelecommunicationsPWAActivity.class);
                                                                            intent2.putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar2);
                                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.SESSION_DASHBOARD_PSYCHIATRY)) {
                                                                            intent2 = new Intent(g(), TelecommunicationsPWAActivity.class);
                                                                            intent2.putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar3);
                                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.NOTIFICATION_PROVIDER_PROFILE)) {
                                                                            String string5 = bundle.getString("provider_type", "therapist");
                                                                            String string6 = bundle.getString("provider_uuid", "");
                                                                            Intent intent4 = new Intent(g(), TelecommunicationsPWAActivity.class);
                                                                            if (kotlin.jvm.internal.i.b(string5, "therapist")) {
                                                                                cVar = pp.c.PROFILE;
                                                                            } else {
                                                                                cVar = pp.c.PROFILE_PSYCHIATRIST;
                                                                            }
                                                                            intent2 = intent4.putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar).putExtra(SessionManager.KEY_UUID, string6);
                                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.LINK_COMMUNITIES_NOTIFICATION)) {
                                                                            intent2 = new Intent(g(), CommunitiesPwaActivity.class).putExtra("redirect_url", bundle.getString(Constants.NOTIFICATION_URL, ""));
                                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.LINK_TELECOMMUNICATION_CUSTOM_URL)) {
                                                                            intent2 = new Intent(g(), TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.FLOW_REDIRECT).putExtra("redirect_url", bundle.getString(Constants.NOTIFICATION_URL, ""));
                                                                        } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_VIDEO_1)) {
                                                                            intent2 = new Intent(g(), VideoActivity.class);
                                                                        }
                                                                    }
                                                                }
                                                                intent2 = new Intent(g(), CommunitiesPwaActivity.class);
                                                            }
                                                            intent2 = new Intent(g(), T1Activity.class);
                                                        }
                                                        intent = intent2;
                                                        str2 = str3;
                                                        if (intent != null) {
                                                        }
                                                    }
                                                }
                                                str2 = str3;
                                                intent = null;
                                                if (intent != null) {
                                                }
                                            }
                                            intent = new Intent(g(), TipsActivity.class);
                                            str2 = Constants.API_COURSE_LINK;
                                            bundle.putString(str2, str);
                                            if (intent != null) {
                                            }
                                        }
                                    }
                                    str2 = Constants.API_COURSE_LINK;
                                    intent = new Intent(g(), PushActivity.class);
                                    new Bundle().putString(str2, str);
                                    if (intent != null) {
                                    }
                                }
                                str2 = Constants.API_COURSE_LINK;
                                intent = new Intent(g(), GoalsAssessmentActivity.class);
                                intent.putExtra(str2, str);
                                if (intent != null) {
                                }
                            }
                        }
                        str2 = Constants.API_COURSE_LINK;
                        intent = new Intent(g(), TipsActivity.class);
                        intent.putExtra(str2, str);
                        if (intent != null) {
                        }
                    }
                }
                str3 = Constants.API_COURSE_LINK;
                intent = intent2;
                str2 = str3;
                if (intent != null) {
                }
            }
            obj = Constants.COURSE_DEPRESSION;
            str3 = Constants.API_COURSE_LINK;
            intent = intent2;
            str2 = str3;
            if (intent != null) {
            }
        } catch (Exception e13) {
            e = e13;
        }
    }

    public final ImmutableSortedSet j(int i6) {
        Iterator iteratorFrom = ((ImmutableSortedSet) this.f26149c).iteratorFrom(new je.c(i6, ke.i.f()));
        ImmutableSortedSet<ke.i> immutableSortedSet = ke.i.f23274w;
        while (iteratorFrom.hasNext()) {
            je.c cVar = (je.c) iteratorFrom.next();
            if (cVar.f21805b != i6) {
                break;
            }
            immutableSortedSet = immutableSortedSet.insert(cVar.f21804a);
        }
        return immutableSortedSet;
    }

    public final void k() {
        try {
            ((FileLock) this.f26149c).release();
            ((FileChannel) this.f26148b).close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    public final ImmutableSortedSet l(int i6) {
        Iterator iteratorFrom = ((ImmutableSortedSet) this.f26149c).iteratorFrom(new je.c(i6, ke.i.f()));
        ImmutableSortedSet<ke.i> immutableSortedSet = ke.i.f23274w;
        while (iteratorFrom.hasNext()) {
            je.c cVar = (je.c) iteratorFrom.next();
            if (cVar.f21805b != i6) {
                break;
            }
            immutableSortedSet = immutableSortedSet.insert(cVar.f21804a);
            this.f26148b = ((ImmutableSortedSet) this.f26148b).remove(cVar);
            this.f26149c = ((ImmutableSortedSet) this.f26149c).remove(cVar);
        }
        return immutableSortedSet;
    }

    public final gt.e m(wt.g gVar) {
        pu.i iVar;
        gt.g gVar2;
        fu.c e10 = gVar.e();
        if (e10 != null) {
            gVar.J();
        }
        nt.s s10 = gVar.s();
        if (s10 != null) {
            gt.e m10 = m(s10);
            if (m10 != null) {
                iVar = m10.A0();
            } else {
                iVar = null;
            }
            if (iVar != null) {
                gVar2 = iVar.g(gVar.getName(), ot.c.FROM_JAVA_LOADER);
            } else {
                gVar2 = null;
            }
            if (!(gVar2 instanceof gt.e)) {
                return null;
            }
            return (gt.e) gVar2;
        } else if (e10 == null) {
            return null;
        } else {
            fu.c e11 = e10.e();
            kotlin.jvm.internal.i.f(e11, "fqName.parent()");
            tt.m mVar = (tt.m) is.u.i2(((st.f) this.f26148b).c(e11));
            if (mVar == null) {
                return null;
            }
            tt.n nVar = mVar.D.f33603d;
            nVar.getClass();
            return nVar.v(gVar.getName(), gVar);
        }
    }

    public final void n(View view, LearningHubModel learningHubModel) {
        String str;
        try {
            String post_type = learningHubModel.getPost_type();
            if (post_type != null) {
                switch (post_type.hashCode()) {
                    case -1864532585:
                        if (!post_type.equals("Quotes")) {
                            break;
                        } else {
                            ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText(view.getContext().getString(R.string.resourceHeaderQuotes));
                            view.findViewById(R.id.tint).setVisibility(8);
                            ((RobertoTextView) view.findViewById(R.id.tvNew)).setTextColor(g0.a.b(g(), R.color.white));
                            ((RobertoTextView) view.findViewById(R.id.tvTitle)).setTextColor(g0.a.b(g(), R.color.white));
                            ((RobertoTextView) view.findViewById(R.id.tvTitleCard)).setTextColor(g0.a.b(g(), R.color.white));
                            ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(g0.a.b(g(), R.color.solid_dark_blue));
                            ((AppCompatImageView) view.findViewById(R.id.ivTitleCard)).setImageDrawable(a.c.b(g(), R.drawable.ic_quote_background));
                            break;
                        }
                    case -1692490108:
                        if (!post_type.equals("Creatives")) {
                            break;
                        } else {
                            ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText(view.getContext().getString(R.string.resourceHeaderCreatives));
                            view.findViewById(R.id.tint).setVisibility(0);
                            ((RobertoTextView) view.findViewById(R.id.tvNew)).setTextColor(g0.a.b(g(), R.color.white));
                            ((RobertoTextView) view.findViewById(R.id.tvTitle)).setTextColor(g0.a.b(g(), R.color.white));
                            ((RobertoTextView) view.findViewById(R.id.tvTitleCard)).setTextColor(g0.a.b(g(), R.color.white));
                            ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(g0.a.b(g(), R.color.grey_2));
                            break;
                        }
                    case -1164233123:
                        if (!post_type.equals("Articles")) {
                            break;
                        } else {
                            view.findViewById(R.id.tint).setVisibility(0);
                            ((RobertoTextView) view.findViewById(R.id.tvNew)).setTextColor(g0.a.b(g(), R.color.white));
                            ((RobertoTextView) view.findViewById(R.id.tvTitle)).setTextColor(g0.a.b(g(), R.color.white));
                            ((RobertoTextView) view.findViewById(R.id.tvTitleCard)).setTextColor(g0.a.b(g(), R.color.white));
                            ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(g0.a.b(g(), R.color.grey_2));
                            ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText(view.getContext().getString(R.string.resourceHeaderArticles));
                            break;
                        }
                    case -312086034:
                        if (!post_type.equals("Therapist says")) {
                            break;
                        } else {
                            ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText(view.getContext().getString(R.string.resourceHeaderTherapistSays));
                            view.findViewById(R.id.tint).setVisibility(8);
                            ((RobertoTextView) view.findViewById(R.id.tvNew)).setTextColor(g0.a.b(g(), R.color.white));
                            ((RobertoTextView) view.findViewById(R.id.tvTitle)).setTextColor(g0.a.b(g(), R.color.white));
                            ((RobertoTextView) view.findViewById(R.id.tvTitleCard)).setTextColor(g0.a.b(g(), R.color.white));
                            ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(g0.a.b(g(), R.color.alt_orange_light));
                            ((AppCompatImageView) view.findViewById(R.id.ivTitleCard)).setImageDrawable(a.c.b(g(), R.drawable.ic_therapist_says_background));
                            break;
                        }
                    case 2606936:
                        if (!post_type.equals("Tips")) {
                            break;
                        } else {
                            ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText(view.getContext().getString(R.string.resourceHeaderTips));
                            view.findViewById(R.id.tint).setVisibility(8);
                            ((RobertoTextView) view.findViewById(R.id.tvNew)).setTextColor(g0.a.b(g(), R.color.white));
                            ((RobertoTextView) view.findViewById(R.id.tvTitle)).setTextColor(g0.a.b(g(), R.color.white));
                            ((RobertoTextView) view.findViewById(R.id.tvTitleCard)).setTextColor(g0.a.b(g(), R.color.white));
                            ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(g0.a.b(g(), R.color.goalBlue));
                            ((AppCompatImageView) view.findViewById(R.id.ivTitleCard)).setImageDrawable(a.c.b(g(), R.drawable.ic_tips_background));
                            break;
                        }
                }
            }
            kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
            ArrayList<PostsRead> postsRead = FirebasePersistence.getInstance().getUser().getPostsRead();
            Iterator<PostsRead> it = postsRead.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (kotlin.jvm.internal.i.b(it.next().getPostId(), learningHubModel.getId())) {
                        uVar.f23466u = true;
                    }
                }
            }
            if (learningHubModel.getDay() == ((int) g().I0().getCourseOpenDay()) && !uVar.f23466u) {
                ((RobertoTextView) view.findViewById(R.id.tvNew)).setVisibility(0);
            } else {
                ((RobertoTextView) view.findViewById(R.id.tvNew)).setVisibility(8);
            }
            Iterator<LearningHubFieldModel> it2 = learningHubModel.getFields().iterator();
            while (it2.hasNext()) {
                LearningHubFieldModel next = it2.next();
                if (kotlin.jvm.internal.i.b(next.getData_title(), "cover") && !g().isFinishing()) {
                    com.bumptech.glide.e<Bitmap> a10 = Glide.g(g().getApplicationContext()).a();
                    a10.Z = next.getValue();
                    a10.f5953b0 = true;
                    a10.B((AppCompatImageView) view.findViewById(R.id.ivTitleCard));
                }
                String str2 = "";
                String str3 = null;
                if (kotlin.jvm.internal.i.b(next.getData_title(), "title")) {
                    RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.tvTitleCard);
                    Object value = next.getValue();
                    if (value instanceof String) {
                        str = (String) value;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    robertoTextView.setText(str);
                }
                if (kotlin.jvm.internal.i.b(next.getData_title(), "short_desc")) {
                    RobertoTextView robertoTextView2 = (RobertoTextView) view.findViewById(R.id.tvTitleCard);
                    Object value2 = next.getValue();
                    if (value2 instanceof String) {
                        str3 = (String) value2;
                    }
                    if (str3 != null) {
                        str2 = str3;
                    }
                    robertoTextView2.setText(str2);
                }
            }
            view.setOnClickListener(new ek.p(uVar, learningHubModel, postsRead, view, this, 1));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e((String) this.f26148b, "exception", e10);
        }
    }

    public final String toString() {
        switch (this.f26147a) {
            case 13:
                StringBuilder sb2 = new StringBuilder("{\"Background\":{\"color\":");
                sb2.append((pi.f) this.f26149c);
                sb2.append(", \"content\":\"");
                return r1.b0.b(sb2, (String) this.f26148b, "\"}}");
            case 14:
                return "InAppComponent{content='" + ((String) this.f26148b) + "', style=" + ((ui.e) this.f26149c) + '}';
            case 15:
                return "Token(pushToken='" + ((String) this.f26148b) + "', service=" + ((pj.c) this.f26149c) + ')';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ z(Object obj, int i6, Object obj2) {
        this.f26147a = i6;
        this.f26148b = obj;
        this.f26149c = obj2;
    }

    public z(String str) {
        kh.a aVar = kh.a.MODULE_NOT_FOUND;
        this.f26147a = 10;
        this.f26149c = aVar;
        this.f26148b = str;
    }

    public z(st.f fVar) {
        h.a aVar = qt.h.f30127a;
        this.f26147a = 19;
        this.f26148b = fVar;
        this.f26149c = aVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z() {
        this((String) null);
        this.f26147a = 10;
    }

    public z(Object obj) {
        this.f26147a = 20;
        this.f26148b = obj;
        this.f26149c = Thread.currentThread();
    }

    public z(int i6) {
        this.f26147a = i6;
        if (i6 == 5) {
            this.f26148b = new ImmutableSortedSet(Collections.emptyList(), je.c.f21802c);
            this.f26149c = new ImmutableSortedSet(Collections.emptyList(), je.c.f21803d);
        } else if (i6 != 16) {
            this.f26148b = new AtomicInteger();
            this.f26149c = new AtomicInteger();
        } else {
            this.f26148b = LogHelper.INSTANCE.makeLogTag(z.class);
        }
    }

    public z(pi.f fVar, String str) {
        this.f26147a = 13;
        this.f26149c = fVar;
        this.f26148b = str;
    }

    public z(eg.a aVar) {
        this.f26147a = 8;
        this.f26148b = aVar;
        ArrayList arrayList = new ArrayList();
        this.f26149c = arrayList;
        arrayList.add(new eg.b(aVar, new int[]{1}));
    }

    public z(xd.a aVar) {
        Bundle bundle;
        Bundle bundle2;
        this.f26147a = 2;
        this.f26148b = aVar;
        Bundle bundle3 = new Bundle();
        if (aVar.f0() != null && (bundle = aVar.f0().getBundle("scionData")) != null && (bundle2 = bundle.getBundle("_cmp")) != null) {
            c("medium", "utm_medium", bundle2, bundle3);
            c("source", "utm_source", bundle2, bundle3);
            c("campaign", "utm_campaign", bundle2, bundle3);
        }
        this.f26149c = bundle3;
    }

    public z(re.b bVar) {
        this.f26147a = 7;
        this.f26149c = DesugarCollections.synchronizedMap(new HashMap());
        this.f26148b = bVar;
    }
}
