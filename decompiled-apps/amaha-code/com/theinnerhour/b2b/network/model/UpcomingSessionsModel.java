package com.theinnerhour.b2b.network.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import sf.m;
import tf.b;
/* compiled from: UpcomingSessionsModel.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000b¢\u0006\u0004\b-\u0010.J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u001d\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000bHÆ\u0003JM\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u001c\b\u0002\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000bHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003R(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R6\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/theinnerhour/b2b/network/model/UpcomingSessionsModel;", "Ljava/io/Serializable;", "", "Lcom/theinnerhour/b2b/network/model/UpcomingBooking;", "component1", "Lsf/m;", "component2", "", "component3", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/network/model/SuggestedBooking;", "Lkotlin/collections/ArrayList;", "component4", "bookings", "customer", "message", "suggestedBooking", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/util/List;", "getBookings", "()Ljava/util/List;", "setBookings", "(Ljava/util/List;)V", "Lsf/m;", "getCustomer", "()Lsf/m;", "setCustomer", "(Lsf/m;)V", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "Ljava/util/ArrayList;", "getSuggestedBooking", "()Ljava/util/ArrayList;", "setSuggestedBooking", "(Ljava/util/ArrayList;)V", "<init>", "(Ljava/util/List;Lsf/m;Ljava/lang/String;Ljava/util/ArrayList;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class UpcomingSessionsModel implements Serializable {
    @b("bookings")
    private List<UpcomingBooking> bookings;
    @b("customer")
    private m customer;
    @b("message")
    private String message;
    @b("suggested_bookings")
    private ArrayList<SuggestedBooking> suggestedBooking;

    public UpcomingSessionsModel(List<UpcomingBooking> bookings, m customer, String str, ArrayList<SuggestedBooking> arrayList) {
        i.g(bookings, "bookings");
        i.g(customer, "customer");
        this.bookings = bookings;
        this.customer = customer;
        this.message = str;
        this.suggestedBooking = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpcomingSessionsModel copy$default(UpcomingSessionsModel upcomingSessionsModel, List list, m mVar, String str, ArrayList arrayList, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            list = upcomingSessionsModel.bookings;
        }
        if ((i6 & 2) != 0) {
            mVar = upcomingSessionsModel.customer;
        }
        if ((i6 & 4) != 0) {
            str = upcomingSessionsModel.message;
        }
        if ((i6 & 8) != 0) {
            arrayList = upcomingSessionsModel.suggestedBooking;
        }
        return upcomingSessionsModel.copy(list, mVar, str, arrayList);
    }

    public final List<UpcomingBooking> component1() {
        return this.bookings;
    }

    public final m component2() {
        return this.customer;
    }

    public final String component3() {
        return this.message;
    }

    public final ArrayList<SuggestedBooking> component4() {
        return this.suggestedBooking;
    }

    public final UpcomingSessionsModel copy(List<UpcomingBooking> bookings, m customer, String str, ArrayList<SuggestedBooking> arrayList) {
        i.g(bookings, "bookings");
        i.g(customer, "customer");
        return new UpcomingSessionsModel(bookings, customer, str, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpcomingSessionsModel)) {
            return false;
        }
        UpcomingSessionsModel upcomingSessionsModel = (UpcomingSessionsModel) obj;
        if (i.b(this.bookings, upcomingSessionsModel.bookings) && i.b(this.customer, upcomingSessionsModel.customer) && i.b(this.message, upcomingSessionsModel.message) && i.b(this.suggestedBooking, upcomingSessionsModel.suggestedBooking)) {
            return true;
        }
        return false;
    }

    public final List<UpcomingBooking> getBookings() {
        return this.bookings;
    }

    public final m getCustomer() {
        return this.customer;
    }

    public final String getMessage() {
        return this.message;
    }

    public final ArrayList<SuggestedBooking> getSuggestedBooking() {
        return this.suggestedBooking;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.customer.hashCode() + (this.bookings.hashCode() * 31)) * 31;
        String str = this.message;
        int i6 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode2 + hashCode) * 31;
        ArrayList<SuggestedBooking> arrayList = this.suggestedBooking;
        if (arrayList != null) {
            i6 = arrayList.hashCode();
        }
        return i10 + i6;
    }

    public final void setBookings(List<UpcomingBooking> list) {
        i.g(list, "<set-?>");
        this.bookings = list;
    }

    public final void setCustomer(m mVar) {
        i.g(mVar, "<set-?>");
        this.customer = mVar;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setSuggestedBooking(ArrayList<SuggestedBooking> arrayList) {
        this.suggestedBooking = arrayList;
    }

    public String toString() {
        return "UpcomingSessionsModel(bookings=" + this.bookings + ", customer=" + this.customer + ", message=" + this.message + ", suggestedBooking=" + this.suggestedBooking + ')';
    }
}
