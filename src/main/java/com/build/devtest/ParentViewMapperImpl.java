package com.build.devtest;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class ParentViewMapperImpl implements ParentViewMapper
{
	public List<ParentView> mapRowsToViews(List<ParentRow> parentRows, List<ChildRow> childRows)
	{
		List<ParentView> mappedView = new ArrayList<ParentView>();
		for(ParentRow parent : parentRows)
		{
			List<ChildView> childViewList = new ArrayList<ChildView>();
			ParentView parentViewObj = new ParentView(parent.getFirstName(), parent.getLastName(), parent.getAge(), parent.getParentId(), childViewList);
			String parentid = parent.getParentId();
			for(ChildRow child : childRows)
			{
				if(parentid.toUpperCase().equals(child.getParentId()))
				{
					ChildView childViewObj = new ChildView(child.getFirstName(), child.getLastName(), child.getAge(), child.getChildId(), parentViewObj);
					childViewList.add(childViewObj);
				}
			}
			parentViewObj.setChildViews(childViewList);
			mappedView.add(parentViewObj);
		}
		return mappedView;
	}
}
