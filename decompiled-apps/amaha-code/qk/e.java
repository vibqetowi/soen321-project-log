package qk;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.chat.activity.CoachChatActivity;
import com.theinnerhour.b2b.components.chat.model.ChatMessage;
import com.theinnerhour.b2b.components.chat.model.ChatUser;
import com.theinnerhour.b2b.utils.Utils;
import ik.j1;
import java.util.ArrayList;
/* compiled from: CoachChatAdapter.java */
/* loaded from: classes2.dex */
public final class e extends RecyclerView.e<a> {
    public final b A;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<ChatMessage> f29649x;

    /* renamed from: y  reason: collision with root package name */
    public final ChatUser f29650y;

    /* renamed from: z  reason: collision with root package name */
    public final Context f29651z;

    /* compiled from: CoachChatAdapter.java */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final TextView f29652u;

        /* renamed from: v  reason: collision with root package name */
        public final TextView f29653v;

        /* renamed from: w  reason: collision with root package name */
        public final AppCompatImageView f29654w;

        public a(View view) {
            super(view);
            this.f29652u = (TextView) view.findViewById(R.id.txt_msg);
            this.f29653v = (TextView) view.findViewById(R.id.msgDate);
            this.f29654w = (AppCompatImageView) view.findViewById(R.id.btnDownload);
        }
    }

    /* compiled from: CoachChatAdapter.java */
    /* loaded from: classes2.dex */
    public interface b {
        void C();
    }

    public e(ArrayList arrayList, ChatUser chatUser, CoachChatActivity coachChatActivity) {
        this.f29649x = arrayList;
        this.f29650y = chatUser;
        this.f29651z = coachChatActivity;
        this.A = coachChatActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f29649x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int h(int i6) {
        ChatMessage chatMessage = this.f29649x.get(i6);
        if (chatMessage != null && chatMessage.getSend_by_user_id().equals(this.f29650y.getKey())) {
            return 2;
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        a aVar2 = aVar;
        ChatMessage chatMessage = this.f29649x.get(i6);
        Spanned fromHtml = Html.fromHtml("&#x25cf; &#x25cf; &#x25cf;");
        TextView textView = aVar2.f29652u;
        textView.setText(fromHtml);
        aVar2.f29653v.setText(Utils.INSTANCE.getStringTimeStamp12HourFormat(chatMessage.getTime_stamp() * 1000));
        boolean equals = chatMessage.getMessage_type().equals("Text");
        AppCompatImageView appCompatImageView = aVar2.f29654w;
        if (equals) {
            appCompatImageView.setVisibility(8);
            textView.setText(chatMessage.getMessage());
        } else {
            appCompatImageView.setVisibility(0);
            textView.setText(this.f29651z.getString(R.string.attachment));
        }
        appCompatImageView.setOnClickListener(new j1(this, 3, chatMessage));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View view;
        LayoutInflater from = LayoutInflater.from(recyclerView.getContext());
        if (i6 == 1) {
            view = from.inflate(R.layout.coach_chat_left, (ViewGroup) recyclerView, false);
        } else if (i6 == 2) {
            view = from.inflate(R.layout.coach_chat_right, (ViewGroup) recyclerView, false);
        } else {
            view = null;
        }
        return new a(view);
    }
}
