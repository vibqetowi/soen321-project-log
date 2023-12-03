package com.theinnerhour.b2b.network.model;

import com.appsflyer.R;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import tf.b;
/* compiled from: UpcomingSessionsModel.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005¢\u0006\u0002\u0010\u0006J\u001d\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R2\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/theinnerhour/b2b/network/model/SuggestedSessionsResponseModel;", "Ljava/io/Serializable;", "suggestedBooking", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/network/model/SuggestedBooking;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getSuggestedBooking", "()Ljava/util/ArrayList;", "setSuggestedBooking", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class SuggestedSessionsResponseModel implements Serializable {
    @b("suggested_bookings")
    private ArrayList<SuggestedBooking> suggestedBooking;

    public SuggestedSessionsResponseModel(ArrayList<SuggestedBooking> arrayList) {
        this.suggestedBooking = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SuggestedSessionsResponseModel copy$default(SuggestedSessionsResponseModel suggestedSessionsResponseModel, ArrayList arrayList, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            arrayList = suggestedSessionsResponseModel.suggestedBooking;
        }
        return suggestedSessionsResponseModel.copy(arrayList);
    }

    public final ArrayList<SuggestedBooking> component1() {
        return this.suggestedBooking;
    }

    public final SuggestedSessionsResponseModel copy(ArrayList<SuggestedBooking> arrayList) {
        return new SuggestedSessionsResponseModel(arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SuggestedSessionsResponseModel) && i.b(this.suggestedBooking, ((SuggestedSessionsResponseModel) obj).suggestedBooking)) {
            return true;
        }
        return false;
    }

    public final ArrayList<SuggestedBooking> getSuggestedBooking() {
        return this.suggestedBooking;
    }

    public int hashCode() {
        ArrayList<SuggestedBooking> arrayList = this.suggestedBooking;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    public final void setSuggestedBooking(ArrayList<SuggestedBooking> arrayList) {
        this.suggestedBooking = arrayList;
    }

    public String toString() {
        return "SuggestedSessionsResponseModel(suggestedBooking=" + this.suggestedBooking + ')';
    }
}
