# Google Weather, Time & Calculator Agent

A simple agent built with Google's Agent Development Kit (ADK) that can answer questions about weather and time for specific cities, as well as perform basic math operations.

## Overview

This project implements a conversational agent using Google's Gemini model that can:
- Provide weather information for a city
- Tell the current time in a city
- Perform basic math operations (addition, subtraction, multiplication)

Currently, the agent is set up to handle queries for New York, but it can be extended to support additional locations.

## Prerequisites

- Python 3.8+
- Google API Key

## Installation

1. Clone this repository
```bash
git clone <repository-url>
cd google_agent
```

2. Create a virtual environment and activate it
```bash
python -m venv .venv
source .venv/bin/activate  # On Windows: .venv\Scripts\activate
```

3. Install the required packages
```bash
pip install google-adk dotenv python-dotenv
```

4. Set up your environment variables
Create a `.env` file in the root directory with the following content:
```
GOOGLE_GENAI_USE_VERTEXAI="False"
GOOGLE_API_KEY="your-google-api-key"
```

## Usage

Import the agent in your Python code:

```python
from google_agent import root_agent

# Run the agent
response = root_agent.run("What's the weather in New York?")
print(response)

# Or for time queries
response = root_agent.run("What time is it in New York?")
print(response)

# For math operations
response = root_agent.run("What is 15 + 27?")
print(response)
response = root_agent.run("Multiply 8 and 12")
print(response)
```

## Features

- **Weather Information**: Get current weather conditions for supported cities
- **Time Information**: Get current local time for supported cities
- **Math Operations**: Perform basic calculations like addition, subtraction, and multiplication
- **Extensible**: Easy to add support for more cities and additional functionalities

## Project Structure

- `agent.py` - Main implementation of the agent with tool functions
- `__init__.py` - Exports the root agent for easy import
- `.env` - Environment variables file (not tracked in git)

## Limitations

Currently, the agent only has hardcoded data for New York. To add support for more cities, you would need to:
1. Extend the city checks in the `get_weather` and `get_current_time` functions
2. Add the appropriate timezone identifiers
3. For real weather data, consider integrating with a weather API

## License

[MIT License](LICENSE)