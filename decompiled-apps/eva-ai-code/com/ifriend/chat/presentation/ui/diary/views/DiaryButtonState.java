package com.ifriend.chat.presentation.ui.diary.views;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DiaryButtonState.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/views/DiaryButtonState;", "", "BackToChat", "Initial", "Loading", "OpenSecretNote", "TextBot", "Lcom/ifriend/chat/presentation/ui/diary/views/DiaryButtonState$BackToChat;", "Lcom/ifriend/chat/presentation/ui/diary/views/DiaryButtonState$Initial;", "Lcom/ifriend/chat/presentation/ui/diary/views/DiaryButtonState$Loading;", "Lcom/ifriend/chat/presentation/ui/diary/views/DiaryButtonState$OpenSecretNote;", "Lcom/ifriend/chat/presentation/ui/diary/views/DiaryButtonState$TextBot;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DiaryButtonState {

    /* compiled from: DiaryButtonState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/views/DiaryButtonState$Initial;", "Lcom/ifriend/chat/presentation/ui/diary/views/DiaryButtonState;", "()V", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Initial implements DiaryButtonState {
        public static final int $stable = 0;
        public static final Initial INSTANCE = new Initial();

        private Initial() {
        }
    }

    /* compiled from: DiaryButtonState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/views/DiaryButtonState$TextBot;", "Lcom/ifriend/chat/presentation/ui/diary/views/DiaryButtonState;", "text", "", "(Ljava/lang/CharSequence;)V", "getText", "()Ljava/lang/CharSequence;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class TextBot implements DiaryButtonState {
        public static final int $stable = 8;
        private final CharSequence text;

        public TextBot(CharSequence text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }

        public final CharSequence getText() {
            return this.text;
        }
    }

    /* compiled from: DiaryButtonState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/views/DiaryButtonState$BackToChat;", "Lcom/ifriend/chat/presentation/ui/diary/views/DiaryButtonState;", "text", "", "(Ljava/lang/CharSequence;)V", "getText", "()Ljava/lang/CharSequence;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BackToChat implements DiaryButtonState {
        public static final int $stable = 8;
        private final CharSequence text;

        public BackToChat(CharSequence text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }

        public final CharSequence getText() {
            return this.text;
        }
    }

    /* compiled from: DiaryButtonState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/views/DiaryButtonState$OpenSecretNote;", "Lcom/ifriend/chat/presentation/ui/diary/views/DiaryButtonState;", "text", "", "(Ljava/lang/CharSequence;)V", "getText", "()Ljava/lang/CharSequence;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class OpenSecretNote implements DiaryButtonState {
        public static final int $stable = 8;
        private final CharSequence text;

        public OpenSecretNote(CharSequence text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }

        public final CharSequence getText() {
            return this.text;
        }
    }

    /* compiled from: DiaryButtonState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/views/DiaryButtonState$Loading;", "Lcom/ifriend/chat/presentation/ui/diary/views/DiaryButtonState;", "()V", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Loading implements DiaryButtonState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }
}
