package com.vivek.user.illnessdector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump_One {
    public static HashMap<String, List<String>> getData() {
    HashMap<String, List<String>> expandableListDetail1 = new HashMap<String, List<String>>();

    List<String> cricket = new ArrayList<String>();
    cricket.add("Indiaa");
    cricket.add("Pakistannn");
    cricket.add("Australiaaaa");
    cricket.add("England");
    cricket.add("South Africa");

    List<String> football = new ArrayList<String>();
    football.add("Brazil");
    football.add("Spain");
    football.add("Germany");
    football.add("Netherlands");
    football.add("Italy");

    List<String> basketball = new ArrayList<String>();
    basketball.add("United States");
    basketball.add("Spain");
    basketball.add("Argentina");
    basketball.add("France");
    basketball.add("Russia");

    expandableListDetail1.put("CRICKET TEAMS", cricket);
    expandableListDetail1.put("FOOTBALL TEAMS", football);
    expandableListDetail1.put("BASKETBALL TEAMS", basketball);
    return expandableListDetail1;
}
}