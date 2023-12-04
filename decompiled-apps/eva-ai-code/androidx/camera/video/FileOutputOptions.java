package androidx.camera.video;

import androidx.camera.video.AutoValue_FileOutputOptions_FileOutputOptionsInternal;
import androidx.camera.video.OutputOptions;
import androidx.core.util.Preconditions;
import java.io.File;
/* loaded from: classes.dex */
public final class FileOutputOptions extends OutputOptions {
    private final FileOutputOptionsInternal mFileOutputOptionsInternal;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class FileOutputOptionsInternal {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static abstract class Builder {
            abstract FileOutputOptionsInternal build();

            abstract Builder setFile(File file);

            abstract Builder setFileSizeLimit(long j);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract File getFile();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract long getFileSizeLimit();
    }

    FileOutputOptions(FileOutputOptionsInternal fileOutputOptionsInternal) {
        Preconditions.checkNotNull(fileOutputOptionsInternal, "FileOutputOptionsInternal can't be null.");
        this.mFileOutputOptionsInternal = fileOutputOptionsInternal;
    }

    public File getFile() {
        return this.mFileOutputOptionsInternal.getFile();
    }

    @Override // androidx.camera.video.OutputOptions
    public long getFileSizeLimit() {
        return this.mFileOutputOptionsInternal.getFileSizeLimit();
    }

    public String toString() {
        return this.mFileOutputOptionsInternal.toString().replaceFirst("FileOutputOptionsInternal", "FileOutputOptions");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FileOutputOptions) {
            return this.mFileOutputOptionsInternal.equals(((FileOutputOptions) obj).mFileOutputOptionsInternal);
        }
        return false;
    }

    public int hashCode() {
        return this.mFileOutputOptionsInternal.hashCode();
    }

    /* loaded from: classes.dex */
    public static final class Builder implements OutputOptions.Builder<FileOutputOptions, Builder> {
        private final FileOutputOptionsInternal.Builder mInternalBuilder;

        public Builder(File file) {
            FileOutputOptionsInternal.Builder fileSizeLimit = new AutoValue_FileOutputOptions_FileOutputOptionsInternal.Builder().setFileSizeLimit(0L);
            this.mInternalBuilder = fileSizeLimit;
            Preconditions.checkNotNull(file, "File can't be null.");
            fileSizeLimit.setFile(file);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.Builder
        public Builder setFileSizeLimit(long j) {
            this.mInternalBuilder.setFileSizeLimit(j);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.Builder
        public FileOutputOptions build() {
            return new FileOutputOptions(this.mInternalBuilder.build());
        }
    }
}
