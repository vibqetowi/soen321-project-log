package kotlin.io.path;

import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.FileSystemLoopException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttributeView;
/* compiled from: D8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class PathTreeWalk$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ Class m() {
        return BasicFileAttributes.class;
    }

    public static /* bridge */ /* synthetic */ DirectoryStream m(Object obj) {
        return (DirectoryStream) obj;
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ FileSystemException m8488m(Object obj) {
        return (FileSystemException) obj;
    }

    public static /* synthetic */ FileSystemException m(String str) {
        return new FileSystemException(str);
    }

    public static /* synthetic */ FileSystemException m(String str, String str2, String str3) {
        return new FileSystemException(str, str2, str3);
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* synthetic */ FileSystemLoopException m8489m(String str) {
        return new FileSystemLoopException(str);
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ FileVisitResult m8492m(Object obj) {
        return (FileVisitResult) obj;
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ FileVisitor m8493m(Object obj) {
        return (FileVisitor) obj;
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* synthetic */ NoSuchFileException m8494m(String str, String str2, String str3) {
        return new NoSuchFileException(str, str2, str3);
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Path m8495m(Object obj) {
        return (Path) obj;
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ SecureDirectoryStream m8498m(Object obj) {
        return (SecureDirectoryStream) obj;
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ BasicFileAttributeView m8501m(Object obj) {
        return (BasicFileAttributeView) obj;
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ BasicFileAttributes m8502m(Object obj) {
        return (BasicFileAttributes) obj;
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ FileAttributeView m8503m(Object obj) {
        return (FileAttributeView) obj;
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* synthetic */ void m8507m() {
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ boolean m8509m(Object obj) {
        return obj instanceof SecureDirectoryStream;
    }

    public static /* bridge */ /* synthetic */ Class m$1() {
        return BasicFileAttributeView.class;
    }

    /* renamed from: m$1  reason: collision with other method in class */
    public static /* synthetic */ void m8517m$1() {
    }

    public static /* bridge */ /* synthetic */ Class m$2() {
        return FileAttributeView.class;
    }

    /* renamed from: m$2  reason: collision with other method in class */
    public static /* synthetic */ void m8521m$2() {
    }
}
