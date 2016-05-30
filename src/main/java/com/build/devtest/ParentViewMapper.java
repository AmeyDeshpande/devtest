package com.build.devtest;

import java.util.List;

public interface ParentViewMapper {

	List<ParentView> mapRowsToViews(List<ParentRow> parentRows, List<ChildRow> childRows);
}

