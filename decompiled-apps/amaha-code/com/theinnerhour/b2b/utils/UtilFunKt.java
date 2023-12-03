package com.theinnerhour.b2b.utils;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.theinnerhour.b2b.model.CompassionLetterModel;
import com.theinnerhour.b2b.model.CompassionLetterStorageModel;
import com.theinnerhour.b2b.model.ProsAndConsModel;
import com.theinnerhour.b2b.model.ScreenResult10Model;
import com.theinnerhour.b2b.model.ScreenResult11Model;
import com.theinnerhour.b2b.model.ScreenResult13Model;
import com.theinnerhour.b2b.model.ScreenResult14Model;
import com.theinnerhour.b2b.model.ScreenResult15Model;
import com.theinnerhour.b2b.model.ScreenResult16Model;
import com.theinnerhour.b2b.model.ScreenResult17Model;
import com.theinnerhour.b2b.model.ScreenResult1Model;
import com.theinnerhour.b2b.model.ScreenResult21Model;
import com.theinnerhour.b2b.model.ScreenResult22Model;
import com.theinnerhour.b2b.model.ScreenResult23Model;
import com.theinnerhour.b2b.model.ScreenResult25Model;
import com.theinnerhour.b2b.model.ScreenResult26Model;
import com.theinnerhour.b2b.model.ScreenResult28Model;
import com.theinnerhour.b2b.model.ScreenResult2Model;
import com.theinnerhour.b2b.model.ScreenResult30Model;
import com.theinnerhour.b2b.model.ScreenResult31Model;
import com.theinnerhour.b2b.model.ScreenResult3Model;
import com.theinnerhour.b2b.model.ScreenResult4Model;
import com.theinnerhour.b2b.model.ScreenResult6Model;
import com.theinnerhour.b2b.model.ScreenResult7Model;
import com.theinnerhour.b2b.model.ScreenResult8Model;
import com.theinnerhour.b2b.model.ScreenResult9Model;
import com.theinnerhour.b2b.model.ScreenResultGoodthingsModel;
import com.theinnerhour.b2b.model.ScreenResultGratitudeModel;
import com.theinnerhour.b2b.model.ScreenResultGroundingModel;
import com.theinnerhour.b2b.model.ScreenResultPleasurableModel;
import com.theinnerhour.b2b.model.ScreenResultPositiveQualities;
import com.theinnerhour.b2b.model.ScreenResultThoughtsModel;
import com.theinnerhour.b2b.model.TaskIn2Min;
import com.theinnerhour.b2b.model.UrgentImportantModel;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
/* compiled from: UtilFun.kt */
@Metadata(d1 = {"\u0000\u0090\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u001a\u0010\u0010\t\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u001a \u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000bj\b\u0012\u0004\u0012\u00020\u0003`\f2\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u001a \u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000bj\b\u0012\u0004\u0012\u00020\u000f`\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a\u0010\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a\u0010\u0010\u0014\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a \u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u000bj\b\u0012\u0004\u0012\u00020\u0013`\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a\u0010\u0010\u0017\u001a\u00020\u00162\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a \u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u000bj\b\u0012\u0004\u0012\u00020\u0016`\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a \u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u000bj\b\u0012\u0004\u0012\u00020\u0019`\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a\u0010\u0010\u001c\u001a\u00020\u001b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a\u0010\u0010\u001e\u001a\u00020\u001d2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a\u0010\u0010 \u001a\u00020\u001f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a \u0010\"\u001a\u0012\u0012\u0004\u0012\u00020!0\u000bj\b\u0012\u0004\u0012\u00020!`\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a \u0010$\u001a\u0012\u0012\u0004\u0012\u00020#0\u000bj\b\u0012\u0004\u0012\u00020#`\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a\u0010\u0010&\u001a\u00020%2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a \u0010(\u001a\u0012\u0012\u0004\u0012\u00020'0\u000bj\b\u0012\u0004\u0012\u00020'`\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a \u0010*\u001a\u0012\u0012\u0004\u0012\u00020)0\u000bj\b\u0012\u0004\u0012\u00020)`\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a \u0010,\u001a\u0012\u0012\u0004\u0012\u00020+0\u000bj\b\u0012\u0004\u0012\u00020+`\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a.\u00100\u001a\u00020/2&\u0010\u000e\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00070-j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0007`.\u001a \u00102\u001a\u0012\u0012\u0004\u0012\u0002010\u000bj\b\u0012\u0004\u0012\u000201`\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a \u00104\u001a\u0012\u0012\u0004\u0012\u0002030\u000bj\b\u0012\u0004\u0012\u000203`\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a \u00106\u001a\u0012\u0012\u0004\u0012\u0002050\u000bj\b\u0012\u0004\u0012\u000205`\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a \u00108\u001a\u0012\u0012\u0004\u0012\u0002070\u000bj\b\u0012\u0004\u0012\u000207`\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a \u0010:\u001a\u0012\u0012\u0004\u0012\u0002090\u000bj\b\u0012\u0004\u0012\u000209`\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a\u0010\u0010<\u001a\u00020;2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a\u0010\u0010>\u001a\u00020=2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a \u0010@\u001a\u0012\u0012\u0004\u0012\u00020?0\u000bj\b\u0012\u0004\u0012\u00020?`\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a \u0010B\u001a\u0012\u0012\u0004\u0012\u00020A0\u000bj\b\u0012\u0004\u0012\u00020A`\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a \u0010D\u001a\u0012\u0012\u0004\u0012\u00020C0\u000bj\b\u0012\u0004\u0012\u00020C`\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a\u0010\u0010F\u001a\u00020E2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a \u0010H\u001a\u0012\u0012\u0004\u0012\u00020G0\u000bj\b\u0012\u0004\u0012\u00020G`\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a \u0010J\u001a\u0012\u0012\u0004\u0012\u00020I0\u000bj\b\u0012\u0004\u0012\u00020I`\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a\u000e\u0010N\u001a\u00020M2\u0006\u0010L\u001a\u00020K\u001a\u000e\u0010O\u001a\u00020M2\u0006\u0010L\u001a\u00020K\u001a \u0010Q\u001a\u0012\u0012\u0004\u0012\u00020P0\u000bj\b\u0012\u0004\u0012\u00020P`\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a \u0010S\u001a\u0012\u0012\u0004\u0012\u00020R0\u000bj\b\u0012\u0004\u0012\u00020R`\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a \u0010U\u001a\u0012\u0012\u0004\u0012\u00020T0\u000bj\b\u0012\u0004\u0012\u00020T`\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a \u0010W\u001a\u0012\u0012\u0004\u0012\u00020V0\u000bj\b\u0012\u0004\u0012\u00020V`\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a \u0010Y\u001a\u0012\u0012\u0004\u0012\u00020X0\u000bj\b\u0012\u0004\u0012\u00020X`\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u001a \u0010[\u001a\u0012\u0012\u0004\u0012\u00020Z0\u000bj\b\u0012\u0004\u0012\u00020Z`\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\"\u0017\u0010\\\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_¨\u0006`"}, d2 = {"", "age", "getHours", "", "html", "Landroid/text/Spanned;", "fromHtml", "", "paramString", "paramsMapToString", "listOfMap", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "paramsMapToList", "data", "Lcom/theinnerhour/b2b/model/ScreenResult1Model;", "result1ListMapToObject", "Lcom/theinnerhour/b2b/model/ScreenResult2Model;", "result2MapToObject", "Lcom/theinnerhour/b2b/model/ScreenResult3Model;", "result3MapToObject", "result3ListMapToObject", "Lcom/theinnerhour/b2b/model/ScreenResult4Model;", "result4MapToObject", "result4ListMapToObject", "Lcom/theinnerhour/b2b/model/ScreenResult6Model;", "result6MapToObject", "Lcom/theinnerhour/b2b/model/ScreenResult7Model;", "result7MapToObject", "Lcom/theinnerhour/b2b/model/ScreenResult8Model;", "result8MapToObject", "Lcom/theinnerhour/b2b/model/ScreenResult15Model;", "result15MapToObject", "Lcom/theinnerhour/b2b/model/ScreenResult9Model;", "result9MapToObject", "Lcom/theinnerhour/b2b/model/ScreenResult10Model;", "result10MapToObject", "Lcom/theinnerhour/b2b/model/ScreenResult13Model;", "result13MapToObject", "Lcom/theinnerhour/b2b/model/ScreenResult14Model;", "result14ListMapToObject", "Lcom/theinnerhour/b2b/model/ProsAndConsModel;", "prosConsListMapToObject", "Lcom/theinnerhour/b2b/model/ScreenResult16Model;", "result16MapToObject", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Lcom/theinnerhour/b2b/model/ScreenResult17Model;", "result17MapToObject", "Lcom/theinnerhour/b2b/model/ScreenResult21Model;", "result21MapListToObject", "Lcom/theinnerhour/b2b/model/UrgentImportantModel;", "urgentImportantMapListToObject", "Lcom/theinnerhour/b2b/model/ScreenResult22Model;", "result22MapListToObject", "Lcom/theinnerhour/b2b/model/TaskIn2Min;", "taskIn2MinMapListToObject", "Lcom/theinnerhour/b2b/model/ScreenResult23Model;", "result23MapToObject", "Lcom/theinnerhour/b2b/model/ScreenResult25Model;", "result25MapToObject", "Lcom/theinnerhour/b2b/model/ScreenResult26Model;", "result26MapToObject", "Lcom/theinnerhour/b2b/model/ScreenResult28Model;", "result28MapListToObject", "Lcom/theinnerhour/b2b/model/ScreenResult30Model;", "result30MapToObject", "Lcom/theinnerhour/b2b/model/ScreenResult31Model;", "result31MapToObject", "Lcom/theinnerhour/b2b/model/ScreenResult11Model;", "gratitudeLetterMapToObject", "Lcom/theinnerhour/b2b/model/CompassionLetterStorageModel;", "compassionFileMapToObject", "Lcom/theinnerhour/b2b/model/CompassionLetterModel;", "compassionLetterMapToObject", "Landroid/view/View;", "v", "Lhs/k;", "expand", "collapse", "Lcom/theinnerhour/b2b/model/ScreenResultGratitudeModel;", "resultGratitudeMapToObject", "Lcom/theinnerhour/b2b/model/ScreenResultGroundingModel;", "resultGroundingMapToObject", "Lcom/theinnerhour/b2b/model/ScreenResultPositiveQualities;", "resultPositiveQualitiesMapToObject", "Lcom/theinnerhour/b2b/model/ScreenResultGoodthingsModel;", "resultGoodThingsNewMapToObject", "Lcom/theinnerhour/b2b/model/ScreenResultThoughtsModel;", "resultThoughtsNewMapToObject", "Lcom/theinnerhour/b2b/model/ScreenResultPleasurableModel;", "resultPleasurableNewMapToObject", "TAG_UTILFUN", "Ljava/lang/String;", "getTAG_UTILFUN", "()Ljava/lang/String;", "app_productionRelease"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class UtilFunKt {
    private static final String TAG_UTILFUN = LogHelper.INSTANCE.makeLogTag("UtilFun");

    public static final void collapse(final View v10) {
        kotlin.jvm.internal.i.g(v10, "v");
        final int measuredHeight = v10.getMeasuredHeight();
        Animation animation = new Animation() { // from class: com.theinnerhour.b2b.utils.UtilFunKt$collapse$a$1
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation t3) {
                boolean z10;
                kotlin.jvm.internal.i.g(t3, "t");
                if (f == 1.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    v10.setVisibility(8);
                    return;
                }
                ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
                int i6 = measuredHeight;
                layoutParams.height = i6 - ((int) (i6 * f));
                v10.requestLayout();
            }

            @Override // android.view.animation.Animation
            public boolean willChangeBounds() {
                return true;
            }
        };
        animation.setDuration((int) (measuredHeight / v10.getContext().getResources().getDisplayMetrics().density));
        v10.startAnimation(animation);
    }

    public static final ArrayList<CompassionLetterStorageModel> compassionFileMapToObject(Object obj) {
        ArrayList<HashMap> arrayList;
        Long l2;
        long timeInSeconds;
        String str;
        String str2;
        ArrayList<CompassionLetterStorageModel> arrayList2 = new ArrayList<>();
        try {
            if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (HashMap hashMap : arrayList) {
                    Utils utils = Utils.INSTANCE;
                    CompassionLetterStorageModel compassionLetterStorageModel = new CompassionLetterStorageModel(utils.getTimeInSeconds(), "", "");
                    Object obj2 = hashMap.get("date");
                    if (obj2 instanceof Long) {
                        l2 = (Long) obj2;
                    } else {
                        l2 = null;
                    }
                    if (l2 != null) {
                        timeInSeconds = l2.longValue();
                    } else {
                        timeInSeconds = utils.getTimeInSeconds();
                    }
                    compassionLetterStorageModel.setDate(timeInSeconds);
                    Object obj3 = hashMap.get("fileName");
                    if (obj3 instanceof String) {
                        str = (String) obj3;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    compassionLetterStorageModel.setFileName(str);
                    Object obj4 = hashMap.get("downloadUrl");
                    if (obj4 instanceof String) {
                        str2 = (String) obj4;
                    } else {
                        str2 = null;
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    compassionLetterStorageModel.setDownloadUrl(str2);
                    arrayList2.add(compassionLetterStorageModel);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return arrayList2;
    }

    public static final ArrayList<CompassionLetterModel> compassionLetterMapToObject(Object obj) {
        ArrayList<HashMap> arrayList;
        Long l2;
        long timeInSeconds;
        String str;
        ArrayList<CompassionLetterModel> arrayList2 = new ArrayList<>();
        try {
            if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (HashMap hashMap : arrayList) {
                    CompassionLetterModel compassionLetterModel = new CompassionLetterModel("");
                    Object obj2 = hashMap.get("date");
                    if (obj2 instanceof Long) {
                        l2 = (Long) obj2;
                    } else {
                        l2 = null;
                    }
                    if (l2 != null) {
                        timeInSeconds = l2.longValue();
                    } else {
                        timeInSeconds = Utils.INSTANCE.getTimeInSeconds();
                    }
                    compassionLetterModel.setDate(timeInSeconds);
                    Object obj3 = hashMap.get("letter");
                    if (obj3 instanceof String) {
                        str = (String) obj3;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    compassionLetterModel.setLetter(str);
                    arrayList2.add(compassionLetterModel);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return arrayList2;
    }

    public static final void expand(final View v10) {
        kotlin.jvm.internal.i.g(v10, "v");
        v10.measure(-1, -2);
        final int measuredHeight = v10.getMeasuredHeight();
        v10.getLayoutParams().height = 1;
        v10.setVisibility(0);
        Animation animation = new Animation() { // from class: com.theinnerhour.b2b.utils.UtilFunKt$expand$a$1
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation t3) {
                boolean z10;
                int i6;
                kotlin.jvm.internal.i.g(t3, "t");
                ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
                if (f == 1.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i6 = -2;
                } else {
                    i6 = (int) (measuredHeight * f);
                }
                layoutParams.height = i6;
                v10.requestLayout();
            }

            @Override // android.view.animation.Animation
            public boolean willChangeBounds() {
                return true;
            }
        };
        animation.setDuration((int) (measuredHeight / v10.getContext().getResources().getDisplayMetrics().density));
        v10.startAnimation(animation);
    }

    public static final Spanned fromHtml(String str) {
        Spanned fromHtml;
        if (Build.VERSION.SDK_INT >= 24) {
            fromHtml = Html.fromHtml(str, 0);
            kotlin.jvm.internal.i.f(fromHtml, "{\n        Html.fromHtml(…M_HTML_MODE_LEGACY)\n    }");
            return fromHtml;
        }
        Spanned fromHtml2 = Html.fromHtml(str);
        kotlin.jvm.internal.i.f(fromHtml2, "{\n        Html.fromHtml(html)\n    }");
        return fromHtml2;
    }

    public static final int getHours(int i6) {
        if (i6 < 18) {
            return 9;
        }
        if (i6 < 65) {
            return 8;
        }
        return 7;
    }

    public static final String getTAG_UTILFUN() {
        return TAG_UTILFUN;
    }

    public static final ScreenResult11Model gratitudeLetterMapToObject(Object obj) {
        HashMap hashMap;
        ScreenResult11Model screenResult11Model = new ScreenResult11Model();
        if (obj != null) {
            try {
                if (obj instanceof HashMap) {
                    hashMap = (HashMap) obj;
                } else {
                    hashMap = null;
                }
                if (hashMap != null) {
                    if (hashMap.get("gratitude_files") != null) {
                        screenResult11Model.setGratitude_files(compassionFileMapToObject(hashMap.get("gratitude_files")));
                    }
                    if (hashMap.get("gratitude_in_app_letter") != null) {
                        screenResult11Model.setGratitude_in_app_letter(compassionLetterMapToObject(hashMap.get("gratitude_in_app_letter")));
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
            }
        }
        return screenResult11Model;
    }

    public static final ArrayList<String> paramsMapToList(Object obj) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (obj != null) {
            try {
                for (HashMap hashMap : (ArrayList) obj) {
                    Object obj2 = hashMap.get("list_key");
                    kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.String");
                    arrayList.add((String) obj2);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
            }
        }
        return arrayList;
    }

    public static final String paramsMapToString(Object obj) {
        if (obj == null) {
            return "";
        }
        try {
            if (!(obj instanceof String)) {
                return "";
            }
            return (String) obj;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
            return "";
        }
    }

    public static final ArrayList<ProsAndConsModel> prosConsListMapToObject(Object obj) {
        ArrayList<HashMap> arrayList;
        String str;
        Long l2;
        ArrayList<ProsAndConsModel> arrayList2 = new ArrayList<>();
        try {
            if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (HashMap hashMap : arrayList) {
                    int i6 = 0;
                    ProsAndConsModel prosAndConsModel = new ProsAndConsModel("", 0);
                    Object obj2 = hashMap.get("text");
                    if (obj2 instanceof String) {
                        str = (String) obj2;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    prosAndConsModel.setText(str);
                    Object obj3 = hashMap.get("value");
                    if (obj3 instanceof Long) {
                        l2 = (Long) obj3;
                    } else {
                        l2 = null;
                    }
                    if (l2 != null) {
                        i6 = (int) l2.longValue();
                    }
                    prosAndConsModel.setValue(i6);
                    arrayList2.add(prosAndConsModel);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return arrayList2;
    }

    public static final ArrayList<ScreenResult10Model> result10MapToObject(Object obj) {
        ArrayList<HashMap> arrayList;
        Long l2;
        long timeInSeconds;
        String str;
        ArrayList<ScreenResult10Model> arrayList2 = new ArrayList<>();
        try {
            if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (HashMap hashMap : arrayList) {
                    ScreenResult10Model screenResult10Model = new ScreenResult10Model();
                    Object obj2 = hashMap.get("date");
                    if (obj2 instanceof Long) {
                        l2 = (Long) obj2;
                    } else {
                        l2 = null;
                    }
                    if (l2 != null) {
                        timeInSeconds = l2.longValue();
                    } else {
                        timeInSeconds = Utils.INSTANCE.getTimeInSeconds();
                    }
                    screenResult10Model.setDate(timeInSeconds);
                    Object obj3 = hashMap.get("text");
                    if (obj3 == null || (str = obj3.toString()) == null) {
                        str = "";
                    }
                    screenResult10Model.setText(str);
                    arrayList2.add(screenResult10Model);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return arrayList2;
    }

    public static final ScreenResult13Model result13MapToObject(Object obj) {
        HashMap hashMap;
        Long l2;
        long timeInSeconds;
        String str;
        Utils utils = Utils.INSTANCE;
        ScreenResult13Model screenResult13Model = new ScreenResult13Model(utils.getTimeInSeconds());
        try {
            String str2 = null;
            if (obj instanceof HashMap) {
                hashMap = (HashMap) obj;
            } else {
                hashMap = null;
            }
            if (hashMap != null) {
                Object obj2 = hashMap.get("date");
                if (obj2 instanceof Long) {
                    l2 = (Long) obj2;
                } else {
                    l2 = null;
                }
                if (l2 != null) {
                    timeInSeconds = l2.longValue();
                } else {
                    timeInSeconds = utils.getTimeInSeconds();
                }
                screenResult13Model.setDate(timeInSeconds);
                Object obj3 = hashMap.get("ans1");
                if (obj3 instanceof String) {
                    str = (String) obj3;
                } else {
                    str = null;
                }
                String str3 = "";
                if (str == null) {
                    str = "";
                }
                screenResult13Model.setAns1(str);
                Object obj4 = hashMap.get("ans2");
                if (obj4 instanceof String) {
                    str2 = (String) obj4;
                }
                if (str2 != null) {
                    str3 = str2;
                }
                screenResult13Model.setAns2(str3);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return screenResult13Model;
    }

    public static final ArrayList<ScreenResult14Model> result14ListMapToObject(Object obj) {
        ArrayList<HashMap> arrayList;
        Long l2;
        long timeInSeconds;
        String str;
        ArrayList<ScreenResult14Model> arrayList2 = new ArrayList<>();
        try {
            if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (HashMap hashMap : arrayList) {
                    Utils utils = Utils.INSTANCE;
                    ScreenResult14Model screenResult14Model = new ScreenResult14Model(utils.getTimeInSeconds(), "");
                    Object obj2 = hashMap.get("date");
                    if (obj2 instanceof Long) {
                        l2 = (Long) obj2;
                    } else {
                        l2 = null;
                    }
                    if (l2 != null) {
                        timeInSeconds = l2.longValue();
                    } else {
                        timeInSeconds = utils.getTimeInSeconds();
                    }
                    screenResult14Model.setDate(timeInSeconds);
                    Object obj3 = hashMap.get("statement");
                    if (obj3 instanceof String) {
                        str = (String) obj3;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    screenResult14Model.setStatement(str);
                    screenResult14Model.setPros(prosConsListMapToObject(hashMap.get("pros")));
                    screenResult14Model.setCons(prosConsListMapToObject(hashMap.get("cons")));
                    arrayList2.add(screenResult14Model);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return arrayList2;
    }

    public static final ScreenResult15Model result15MapToObject(Object obj) {
        HashMap hashMap;
        ScreenResult15Model screenResult15Model = new ScreenResult15Model(new ArrayList());
        try {
            ArrayList<String> arrayList = null;
            if (obj instanceof HashMap) {
                hashMap = (HashMap) obj;
            } else {
                hashMap = null;
            }
            if (hashMap != null) {
                Object obj2 = hashMap.get("list");
                if (obj2 instanceof ArrayList) {
                    arrayList = (ArrayList) obj2;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                screenResult15Model.setList(arrayList);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return screenResult15Model;
    }

    public static final ArrayList<ScreenResult16Model> result16MapToObject(Object obj) {
        ArrayList<HashMap> arrayList;
        Long l2;
        long timeInSeconds;
        Long l10;
        long timeInSeconds2;
        Long l11;
        long timeInSeconds3;
        ArrayList<String> arrayList2;
        ArrayList<ScreenResult16Model> arrayList3 = new ArrayList<>();
        try {
            if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (HashMap hashMap : arrayList) {
                    Utils utils = Utils.INSTANCE;
                    ScreenResult16Model screenResult16Model = new ScreenResult16Model(utils.getTimeInSeconds(), "");
                    Object obj2 = hashMap.get("date");
                    if (obj2 instanceof Long) {
                        l2 = (Long) obj2;
                    } else {
                        l2 = null;
                    }
                    if (l2 != null) {
                        timeInSeconds = l2.longValue();
                    } else {
                        timeInSeconds = utils.getTimeInSeconds();
                    }
                    screenResult16Model.setDate(timeInSeconds);
                    Object obj3 = hashMap.get("text");
                    screenResult16Model.setText((obj3 == null || (r6 = obj3.toString()) == null) ? "" : "");
                    Object obj4 = hashMap.get("fromTime");
                    if (obj4 instanceof Long) {
                        l10 = (Long) obj4;
                    } else {
                        l10 = null;
                    }
                    if (l10 != null) {
                        timeInSeconds2 = l10.longValue();
                    } else {
                        timeInSeconds2 = utils.getTimeInSeconds();
                    }
                    screenResult16Model.setFromTime(timeInSeconds2);
                    Object obj5 = hashMap.get("tillTime");
                    if (obj5 instanceof Long) {
                        l11 = (Long) obj5;
                    } else {
                        l11 = null;
                    }
                    if (l11 != null) {
                        timeInSeconds3 = l11.longValue();
                    } else {
                        timeInSeconds3 = utils.getTimeInSeconds();
                    }
                    screenResult16Model.setTillTime(timeInSeconds3);
                    Object obj6 = hashMap.get("list");
                    if (obj6 instanceof ArrayList) {
                        arrayList2 = (ArrayList) obj6;
                    } else {
                        arrayList2 = null;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    screenResult16Model.setList(arrayList2);
                    arrayList3.add(screenResult16Model);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return arrayList3;
    }

    public static final ScreenResult17Model result17MapToObject(HashMap<String, Object> data) {
        Long l2;
        String str;
        String str2;
        long j10;
        String str3;
        String str4;
        String str5;
        kotlin.jvm.internal.i.g(data, "data");
        Object obj = data.get("date");
        String str6 = null;
        if (obj instanceof Long) {
            l2 = (Long) obj;
        } else {
            l2 = null;
        }
        Object obj2 = data.get("text1");
        if (obj2 instanceof String) {
            str = (String) obj2;
        } else {
            str = null;
        }
        Object obj3 = data.get("text2");
        if (obj3 instanceof String) {
            str2 = (String) obj3;
        } else {
            str2 = null;
        }
        Object obj4 = data.get("text3");
        if (obj4 instanceof String) {
            str6 = (String) obj4;
        }
        if (l2 != null) {
            j10 = l2.longValue();
        } else {
            j10 = 0;
        }
        long j11 = j10;
        if (str == null) {
            str3 = "";
        } else {
            str3 = str;
        }
        if (str2 == null) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if (str6 == null) {
            str5 = "";
        } else {
            str5 = str6;
        }
        return new ScreenResult17Model(j11, str3, str4, str5);
    }

    public static final ArrayList<ScreenResult1Model> result1ListMapToObject(Object obj) {
        ArrayList<HashMap> arrayList;
        Long l2;
        long timeInSeconds;
        ArrayList<String> arrayList2;
        ArrayList<String> arrayList3;
        String str;
        ArrayList<ScreenResult1Model> arrayList4 = new ArrayList<>();
        try {
            if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (HashMap hashMap : arrayList) {
                    Utils utils = Utils.INSTANCE;
                    ScreenResult1Model screenResult1Model = new ScreenResult1Model(utils.getTimeInSeconds());
                    Object obj2 = hashMap.get("date");
                    if (obj2 instanceof Long) {
                        l2 = (Long) obj2;
                    } else {
                        l2 = null;
                    }
                    if (l2 != null) {
                        timeInSeconds = l2.longValue();
                    } else {
                        timeInSeconds = utils.getTimeInSeconds();
                    }
                    screenResult1Model.setDate(timeInSeconds);
                    Object obj3 = hashMap.get("list");
                    if (obj3 instanceof ArrayList) {
                        arrayList2 = (ArrayList) obj3;
                    } else {
                        arrayList2 = null;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    screenResult1Model.setList(arrayList2);
                    Object obj4 = hashMap.get("headings");
                    if (obj4 instanceof ArrayList) {
                        arrayList3 = (ArrayList) obj4;
                    } else {
                        arrayList3 = null;
                    }
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList<>();
                    }
                    screenResult1Model.setHeadings(arrayList3);
                    Object obj5 = hashMap.get("title");
                    if (obj5 instanceof String) {
                        str = (String) obj5;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    screenResult1Model.setTitle(str);
                    arrayList4.add(screenResult1Model);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return arrayList4;
    }

    public static final ArrayList<ScreenResult21Model> result21MapListToObject(Object obj) {
        ArrayList<HashMap> arrayList;
        Long l2;
        long timeInSeconds;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        ArrayList<ScreenResult21Model> arrayList2 = new ArrayList<>();
        try {
            if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (HashMap hashMap : arrayList) {
                    Utils utils = Utils.INSTANCE;
                    ScreenResult21Model screenResult21Model = new ScreenResult21Model(utils.getTimeInSeconds(), new ArrayList());
                    Object obj2 = hashMap.get("date");
                    if (obj2 instanceof Long) {
                        l2 = (Long) obj2;
                    } else {
                        l2 = null;
                    }
                    if (l2 != null) {
                        timeInSeconds = l2.longValue();
                    } else {
                        timeInSeconds = utils.getTimeInSeconds();
                    }
                    screenResult21Model.setDate(timeInSeconds);
                    screenResult21Model.setItems(urgentImportantMapListToObject(hashMap.get("items")));
                    Object obj3 = hashMap.get("desc1");
                    if (obj3 instanceof String) {
                        str = (String) obj3;
                    } else {
                        str = null;
                    }
                    String str10 = "";
                    if (str == null) {
                        str = "";
                    }
                    screenResult21Model.setDesc1(str);
                    Object obj4 = hashMap.get("desc2");
                    if (obj4 instanceof String) {
                        str2 = (String) obj4;
                    } else {
                        str2 = null;
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    screenResult21Model.setDesc2(str2);
                    Object obj5 = hashMap.get("desc3");
                    if (obj5 instanceof String) {
                        str3 = (String) obj5;
                    } else {
                        str3 = null;
                    }
                    if (str3 == null) {
                        str3 = "";
                    }
                    screenResult21Model.setDesc3(str3);
                    Object obj6 = hashMap.get("desc4");
                    if (obj6 instanceof String) {
                        str4 = (String) obj6;
                    } else {
                        str4 = null;
                    }
                    if (str4 == null) {
                        str4 = "";
                    }
                    screenResult21Model.setDesc4(str4);
                    Object obj7 = hashMap.get("heading1");
                    if (obj7 instanceof String) {
                        str5 = (String) obj7;
                    } else {
                        str5 = null;
                    }
                    if (str5 == null) {
                        str5 = "";
                    }
                    screenResult21Model.setHeading1(str5);
                    Object obj8 = hashMap.get("heading2");
                    if (obj8 instanceof String) {
                        str6 = (String) obj8;
                    } else {
                        str6 = null;
                    }
                    if (str6 == null) {
                        str6 = "";
                    }
                    screenResult21Model.setHeading2(str6);
                    Object obj9 = hashMap.get("heading3");
                    if (obj9 instanceof String) {
                        str7 = (String) obj9;
                    } else {
                        str7 = null;
                    }
                    if (str7 == null) {
                        str7 = "";
                    }
                    screenResult21Model.setHeading3(str7);
                    Object obj10 = hashMap.get("heading4");
                    if (obj10 instanceof String) {
                        str8 = (String) obj10;
                    } else {
                        str8 = null;
                    }
                    if (str8 == null) {
                        str8 = "";
                    }
                    screenResult21Model.setHeading4(str8);
                    Object obj11 = hashMap.get("title");
                    if (obj11 instanceof String) {
                        str9 = (String) obj11;
                    } else {
                        str9 = null;
                    }
                    if (str9 != null) {
                        str10 = str9;
                    }
                    screenResult21Model.setTitle(str10);
                    arrayList2.add(screenResult21Model);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return arrayList2;
    }

    public static final ArrayList<ScreenResult22Model> result22MapListToObject(Object obj) {
        ArrayList<HashMap> arrayList;
        Long l2;
        long timeInSeconds;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        ArrayList<ScreenResult22Model> arrayList2 = new ArrayList<>();
        try {
            if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (HashMap hashMap : arrayList) {
                    Utils utils = Utils.INSTANCE;
                    ScreenResult22Model screenResult22Model = new ScreenResult22Model(utils.getTimeInSeconds(), new ArrayList());
                    Object obj2 = hashMap.get("date");
                    if (obj2 instanceof Long) {
                        l2 = (Long) obj2;
                    } else {
                        l2 = null;
                    }
                    if (l2 != null) {
                        timeInSeconds = l2.longValue();
                    } else {
                        timeInSeconds = utils.getTimeInSeconds();
                    }
                    screenResult22Model.setDate(timeInSeconds);
                    screenResult22Model.setItems(taskIn2MinMapListToObject(hashMap.get("items")));
                    Object obj3 = hashMap.get("rememberLabel");
                    if (obj3 instanceof String) {
                        str = (String) obj3;
                    } else {
                        str = null;
                    }
                    String str7 = "";
                    if (str == null) {
                        str = "";
                    }
                    screenResult22Model.setRememberLabel(str);
                    Object obj4 = hashMap.get("rememberText1");
                    if (obj4 instanceof String) {
                        str2 = (String) obj4;
                    } else {
                        str2 = null;
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    screenResult22Model.setRememberText1(str2);
                    Object obj5 = hashMap.get("rememberText2");
                    if (obj5 instanceof String) {
                        str3 = (String) obj5;
                    } else {
                        str3 = null;
                    }
                    if (str3 == null) {
                        str3 = "";
                    }
                    screenResult22Model.setRememberText2(str3);
                    Object obj6 = hashMap.get("title1");
                    if (obj6 instanceof String) {
                        str4 = (String) obj6;
                    } else {
                        str4 = null;
                    }
                    if (str4 == null) {
                        str4 = "";
                    }
                    screenResult22Model.setTitle1(str4);
                    Object obj7 = hashMap.get("title2");
                    if (obj7 instanceof String) {
                        str5 = (String) obj7;
                    } else {
                        str5 = null;
                    }
                    if (str5 == null) {
                        str5 = "";
                    }
                    screenResult22Model.setTitle2(str5);
                    Object obj8 = hashMap.get("prefix");
                    if (obj8 instanceof String) {
                        str6 = (String) obj8;
                    } else {
                        str6 = null;
                    }
                    if (str6 != null) {
                        str7 = str6;
                    }
                    screenResult22Model.setPrefix(str7);
                    arrayList2.add(screenResult22Model);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return arrayList2;
    }

    public static final ArrayList<ScreenResult23Model> result23MapToObject(Object obj) {
        ArrayList<HashMap> arrayList;
        Long l2;
        long timeInSeconds;
        String str;
        Long l10;
        long j10;
        ArrayList<ScreenResult23Model> arrayList2 = new ArrayList<>();
        try {
            if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (HashMap hashMap : arrayList) {
                    Object obj2 = hashMap.get("date");
                    if (obj2 instanceof Long) {
                        l2 = (Long) obj2;
                    } else {
                        l2 = null;
                    }
                    if (l2 != null) {
                        timeInSeconds = l2.longValue();
                    } else {
                        timeInSeconds = Utils.INSTANCE.getTimeInSeconds();
                    }
                    long j11 = timeInSeconds;
                    Object obj3 = hashMap.get("task");
                    if (obj3 instanceof String) {
                        str = (String) obj3;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    String str2 = str;
                    Object obj4 = hashMap.get("state");
                    if (obj4 instanceof Long) {
                        l10 = (Long) obj4;
                    } else {
                        l10 = null;
                    }
                    if (l10 != null) {
                        j10 = l10.longValue();
                    } else {
                        j10 = 0;
                    }
                    arrayList2.add(new ScreenResult23Model(j11, str2, j10));
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return arrayList2;
    }

    public static final ScreenResult25Model result25MapToObject(Object obj) {
        HashMap hashMap;
        Long l2;
        long timeInSeconds;
        ArrayList<String> arrayList;
        Integer num;
        Utils utils = Utils.INSTANCE;
        ScreenResult25Model screenResult25Model = new ScreenResult25Model(utils.getTimeInSeconds());
        try {
            Integer num2 = null;
            if (obj instanceof HashMap) {
                hashMap = (HashMap) obj;
            } else {
                hashMap = null;
            }
            if (hashMap != null) {
                Object obj2 = hashMap.get("date");
                if (obj2 instanceof Long) {
                    l2 = (Long) obj2;
                } else {
                    l2 = null;
                }
                if (l2 != null) {
                    timeInSeconds = l2.longValue();
                } else {
                    timeInSeconds = utils.getTimeInSeconds();
                }
                screenResult25Model.setDate(timeInSeconds);
                Object obj3 = hashMap.get("list");
                if (obj3 instanceof ArrayList) {
                    arrayList = (ArrayList) obj3;
                } else {
                    arrayList = null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                screenResult25Model.setList(arrayList);
                Object obj4 = hashMap.get("sleepDuration");
                if (obj4 instanceof Integer) {
                    num = (Integer) obj4;
                } else {
                    num = null;
                }
                if (num == null) {
                    num = 0;
                }
                screenResult25Model.setSleepDuration(num);
                Object obj5 = hashMap.get("otherDuration");
                if (obj5 instanceof Integer) {
                    num2 = (Integer) obj5;
                }
                if (num2 == null) {
                    num2 = 0;
                }
                screenResult25Model.setOtherDuration(num2);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return screenResult25Model;
    }

    public static final ScreenResult26Model result26MapToObject(Object obj) {
        HashMap hashMap;
        Long l2;
        long timeInSeconds;
        String str;
        String str2;
        String str3;
        int i6;
        Utils utils = Utils.INSTANCE;
        ScreenResult26Model screenResult26Model = new ScreenResult26Model(utils.getTimeInSeconds());
        try {
            Long l10 = null;
            if (obj instanceof HashMap) {
                hashMap = (HashMap) obj;
            } else {
                hashMap = null;
            }
            if (hashMap != null) {
                Object obj2 = hashMap.get("date");
                if (obj2 instanceof Long) {
                    l2 = (Long) obj2;
                } else {
                    l2 = null;
                }
                if (l2 != null) {
                    timeInSeconds = l2.longValue();
                } else {
                    timeInSeconds = utils.getTimeInSeconds();
                }
                screenResult26Model.setDate(timeInSeconds);
                Object obj3 = hashMap.get("text");
                if (obj3 instanceof String) {
                    str = (String) obj3;
                } else {
                    str = null;
                }
                String str4 = "";
                if (str == null) {
                    str = "";
                }
                screenResult26Model.setText(str);
                Object obj4 = hashMap.get("sleepTime");
                if (obj4 instanceof String) {
                    str2 = (String) obj4;
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = "";
                }
                screenResult26Model.setSleepTime(str2);
                Object obj5 = hashMap.get("wakeUpTime");
                if (obj5 instanceof String) {
                    str3 = (String) obj5;
                } else {
                    str3 = null;
                }
                if (str3 != null) {
                    str4 = str3;
                }
                screenResult26Model.setWakeUpTime(str4);
                Object obj6 = hashMap.get("age");
                if (obj6 instanceof Long) {
                    l10 = (Long) obj6;
                }
                if (l10 != null) {
                    i6 = Integer.valueOf((int) l10.longValue());
                } else {
                    i6 = 0;
                }
                screenResult26Model.setAge(i6);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return screenResult26Model;
    }

    public static final ArrayList<ScreenResult28Model> result28MapListToObject(Object obj) {
        ArrayList<HashMap> arrayList;
        Long l2;
        long timeInSeconds;
        ArrayList<String> arrayList2;
        ArrayList<String> arrayList3;
        String str;
        ArrayList<ScreenResult28Model> arrayList4 = new ArrayList<>();
        try {
            if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (HashMap hashMap : arrayList) {
                    Utils utils = Utils.INSTANCE;
                    ScreenResult28Model screenResult28Model = new ScreenResult28Model(utils.getTimeInSeconds());
                    Object obj2 = hashMap.get("date");
                    if (obj2 instanceof Long) {
                        l2 = (Long) obj2;
                    } else {
                        l2 = null;
                    }
                    if (l2 != null) {
                        timeInSeconds = l2.longValue();
                    } else {
                        timeInSeconds = utils.getTimeInSeconds();
                    }
                    screenResult28Model.setDate(timeInSeconds);
                    Object obj3 = hashMap.get("answers");
                    if (obj3 instanceof ArrayList) {
                        arrayList2 = (ArrayList) obj3;
                    } else {
                        arrayList2 = null;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    screenResult28Model.setAnswers(arrayList2);
                    Object obj4 = hashMap.get("list");
                    if (obj4 instanceof ArrayList) {
                        arrayList3 = (ArrayList) obj4;
                    } else {
                        arrayList3 = null;
                    }
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList<>();
                    }
                    screenResult28Model.setList(arrayList3);
                    Object obj5 = hashMap.get("situation");
                    if (obj5 instanceof String) {
                        str = (String) obj5;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    screenResult28Model.setSituation(str);
                    arrayList4.add(screenResult28Model);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return arrayList4;
    }

    public static final ScreenResult2Model result2MapToObject(Object obj) {
        HashMap hashMap;
        Long l2;
        long timeInSeconds;
        ArrayList<String> arrayList;
        Utils utils = Utils.INSTANCE;
        ScreenResult2Model screenResult2Model = new ScreenResult2Model(utils.getTimeInSeconds());
        try {
            ArrayList<String> arrayList2 = null;
            if (obj instanceof HashMap) {
                hashMap = (HashMap) obj;
            } else {
                hashMap = null;
            }
            if (hashMap != null) {
                Object obj2 = hashMap.get("date");
                if (obj2 instanceof Long) {
                    l2 = (Long) obj2;
                } else {
                    l2 = null;
                }
                if (l2 != null) {
                    timeInSeconds = l2.longValue();
                } else {
                    timeInSeconds = utils.getTimeInSeconds();
                }
                screenResult2Model.setDate(timeInSeconds);
                Object obj3 = hashMap.get("list");
                if (obj3 instanceof ArrayList) {
                    arrayList = (ArrayList) obj3;
                } else {
                    arrayList = null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                screenResult2Model.setList(arrayList);
                Object obj4 = hashMap.get("userAdded");
                if (obj4 instanceof ArrayList) {
                    arrayList2 = (ArrayList) obj4;
                }
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                screenResult2Model.setUserAdded(arrayList2);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return screenResult2Model;
    }

    public static final ArrayList<ScreenResult30Model> result30MapToObject(Object obj) {
        ArrayList<HashMap> arrayList;
        Long l2;
        long timeInSeconds;
        ArrayList<String> arrayList2;
        ArrayList<ScreenResult30Model> arrayList3 = new ArrayList<>();
        try {
            if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (HashMap hashMap : arrayList) {
                    Utils utils = Utils.INSTANCE;
                    ScreenResult30Model screenResult30Model = new ScreenResult30Model(utils.getTimeInSeconds());
                    Object obj2 = hashMap.get("date");
                    if (obj2 instanceof Long) {
                        l2 = (Long) obj2;
                    } else {
                        l2 = null;
                    }
                    if (l2 != null) {
                        timeInSeconds = l2.longValue();
                    } else {
                        timeInSeconds = utils.getTimeInSeconds();
                    }
                    screenResult30Model.setDate(timeInSeconds);
                    Object obj3 = hashMap.get("list");
                    if (obj3 instanceof ArrayList) {
                        arrayList2 = (ArrayList) obj3;
                    } else {
                        arrayList2 = null;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    screenResult30Model.setList(arrayList2);
                    arrayList3.add(screenResult30Model);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return arrayList3;
    }

    public static final ArrayList<ScreenResult31Model> result31MapToObject(Object obj) {
        ArrayList<HashMap> arrayList;
        Long l2;
        long timeInSeconds;
        String str;
        String str2;
        ArrayList<ScreenResult31Model> arrayList2 = new ArrayList<>();
        try {
            if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (HashMap hashMap : arrayList) {
                    Utils utils = Utils.INSTANCE;
                    ScreenResult31Model screenResult31Model = new ScreenResult31Model(utils.getTimeInSeconds());
                    Object obj2 = hashMap.get("date");
                    if (obj2 instanceof Long) {
                        l2 = (Long) obj2;
                    } else {
                        l2 = null;
                    }
                    if (l2 != null) {
                        timeInSeconds = l2.longValue();
                    } else {
                        timeInSeconds = utils.getTimeInSeconds();
                    }
                    screenResult31Model.setDate(timeInSeconds);
                    Object obj3 = hashMap.get(SessionManager.KEY_NAME);
                    if (obj3 instanceof String) {
                        str = (String) obj3;
                    } else {
                        str = null;
                    }
                    String str3 = "";
                    if (str == null) {
                        str = "";
                    }
                    screenResult31Model.setName(str);
                    Object obj4 = hashMap.get("selection");
                    if (obj4 instanceof String) {
                        str2 = (String) obj4;
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        str3 = str2;
                    }
                    screenResult31Model.setSelection(str3);
                    arrayList2.add(screenResult31Model);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return arrayList2;
    }

    public static final ArrayList<ScreenResult3Model> result3ListMapToObject(Object obj) {
        ArrayList<HashMap> arrayList;
        Long l2;
        long timeInSeconds;
        ArrayList<String> arrayList2;
        ArrayList<ScreenResult3Model> arrayList3 = new ArrayList<>();
        try {
            if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (HashMap hashMap : arrayList) {
                    Utils utils = Utils.INSTANCE;
                    ScreenResult3Model screenResult3Model = new ScreenResult3Model(utils.getTimeInSeconds());
                    Object obj2 = hashMap.get("date");
                    if (obj2 instanceof Long) {
                        l2 = (Long) obj2;
                    } else {
                        l2 = null;
                    }
                    if (l2 != null) {
                        timeInSeconds = l2.longValue();
                    } else {
                        timeInSeconds = utils.getTimeInSeconds();
                    }
                    screenResult3Model.setDate(timeInSeconds);
                    Object obj3 = hashMap.get("list");
                    if (obj3 instanceof ArrayList) {
                        arrayList2 = (ArrayList) obj3;
                    } else {
                        arrayList2 = null;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    screenResult3Model.setList(arrayList2);
                    arrayList3.add(screenResult3Model);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return arrayList3;
    }

    public static final ScreenResult3Model result3MapToObject(Object obj) {
        long timeInSeconds;
        ArrayList<String> arrayList;
        Utils utils = Utils.INSTANCE;
        ScreenResult3Model screenResult3Model = new ScreenResult3Model(utils.getTimeInSeconds());
        try {
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Any> }");
            HashMap hashMap = (HashMap) obj;
            if (hashMap.containsKey("date")) {
                Object obj2 = hashMap.get("date");
                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.Long");
                timeInSeconds = ((Long) obj2).longValue();
            } else {
                timeInSeconds = utils.getTimeInSeconds();
            }
            screenResult3Model.setDate(timeInSeconds);
            if (hashMap.containsKey("list")) {
                Object obj3 = hashMap.get("list");
                kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                arrayList = (ArrayList) obj3;
            } else {
                arrayList = new ArrayList<>();
            }
            screenResult3Model.setList(arrayList);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return screenResult3Model;
    }

    public static final ArrayList<ScreenResult4Model> result4ListMapToObject(Object obj) {
        ArrayList<HashMap> arrayList;
        Long l2;
        long timeInSeconds;
        String str;
        ArrayList<ScreenResult4Model> arrayList2 = new ArrayList<>();
        try {
            if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (HashMap hashMap : arrayList) {
                    Utils utils = Utils.INSTANCE;
                    ScreenResult4Model screenResult4Model = new ScreenResult4Model(utils.getTimeInSeconds());
                    Object obj2 = hashMap.get("date");
                    if (obj2 instanceof Long) {
                        l2 = (Long) obj2;
                    } else {
                        l2 = null;
                    }
                    if (l2 != null) {
                        timeInSeconds = l2.longValue();
                    } else {
                        timeInSeconds = utils.getTimeInSeconds();
                    }
                    screenResult4Model.setDate(timeInSeconds);
                    Object obj3 = hashMap.get("text");
                    if (obj3 instanceof String) {
                        str = (String) obj3;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    screenResult4Model.setText(str);
                    arrayList2.add(screenResult4Model);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return arrayList2;
    }

    public static final ScreenResult4Model result4MapToObject(Object obj) {
        HashMap hashMap;
        Long l2;
        long timeInSeconds;
        Utils utils = Utils.INSTANCE;
        ScreenResult4Model screenResult4Model = new ScreenResult4Model(utils.getTimeInSeconds());
        try {
            String str = null;
            if (obj instanceof HashMap) {
                hashMap = (HashMap) obj;
            } else {
                hashMap = null;
            }
            if (hashMap != null) {
                Object obj2 = hashMap.get("date");
                if (obj2 instanceof Long) {
                    l2 = (Long) obj2;
                } else {
                    l2 = null;
                }
                if (l2 != null) {
                    timeInSeconds = l2.longValue();
                } else {
                    timeInSeconds = utils.getTimeInSeconds();
                }
                screenResult4Model.setDate(timeInSeconds);
                Object obj3 = hashMap.get("text");
                if (obj3 instanceof String) {
                    str = (String) obj3;
                }
                if (str == null) {
                    str = "";
                }
                screenResult4Model.setText(str);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return screenResult4Model;
    }

    public static final ArrayList<ScreenResult6Model> result6MapToObject(Object obj) {
        ArrayList<HashMap> arrayList;
        Long l2;
        long timeInSeconds;
        ArrayList<String> arrayList2;
        ArrayList<ScreenResult6Model> arrayList3 = new ArrayList<>();
        try {
            if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (HashMap hashMap : arrayList) {
                    Utils utils = Utils.INSTANCE;
                    ScreenResult6Model screenResult6Model = new ScreenResult6Model(utils.getTimeInSeconds());
                    Object obj2 = hashMap.get("date");
                    if (obj2 instanceof Long) {
                        l2 = (Long) obj2;
                    } else {
                        l2 = null;
                    }
                    if (l2 != null) {
                        timeInSeconds = l2.longValue();
                    } else {
                        timeInSeconds = utils.getTimeInSeconds();
                    }
                    screenResult6Model.setDate(timeInSeconds);
                    Object obj3 = hashMap.get("list");
                    if (obj3 instanceof ArrayList) {
                        arrayList2 = (ArrayList) obj3;
                    } else {
                        arrayList2 = null;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    screenResult6Model.setList(arrayList2);
                    arrayList3.add(screenResult6Model);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return arrayList3;
    }

    public static final ScreenResult7Model result7MapToObject(Object obj) {
        HashMap hashMap;
        Long l2;
        long timeInSeconds;
        ArrayList<String> arrayList;
        ArrayList<String> arrayList2;
        Utils utils = Utils.INSTANCE;
        ScreenResult7Model screenResult7Model = new ScreenResult7Model(utils.getTimeInSeconds());
        try {
            ArrayList<String> arrayList3 = null;
            if (obj instanceof HashMap) {
                hashMap = (HashMap) obj;
            } else {
                hashMap = null;
            }
            if (hashMap != null) {
                Object obj2 = hashMap.get("date");
                if (obj2 instanceof Long) {
                    l2 = (Long) obj2;
                } else {
                    l2 = null;
                }
                if (l2 != null) {
                    timeInSeconds = l2.longValue();
                } else {
                    timeInSeconds = utils.getTimeInSeconds();
                }
                screenResult7Model.setDate(timeInSeconds);
                Object obj3 = hashMap.get("headings");
                if (obj3 instanceof ArrayList) {
                    arrayList = (ArrayList) obj3;
                } else {
                    arrayList = null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                screenResult7Model.setHeadings(arrayList);
                Object obj4 = hashMap.get("list");
                if (obj4 instanceof ArrayList) {
                    arrayList2 = (ArrayList) obj4;
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                screenResult7Model.setList(arrayList2);
                Object obj5 = hashMap.get("userAdded");
                if (obj5 instanceof ArrayList) {
                    arrayList3 = (ArrayList) obj5;
                }
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList<>();
                }
                screenResult7Model.setUserAdded(arrayList3);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return screenResult7Model;
    }

    public static final ScreenResult8Model result8MapToObject(Object obj) {
        HashMap hashMap;
        Long l2;
        long timeInSeconds;
        ArrayList<String> arrayList;
        Utils utils = Utils.INSTANCE;
        ScreenResult8Model screenResult8Model = new ScreenResult8Model(utils.getTimeInSeconds());
        try {
            ArrayList<String> arrayList2 = null;
            if (obj instanceof HashMap) {
                hashMap = (HashMap) obj;
            } else {
                hashMap = null;
            }
            if (hashMap != null) {
                Object obj2 = hashMap.get("date");
                if (obj2 instanceof Long) {
                    l2 = (Long) obj2;
                } else {
                    l2 = null;
                }
                if (l2 != null) {
                    timeInSeconds = l2.longValue();
                } else {
                    timeInSeconds = utils.getTimeInSeconds();
                }
                screenResult8Model.setDate(timeInSeconds);
                Object obj3 = hashMap.get("list");
                if (obj3 instanceof ArrayList) {
                    arrayList = (ArrayList) obj3;
                } else {
                    arrayList = null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                screenResult8Model.setList(arrayList);
                Object obj4 = hashMap.get("userAdded");
                if (obj4 instanceof ArrayList) {
                    arrayList2 = (ArrayList) obj4;
                }
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                screenResult8Model.setUserAdded(arrayList2);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return screenResult8Model;
    }

    public static final ArrayList<ScreenResult9Model> result9MapToObject(Object obj) {
        ArrayList<HashMap> arrayList;
        Long l2;
        long timeInSeconds;
        ArrayList<String> arrayList2;
        ArrayList<ScreenResult9Model> arrayList3 = new ArrayList<>();
        try {
            if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (HashMap hashMap : arrayList) {
                    Utils utils = Utils.INSTANCE;
                    ScreenResult9Model screenResult9Model = new ScreenResult9Model(utils.getTimeInSeconds());
                    Object obj2 = hashMap.get("date");
                    if (obj2 instanceof Long) {
                        l2 = (Long) obj2;
                    } else {
                        l2 = null;
                    }
                    if (l2 != null) {
                        timeInSeconds = l2.longValue();
                    } else {
                        timeInSeconds = utils.getTimeInSeconds();
                    }
                    screenResult9Model.setDate(timeInSeconds);
                    Object obj3 = hashMap.get("list");
                    if (obj3 instanceof ArrayList) {
                        arrayList2 = (ArrayList) obj3;
                    } else {
                        arrayList2 = null;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    screenResult9Model.setList(arrayList2);
                    arrayList3.add(screenResult9Model);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return arrayList3;
    }

    public static final ArrayList<ScreenResultGoodthingsModel> resultGoodThingsNewMapToObject(Object obj) {
        ArrayList<HashMap> arrayList;
        Long l2;
        long timeInSeconds;
        String str;
        String str2;
        String str3;
        ArrayList<ScreenResultGoodthingsModel> arrayList2 = new ArrayList<>();
        try {
            if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (HashMap hashMap : arrayList) {
                    Utils utils = Utils.INSTANCE;
                    ScreenResultGoodthingsModel screenResultGoodthingsModel = new ScreenResultGoodthingsModel(utils.getTimeInSeconds());
                    Object obj2 = hashMap.get("date");
                    if (obj2 instanceof Long) {
                        l2 = (Long) obj2;
                    } else {
                        l2 = null;
                    }
                    if (l2 != null) {
                        timeInSeconds = l2.longValue();
                    } else {
                        timeInSeconds = utils.getTimeInSeconds();
                    }
                    screenResultGoodthingsModel.setDate(timeInSeconds);
                    Object obj3 = hashMap.get("goodThingOne");
                    if (obj3 instanceof String) {
                        str = (String) obj3;
                    } else {
                        str = null;
                    }
                    String str4 = "";
                    if (str == null) {
                        str = "";
                    }
                    screenResultGoodthingsModel.setGoodThingOne(str);
                    Object obj4 = hashMap.get("goodThingTwo");
                    if (obj4 instanceof String) {
                        str2 = (String) obj4;
                    } else {
                        str2 = null;
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    screenResultGoodthingsModel.setGoodThingTwo(str2);
                    Object obj5 = hashMap.get("goodThingThree");
                    if (obj5 instanceof String) {
                        str3 = (String) obj5;
                    } else {
                        str3 = null;
                    }
                    if (str3 != null) {
                        str4 = str3;
                    }
                    screenResultGoodthingsModel.setGoodThingThree(str4);
                    arrayList2.add(screenResultGoodthingsModel);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return arrayList2;
    }

    public static final ArrayList<ScreenResultGratitudeModel> resultGratitudeMapToObject(Object obj) {
        ArrayList<HashMap> arrayList;
        Long l2;
        long timeInSeconds;
        ArrayList<String> arrayList2;
        ArrayList<ScreenResultGratitudeModel> arrayList3 = new ArrayList<>();
        try {
            if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (HashMap hashMap : arrayList) {
                    Utils utils = Utils.INSTANCE;
                    ScreenResultGratitudeModel screenResultGratitudeModel = new ScreenResultGratitudeModel(utils.getTimeInSeconds());
                    Object obj2 = hashMap.get("date");
                    if (obj2 instanceof Long) {
                        l2 = (Long) obj2;
                    } else {
                        l2 = null;
                    }
                    if (l2 != null) {
                        timeInSeconds = l2.longValue();
                    } else {
                        timeInSeconds = utils.getTimeInSeconds();
                    }
                    screenResultGratitudeModel.setDate(timeInSeconds);
                    Object obj3 = hashMap.get("list");
                    if (obj3 instanceof ArrayList) {
                        arrayList2 = (ArrayList) obj3;
                    } else {
                        arrayList2 = null;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    screenResultGratitudeModel.setList(arrayList2);
                    arrayList3.add(screenResultGratitudeModel);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return arrayList3;
    }

    public static final ArrayList<ScreenResultGroundingModel> resultGroundingMapToObject(Object obj) {
        ArrayList<HashMap> arrayList;
        Long l2;
        long timeInSeconds;
        String str;
        ArrayList<String> arrayList2;
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        ArrayList<String> arrayList5;
        String str2;
        ArrayList<ScreenResultGroundingModel> arrayList6 = new ArrayList<>();
        try {
            if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (HashMap hashMap : arrayList) {
                    Utils utils = Utils.INSTANCE;
                    ScreenResultGroundingModel screenResultGroundingModel = new ScreenResultGroundingModel(utils.getTimeInSeconds());
                    Object obj2 = hashMap.get("date");
                    if (obj2 instanceof Long) {
                        l2 = (Long) obj2;
                    } else {
                        l2 = null;
                    }
                    if (l2 != null) {
                        timeInSeconds = l2.longValue();
                    } else {
                        timeInSeconds = utils.getTimeInSeconds();
                    }
                    screenResultGroundingModel.setDate(timeInSeconds);
                    Object obj3 = hashMap.get("location");
                    if (obj3 instanceof String) {
                        str = (String) obj3;
                    } else {
                        str = null;
                    }
                    String str3 = "";
                    if (str == null) {
                        str = "";
                    }
                    screenResultGroundingModel.setLocation(str);
                    Object obj4 = hashMap.get("seeList");
                    if (obj4 instanceof ArrayList) {
                        arrayList2 = (ArrayList) obj4;
                    } else {
                        arrayList2 = null;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    screenResultGroundingModel.setSeeList(arrayList2);
                    Object obj5 = hashMap.get("feelList");
                    if (obj5 instanceof ArrayList) {
                        arrayList3 = (ArrayList) obj5;
                    } else {
                        arrayList3 = null;
                    }
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList<>();
                    }
                    screenResultGroundingModel.setFeelList(arrayList3);
                    Object obj6 = hashMap.get("hearList");
                    if (obj6 instanceof ArrayList) {
                        arrayList4 = (ArrayList) obj6;
                    } else {
                        arrayList4 = null;
                    }
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList<>();
                    }
                    screenResultGroundingModel.setHearList(arrayList4);
                    Object obj7 = hashMap.get("smellList");
                    if (obj7 instanceof ArrayList) {
                        arrayList5 = (ArrayList) obj7;
                    } else {
                        arrayList5 = null;
                    }
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList<>();
                    }
                    screenResultGroundingModel.setSmellList(arrayList5);
                    Object obj8 = hashMap.get(Constants.GOAL_TYPE_THOUGHT);
                    if (obj8 instanceof String) {
                        str2 = (String) obj8;
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        str3 = str2;
                    }
                    screenResultGroundingModel.setThought(str3);
                    arrayList6.add(screenResultGroundingModel);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return arrayList6;
    }

    public static final ArrayList<ScreenResultPleasurableModel> resultPleasurableNewMapToObject(Object obj) {
        ArrayList<HashMap> arrayList;
        Long l2;
        long timeInSeconds;
        String str;
        ArrayList<ScreenResultPleasurableModel> arrayList2 = new ArrayList<>();
        try {
            if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (HashMap hashMap : arrayList) {
                    Utils utils = Utils.INSTANCE;
                    ScreenResultPleasurableModel screenResultPleasurableModel = new ScreenResultPleasurableModel(utils.getTimeInSeconds());
                    Object obj2 = hashMap.get("date");
                    if (obj2 instanceof Long) {
                        l2 = (Long) obj2;
                    } else {
                        l2 = null;
                    }
                    if (l2 != null) {
                        timeInSeconds = l2.longValue();
                    } else {
                        timeInSeconds = utils.getTimeInSeconds();
                    }
                    screenResultPleasurableModel.setDate(timeInSeconds);
                    Object obj3 = hashMap.get("letter");
                    if (obj3 instanceof String) {
                        str = (String) obj3;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    screenResultPleasurableModel.setLetter(str);
                    arrayList2.add(screenResultPleasurableModel);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return arrayList2;
    }

    public static final ArrayList<ScreenResultPositiveQualities> resultPositiveQualitiesMapToObject(Object obj) {
        ArrayList<HashMap> arrayList;
        Long l2;
        long timeInSeconds;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        ArrayList<ScreenResultPositiveQualities> arrayList2 = new ArrayList<>();
        try {
            if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (HashMap hashMap : arrayList) {
                    Utils utils = Utils.INSTANCE;
                    ScreenResultPositiveQualities screenResultPositiveQualities = new ScreenResultPositiveQualities(utils.getTimeInSeconds());
                    Object obj2 = hashMap.get("date");
                    if (obj2 instanceof Long) {
                        l2 = (Long) obj2;
                    } else {
                        l2 = null;
                    }
                    if (l2 != null) {
                        timeInSeconds = l2.longValue();
                    } else {
                        timeInSeconds = utils.getTimeInSeconds();
                    }
                    screenResultPositiveQualities.setDate(timeInSeconds);
                    Object obj3 = hashMap.get("qualityOne");
                    if (obj3 instanceof String) {
                        str = (String) obj3;
                    } else {
                        str = null;
                    }
                    String str7 = "";
                    if (str == null) {
                        str = "";
                    }
                    screenResultPositiveQualities.setQualityOne(str);
                    Object obj4 = hashMap.get("qualityTwo");
                    if (obj4 instanceof String) {
                        str2 = (String) obj4;
                    } else {
                        str2 = null;
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    screenResultPositiveQualities.setQualityTwo(str2);
                    Object obj5 = hashMap.get("placeOne");
                    if (obj5 instanceof String) {
                        str3 = (String) obj5;
                    } else {
                        str3 = null;
                    }
                    if (str3 == null) {
                        str3 = "";
                    }
                    screenResultPositiveQualities.setPlaceOne(str3);
                    Object obj6 = hashMap.get("placeTwo");
                    if (obj6 instanceof String) {
                        str4 = (String) obj6;
                    } else {
                        str4 = null;
                    }
                    if (str4 == null) {
                        str4 = "";
                    }
                    screenResultPositiveQualities.setPlaceTwo(str4);
                    Object obj7 = hashMap.get("taskOne");
                    if (obj7 instanceof String) {
                        str5 = (String) obj7;
                    } else {
                        str5 = null;
                    }
                    if (str5 == null) {
                        str5 = "";
                    }
                    screenResultPositiveQualities.setTaskOne(str5);
                    Object obj8 = hashMap.get("taskTwo");
                    if (obj8 instanceof String) {
                        str6 = (String) obj8;
                    } else {
                        str6 = null;
                    }
                    if (str6 != null) {
                        str7 = str6;
                    }
                    screenResultPositiveQualities.setTaskTwo(str7);
                    arrayList2.add(screenResultPositiveQualities);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return arrayList2;
    }

    public static final ArrayList<ScreenResultThoughtsModel> resultThoughtsNewMapToObject(Object obj) {
        ArrayList<HashMap> arrayList;
        Long l2;
        long timeInSeconds;
        String str;
        ArrayList<String> arrayList2;
        String str2;
        ArrayList<ScreenResultThoughtsModel> arrayList3 = new ArrayList<>();
        try {
            if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (HashMap hashMap : arrayList) {
                    Utils utils = Utils.INSTANCE;
                    ScreenResultThoughtsModel screenResultThoughtsModel = new ScreenResultThoughtsModel(utils.getTimeInSeconds());
                    Object obj2 = hashMap.get("date");
                    if (obj2 instanceof Long) {
                        l2 = (Long) obj2;
                    } else {
                        l2 = null;
                    }
                    if (l2 != null) {
                        timeInSeconds = l2.longValue();
                    } else {
                        timeInSeconds = utils.getTimeInSeconds();
                    }
                    screenResultThoughtsModel.setDate(timeInSeconds);
                    Object obj3 = hashMap.get("situation");
                    if (obj3 instanceof String) {
                        str = (String) obj3;
                    } else {
                        str = null;
                    }
                    String str3 = "";
                    if (str == null) {
                        str = "";
                    }
                    screenResultThoughtsModel.setSituation(str);
                    Object obj4 = hashMap.get("feelings");
                    if (obj4 instanceof ArrayList) {
                        arrayList2 = (ArrayList) obj4;
                    } else {
                        arrayList2 = null;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    screenResultThoughtsModel.setFeelings(arrayList2);
                    Object obj5 = hashMap.get(Constants.SCREEN_THOUGHTS);
                    if (obj5 instanceof String) {
                        str2 = (String) obj5;
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        str3 = str2;
                    }
                    screenResultThoughtsModel.setThoughts(str3);
                    arrayList3.add(screenResultThoughtsModel);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return arrayList3;
    }

    public static final ArrayList<TaskIn2Min> taskIn2MinMapListToObject(Object obj) {
        ArrayList<HashMap> arrayList;
        String str;
        Boolean bool;
        ArrayList<TaskIn2Min> arrayList2 = new ArrayList<>();
        try {
            if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (HashMap hashMap : arrayList) {
                    boolean z10 = false;
                    TaskIn2Min taskIn2Min = new TaskIn2Min("", false);
                    Object obj2 = hashMap.get("text");
                    if (obj2 instanceof String) {
                        str = (String) obj2;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    taskIn2Min.setText(str);
                    Object obj3 = hashMap.get("in2Min");
                    if (obj3 instanceof Boolean) {
                        bool = (Boolean) obj3;
                    } else {
                        bool = null;
                    }
                    if (bool != null) {
                        z10 = bool.booleanValue();
                    }
                    taskIn2Min.setIn2Min(z10);
                    arrayList2.add(taskIn2Min);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return arrayList2;
    }

    public static final ArrayList<UrgentImportantModel> urgentImportantMapListToObject(Object obj) {
        ArrayList<HashMap> arrayList;
        String str;
        Boolean bool;
        boolean z10;
        Boolean bool2;
        ArrayList<UrgentImportantModel> arrayList2 = new ArrayList<>();
        try {
            if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (HashMap hashMap : arrayList) {
                    boolean z11 = false;
                    UrgentImportantModel urgentImportantModel = new UrgentImportantModel("", false, false);
                    Object obj2 = hashMap.get("text");
                    if (obj2 instanceof String) {
                        str = (String) obj2;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    urgentImportantModel.setText(str);
                    Object obj3 = hashMap.get("urgent");
                    if (obj3 instanceof Boolean) {
                        bool = (Boolean) obj3;
                    } else {
                        bool = null;
                    }
                    if (bool != null) {
                        z10 = bool.booleanValue();
                    } else {
                        z10 = false;
                    }
                    urgentImportantModel.setUrgent(z10);
                    Object obj4 = hashMap.get("important");
                    if (obj4 instanceof Boolean) {
                        bool2 = (Boolean) obj4;
                    } else {
                        bool2 = null;
                    }
                    if (bool2 != null) {
                        z11 = bool2.booleanValue();
                    }
                    urgentImportantModel.setImportant(z11);
                    arrayList2.add(urgentImportantModel);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTILFUN, "exception", e10);
        }
        return arrayList2;
    }
}
