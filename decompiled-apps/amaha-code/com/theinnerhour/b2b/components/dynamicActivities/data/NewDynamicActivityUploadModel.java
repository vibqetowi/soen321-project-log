package com.theinnerhour.b2b.components.dynamicActivities.data;

import android.graphics.Bitmap;
import hs.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import pl.a;
/* compiled from: NewDynamicActivityUploadModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00070\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\u001b\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00070\u0006HÆ\u0003JC\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\u001a\b\u0002\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00070\u0006HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R)\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/theinnerhour/b2b/components/dynamicActivities/data/NewDynamicActivityUploadModel;", "", "", "component1", "component2", "component3", "", "Lhs/f;", "Landroid/graphics/Bitmap;", "component4", "screenSlug", "screenId", "screenDataKey", "bitmapList", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getScreenSlug", "()Ljava/lang/String;", "getScreenId", "getScreenDataKey", "Ljava/util/List;", "getBitmapList", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class NewDynamicActivityUploadModel {
    private final List<f<String, Bitmap>> bitmapList;
    private final String screenDataKey;
    private final String screenId;
    private final String screenSlug;

    public NewDynamicActivityUploadModel(String screenSlug, String screenId, String screenDataKey, List<f<String, Bitmap>> bitmapList) {
        i.g(screenSlug, "screenSlug");
        i.g(screenId, "screenId");
        i.g(screenDataKey, "screenDataKey");
        i.g(bitmapList, "bitmapList");
        this.screenSlug = screenSlug;
        this.screenId = screenId;
        this.screenDataKey = screenDataKey;
        this.bitmapList = bitmapList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewDynamicActivityUploadModel copy$default(NewDynamicActivityUploadModel newDynamicActivityUploadModel, String str, String str2, String str3, List list, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = newDynamicActivityUploadModel.screenSlug;
        }
        if ((i6 & 2) != 0) {
            str2 = newDynamicActivityUploadModel.screenId;
        }
        if ((i6 & 4) != 0) {
            str3 = newDynamicActivityUploadModel.screenDataKey;
        }
        if ((i6 & 8) != 0) {
            list = newDynamicActivityUploadModel.bitmapList;
        }
        return newDynamicActivityUploadModel.copy(str, str2, str3, list);
    }

    public final String component1() {
        return this.screenSlug;
    }

    public final String component2() {
        return this.screenId;
    }

    public final String component3() {
        return this.screenDataKey;
    }

    public final List<f<String, Bitmap>> component4() {
        return this.bitmapList;
    }

    public final NewDynamicActivityUploadModel copy(String screenSlug, String screenId, String screenDataKey, List<f<String, Bitmap>> bitmapList) {
        i.g(screenSlug, "screenSlug");
        i.g(screenId, "screenId");
        i.g(screenDataKey, "screenDataKey");
        i.g(bitmapList, "bitmapList");
        return new NewDynamicActivityUploadModel(screenSlug, screenId, screenDataKey, bitmapList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewDynamicActivityUploadModel)) {
            return false;
        }
        NewDynamicActivityUploadModel newDynamicActivityUploadModel = (NewDynamicActivityUploadModel) obj;
        if (i.b(this.screenSlug, newDynamicActivityUploadModel.screenSlug) && i.b(this.screenId, newDynamicActivityUploadModel.screenId) && i.b(this.screenDataKey, newDynamicActivityUploadModel.screenDataKey) && i.b(this.bitmapList, newDynamicActivityUploadModel.bitmapList)) {
            return true;
        }
        return false;
    }

    public final List<f<String, Bitmap>> getBitmapList() {
        return this.bitmapList;
    }

    public final String getScreenDataKey() {
        return this.screenDataKey;
    }

    public final String getScreenId() {
        return this.screenId;
    }

    public final String getScreenSlug() {
        return this.screenSlug;
    }

    public int hashCode() {
        return this.bitmapList.hashCode() + a.c(this.screenDataKey, a.c(this.screenId, this.screenSlug.hashCode() * 31, 31), 31);
    }

    public String toString() {
        return "NewDynamicActivityUploadModel(screenSlug=" + this.screenSlug + ", screenId=" + this.screenId + ", screenDataKey=" + this.screenDataKey + ", bitmapList=" + this.bitmapList + ')';
    }
}
