// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model;

import ai.verta.modeldb.versioning.*;
import ai.verta.modeldb.versioning.blob.diff.*;
import com.pholser.junit.quickcheck.generator.*;
import com.pholser.junit.quickcheck.generator.java.util.*;
import com.pholser.junit.quickcheck.random.*;
import java.util.*;

public class DatasetDiffGen extends Generator<DatasetDiff> {
  public DatasetDiffGen() {
    super(DatasetDiff.class);
  }

  @Override
  public DatasetDiff generate(SourceOfRandomness r, GenerationStatus status) {
    // if (r.nextBoolean())
    //     return null;

    DatasetDiff obj = new DatasetDiff();
    if (r.nextBoolean()) {
      obj.setS3(Utils.removeEmpty(gen().type(S3DatasetDiff.class).generate(r, status)));
    }
    if (r.nextBoolean()) {
      obj.setPath(Utils.removeEmpty(gen().type(PathDatasetDiff.class).generate(r, status)));
    }
    return obj;
  }
}