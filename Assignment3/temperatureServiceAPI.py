class ServiceAPI:

    def __init__(self):
        self.formatted_temperature_object = ""
        self.base_url = "https://api.openweathermap.org/data/2.5/weather?appid=77dde4d032c4ec1284a674d90b1351e3"
        self.formatted_url = ""

    # UI --> ServiceAPI: Pass desired parameters to format URL for System Core
    #def format_url(self,url_parameters):
    #    import temperatureSystemCore as temperature
    #    currentTemperatureInstance = temperature.Temperature()
    #    self.formatted_url = self.base_url + "&q=" + formatted_url



    # SystemCore --> ServiceAPI: Format temperature object for UI
    def format_temperature_object(self,temperature_json):
        #print(temperature_json)
        print("In temperatureServiceAPI - format_temperature_object")

        import temperatureSystemCore as temperature
        current_temperature_instance = temperature.Temperature()
        current_temperature_instance.longtitude = temperature_json['coord']['lon']
        current_temperature_instance.latitude = temperature_json['coord']['lat']

        # Weather #
        current_weather = temperature_json['weather'][0]
        current_temperature_instance.weather_overview = current_weather['main']
        current_temperature_instance.weather_description = current_weather['description']

        # Temperature #
        temperature_main = temperature_json['main']
        current_temperature_instance.current_temperature = temperature_main['temp']
        current_temperature_instance.current_feels_like = temperature_main['feels_like']
        current_temperature_instance.current_min = temperature_main['temp_min']
        current_temperature_instance.current_max = temperature_main['temp_max']

        current_temperature_instance.current_time = temperature_json['dt']
        #print("current_time: " + str(formatted_obj.current_time))
        current_temperature_instance.current_city = temperature_json['name']
        self.formatted_temperature_object = current_temperature_instance

    def format_time(self):
        from datetime import datetime
        print("Current Time Zone [ISO 8601 Time Representation]")
        print(self.formatted_temperature_object.current_time)
        print(datetime.fromtimestamp(self.formatted_temperature_object.current_time))
        print("")
