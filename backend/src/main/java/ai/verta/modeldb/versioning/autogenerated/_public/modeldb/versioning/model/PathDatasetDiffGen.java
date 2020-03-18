// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model;

import ai.verta.modeldb.versioning.*;
import ai.verta.modeldb.versioning.blob.diff.*;
import com.pholser.junit.quickcheck.generator.*;
import com.pholser.junit.quickcheck.generator.java.util.*;
import com.pholser.junit.quickcheck.random.*;
import java.util.*;

public class PathDatasetDiffGen extends Generator<PathDatasetDiff> {
  public PathDatasetDiffGen() {
    super(PathDatasetDiff.class);
  }

  @Override
  public PathDatasetDiff generate(SourceOfRandomness r, GenerationStatus status) {
    // if (r.nextBoolean())
    //     return null;

    PathDatasetDiff obj = new PathDatasetDiff();
    if (r.nextBoolean()) {
      int size = r.nextInt(0, 10);
      List<PathDatasetComponentDiff> ret = new ArrayList(size);
      for (int i = 0; i < size; i++) {
        ret.add(gen().type(PathDatasetComponentDiff.class).generate(r, status));
      }
      obj.setComponents(Utils.removeEmpty(ret));
    }
    return obj;
  }
}
