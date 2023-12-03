package com.theinnerhour.b2b.network.model;

import com.appsflyer.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import tf.b;
/* compiled from: TelecommunicationsHomeworkNotificationResponseModel.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005¢\u0006\u0002\u0010\u0006J\u001d\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R*\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/theinnerhour/b2b/network/model/TelecommunicationsHomeworkNotificationResponseModel;", "", "notificationList", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/network/model/TelecommunicationHomeworkNotification;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getNotificationList", "()Ljava/util/ArrayList;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class TelecommunicationsHomeworkNotificationResponseModel {
    @b("data")
    private final ArrayList<TelecommunicationHomeworkNotification> notificationList;

    public TelecommunicationsHomeworkNotificationResponseModel(ArrayList<TelecommunicationHomeworkNotification> arrayList) {
        this.notificationList = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TelecommunicationsHomeworkNotificationResponseModel copy$default(TelecommunicationsHomeworkNotificationResponseModel telecommunicationsHomeworkNotificationResponseModel, ArrayList arrayList, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            arrayList = telecommunicationsHomeworkNotificationResponseModel.notificationList;
        }
        return telecommunicationsHomeworkNotificationResponseModel.copy(arrayList);
    }

    public final ArrayList<TelecommunicationHomeworkNotification> component1() {
        return this.notificationList;
    }

    public final TelecommunicationsHomeworkNotificationResponseModel copy(ArrayList<TelecommunicationHomeworkNotification> arrayList) {
        return new TelecommunicationsHomeworkNotificationResponseModel(arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof TelecommunicationsHomeworkNotificationResponseModel) && i.b(this.notificationList, ((TelecommunicationsHomeworkNotificationResponseModel) obj).notificationList)) {
            return true;
        }
        return false;
    }

    public final ArrayList<TelecommunicationHomeworkNotification> getNotificationList() {
        return this.notificationList;
    }

    public int hashCode() {
        ArrayList<TelecommunicationHomeworkNotification> arrayList = this.notificationList;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    public String toString() {
        return "TelecommunicationsHomeworkNotificationResponseModel(notificationList=" + this.notificationList + ')';
    }
}
