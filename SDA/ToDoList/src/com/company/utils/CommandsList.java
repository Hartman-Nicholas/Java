package com.company.utils;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class CommandsList implements Serializable {

    private final Map<String, WeekCommandsEnum> commandList = new HashMap<>();
    @Serial
    private final static long serialVersionUID = 5L;



    public CommandsList() {

        commandList.put("MON", WeekCommandsEnum.MONDAY);
        commandList.put("TUE", WeekCommandsEnum.TUESDAY);
        commandList.put("WED", WeekCommandsEnum.WEDNESDAY);
        commandList.put("THUR", WeekCommandsEnum.THURSDAY);
        commandList.put("FRI", WeekCommandsEnum.FRIDAY);
        commandList.put("SAT", WeekCommandsEnum.SATURDAY);
        commandList.put("SUN", WeekCommandsEnum.SUNDAY);

        commandList.put("TUES", WeekCommandsEnum.TUESDAY);
        commandList.put("THURS", WeekCommandsEnum.THURSDAY);

        commandList.put("MONDAY", WeekCommandsEnum.MONDAY);
        commandList.put("TUESDAY", WeekCommandsEnum.TUESDAY);
        commandList.put("WEDNESDAY", WeekCommandsEnum.WEDNESDAY);
        commandList.put("THURSDAY", WeekCommandsEnum.THURSDAY);
        commandList.put("FRIDAY", WeekCommandsEnum.FRIDAY);
        commandList.put("SATURDAY", WeekCommandsEnum.SATURDAY);
        commandList.put("SUNDAY", WeekCommandsEnum.SUNDAY);

        commandList.put("TUSDAY", WeekCommandsEnum.TUESDAY);
        commandList.put("WEDESDAY", WeekCommandsEnum.WEDNESDAY);
        commandList.put("THURDAY", WeekCommandsEnum.THURSDAY);
        commandList.put("SATUDAY", WeekCommandsEnum.SATURDAY);

        commandList.put("MÅN", WeekCommandsEnum.MONDAY);
        commandList.put("TIS", WeekCommandsEnum.TUESDAY);
        commandList.put("ONS", WeekCommandsEnum.WEDNESDAY);
        commandList.put("TORS", WeekCommandsEnum.THURSDAY);
        commandList.put("FRE", WeekCommandsEnum.FRIDAY);
        commandList.put("LÖR", WeekCommandsEnum.SATURDAY);
        commandList.put("SÖN", WeekCommandsEnum.SUNDAY);

        commandList.put("MÅNDAG", WeekCommandsEnum.MONDAY);
        commandList.put("TISDAG", WeekCommandsEnum.TUESDAY);
        commandList.put("ONSDAG", WeekCommandsEnum.WEDNESDAY);
        commandList.put("TORSDAG", WeekCommandsEnum.THURSDAY);
        commandList.put("FREDAG", WeekCommandsEnum.FRIDAY);
        commandList.put("LÖRDAG", WeekCommandsEnum.SATURDAY);
        commandList.put("SÖNDAG", WeekCommandsEnum.SUNDAY);

        commandList.put("MAN", WeekCommandsEnum.MONDAY);
        commandList.put("LOR", WeekCommandsEnum.SATURDAY);
        commandList.put("SON", WeekCommandsEnum.SUNDAY);

        commandList.put("MANDAG", WeekCommandsEnum.MONDAY);
        commandList.put("LORDAG", WeekCommandsEnum.SATURDAY);
        commandList.put("SONDAG", WeekCommandsEnum.SUNDAY);

    }

    public WeekCommandsEnum getCommandWord (String command) {
        return commandList.get(command.toUpperCase());
    }



   




    
}
