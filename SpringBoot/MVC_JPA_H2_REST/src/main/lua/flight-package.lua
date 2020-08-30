function origin_and_time(stream, orig, start, stop)

	local function map_flight(record)
		return record
	end

    local function origin(record, orig)
        return record.ORIGIN == orig
    end
    
    local function period(record, start, stop)
    	return (record.DEP_TIME >= start and record.ARR_TIME <= stop)
    end

    return stream : filter(origin, orig)  : map(map_flight)
end